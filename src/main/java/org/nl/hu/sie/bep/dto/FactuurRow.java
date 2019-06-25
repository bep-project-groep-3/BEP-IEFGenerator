package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.business.filesaving.EditRows;
import org.nl.hu.sie.bep.domain.domain.Factuur;
import org.nl.hu.sie.bep.domain.domain.FactuurRegel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class FactuurRow extends Row {
  public enum BtwType {
    GEEN,
    LAAG,
    HOOG
  }

  public FactuurRow() {
    super(RowType.FACTUURREGEL);
  }

  private String productOmschrijving;
  private double aantal;
  private double prijsPerStuk;
  private BtwType btwType;
  private Date regelDatum;
  private String eenheid;

  public void convert(Factuur factuur, FactuurRegel factuurRegel) {
    aantal = factuurRegel.getHoeveelheid();
    prijsPerStuk = factuurRegel.getTotaalprijs() / factuurRegel.getHoeveelheid();
    btwType = convertBtwCodeToBtwType(factuurRegel.getBTWCode());
    regelDatum = factuur.getDatumtijd();
    eenheid = factuurRegel.getEenheid();
    productOmschrijving = factuurRegel.getProductnaam();
  }

  private BtwType convertBtwCodeToBtwType(String btwType) {
    if (btwType.equals("G")) {
      return BtwType.GEEN;
    } else if (btwType.equals("L")) {
      return BtwType.LAAG;
    }
    return BtwType.HOOG;
  }

  @Override
  public boolean equals(Object otherFactuurRow) {
    if (this == otherFactuurRow) return true;
    if (otherFactuurRow == null || getClass() != otherFactuurRow.getClass()) return false;
    FactuurRow that = (FactuurRow) otherFactuurRow;

    return productOmschrijving.equals(that.getProductOmschrijving())
        && aantal == that.getAantal()
        && prijsPerStuk == that.getPrijsPerStuk()
        && btwType.equals(that.getBtwType())
        && regelDatum.compareTo(that.getRegelDatum()) == 0
        && eenheid.equals(that.getEenheid());
  }

  @Override
  public int hashCode() {
    return Objects.hash(productOmschrijving, aantal, prijsPerStuk, btwType, regelDatum, eenheid);
  }

  public String getProductOmschrijving() {
    return productOmschrijving;
  }

  public void setProductOmschrijving(String productOmschrijving) {
    this.productOmschrijving = productOmschrijving;
  }

  public double getAantal() {
    return aantal;
  }

  public void setAantal(double aantal) {
    this.aantal = aantal;
  }

  public double getPrijsPerStuk() {
    return prijsPerStuk;
  }

  public void setPrijsPerStuk(double prijsPerStuk) {
    this.prijsPerStuk = prijsPerStuk;
  }

  public BtwType getBtwType() {
    return btwType;
  }

  public void setBtwType(BtwType btwType) {
    this.btwType = btwType;
  }

  public Date getRegelDatum() {
    return regelDatum;
  }

  public void setRegelDatum(Date regelDatum) {
    this.regelDatum = regelDatum;
  }

  public String getEenheid() {
    return eenheid;
  }

  public void setEenheid(String eenheid) {
    this.eenheid = eenheid;
  }

  @Override
  public String toString() {
    return "FactuurRow{"
        + "productOmschrijving='"
        + productOmschrijving
        + '\''
        + ", aantal="
        + aantal
        + ", prijsPerStuk="
        + prijsPerStuk
        + ", btwType="
        + btwType
        + ", regelDatum="
        + regelDatum
        + ", eenheid='"
        + eenheid
        + '\''
        + '}';
  }

  @Override
  public String getText() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(
        "R"
            + EditRows.editString(productOmschrijving, 60)
            + EditRows.editDouble(aantal, 5)
            + EditRows.editDouble(prijsPerStuk, 7)
            + EditRows.editBTWtype(btwType)
            + EditRows.editDate(regelDatum)
            + EditRows.editString(eenheid, 6)
            + "\n");
    if (productOmschrijving.length() <= 60) {
      return stringBuilder.toString();
    }

    stringBuilder.append(getTextRows(productOmschrijving));
    return stringBuilder.toString();
  }

  public String getTextRows(String productOmschrijving) {
    List<String> regels = new ArrayList<>();
    List<String> productOmschrijvingStrings = EditRows.knipProductomschrijving(productOmschrijving);

    for (int i = 1; i < productOmschrijvingStrings.size(); i++) {
      regels.add(addMultipleTextRows(productOmschrijvingStrings.get(i)));
    }
    StringBuilder stringBuilder = new StringBuilder();

    for (String string : regels) {

      stringBuilder.append(string);
    }
    return stringBuilder.toString();
  }

  private String addMultipleTextRows(String row) {
    return "T" + row + "\n";
  }
}

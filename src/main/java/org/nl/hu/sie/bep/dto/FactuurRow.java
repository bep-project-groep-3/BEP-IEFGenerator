package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.external.domain.Factuur;
import org.nl.hu.sie.bep.external.domain.FactuurRegel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactuurRow extends Row {

  private static final int DESCRIPTION_LENGTH = 60;
  private static final int DESCRIPTION_INFO_LENGTH = 120;

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
  private List<TekstRow> tekstRegels;

  public void convert(Factuur factuur, FactuurRegel factuurRegel) {
    aantal = factuurRegel.getHoeveelheid();
    prijsPerStuk = factuurRegel.getTotaalprijs() / factuurRegel.getHoeveelheid();
    btwType = convertBtwCodeToBtwType(factuurRegel.getBTWCode());
    regelDatum = factuur.getDatumtijd();
    eenheid = factuurRegel.getEenheid();

    tekstRegels = new ArrayList<>();
    if (factuurRegel.getProductnaam().length() <= DESCRIPTION_LENGTH) {
      productOmschrijving = factuurRegel.getProductnaam();
    } else {
      productOmschrijving = factuurRegel.getProductnaam().substring(0, DESCRIPTION_LENGTH);

      String descriptionForRows = factuurRegel.getProductnaam().substring(DESCRIPTION_LENGTH);

      for (int i = 0; i < descriptionForRows.length() / (double) DESCRIPTION_INFO_LENGTH; i++) {
        TekstRow tekstRow = new TekstRow();

        int substringStartIndex = i * DESCRIPTION_INFO_LENGTH;
        int substringEndIndex =
            substringStartIndex + DESCRIPTION_INFO_LENGTH > descriptionForRows.length()
                ? descriptionForRows.length()
                : substringStartIndex + DESCRIPTION_INFO_LENGTH;

        tekstRow.convert(descriptionForRows.substring(substringStartIndex, substringEndIndex));
        tekstRegels.add(tekstRow);
      }
    }
  }

  private BtwType convertBtwCodeToBtwType(char btwType) {
    if (btwType == 'G') {
      return BtwType.GEEN;
    } else if (btwType == 'L') {
      return BtwType.LAAG;
    }
    return BtwType.HOOG;
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

  public List<TekstRow> getTekstRegels() {
    return tekstRegels;
  }

  public void setTekstRegels(List<TekstRow> tekstRegels) {
    this.tekstRegels = tekstRegels;
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
        + ", tekstRegels="
        + tekstRegels
        + '}';
  }
}

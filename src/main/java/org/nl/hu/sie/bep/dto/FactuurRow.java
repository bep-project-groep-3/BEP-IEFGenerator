package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.domain.Factuur;
import org.nl.hu.sie.bep.domain.FactuurRegel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactuurRow extends Row {

  private static final int DESCRIPTION_LENGTH = 60;
  private static final int DESCRIPTION_INFO_LENGTH = 120;

  protected enum BtwType {
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
    prijsPerStuk =
        factuurRegel.getTotaalprijs()
            / factuurRegel.getHoeveelheid(); // TODO: Is er een prijs per stuk?
    btwType = convertBtwCodeToBtwType(factuurRegel.getBTWCode());
    regelDatum = factuur.getDatumtijd(); // TODO: Zijn er losse Factuurregel datums?
    eenheid = factuurRegel.getEenheid();

    tekstRegels = new ArrayList<TekstRow>();
    if (factuurRegel.getProductnaam().length() <= DESCRIPTION_LENGTH) {
      productOmschrijving = factuurRegel.getProductnaam();
    } else {
      productOmschrijving = factuurRegel.getProductnaam().substring(0, DESCRIPTION_LENGTH);

      String descriptionForRows = factuurRegel.getProductnaam().substring(DESCRIPTION_LENGTH);

      for (int i = 0; i < descriptionForRows.length() / (double) DESCRIPTION_INFO_LENGTH; i++) {
        TekstRow tekstRow = new TekstRow();
        tekstRow.convert(descriptionForRows.substring(i * DESCRIPTION_LENGTH, DESCRIPTION_LENGTH));
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

  public double getAantal() {
    return aantal;
  }

  public double getPrijsPerStuk() {
    return prijsPerStuk;
  }

  public BtwType getBtwType() {
    return btwType;
  }

  public Date getRegelDatum() {
    return regelDatum;
  }

  public String getEenheid() {
    return eenheid;
  }

  public List<TekstRow> getTekstRegels() {
    return tekstRegels;
  }

  @Override
  public String toString() {
    return "FactuurRow{"
        + "DESCRIPTION_LENGTH="
        + DESCRIPTION_LENGTH
        + ", DESCRIPTION_INFO_LENGTH="
        + DESCRIPTION_INFO_LENGTH
        + ", productOmschrijving='"
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

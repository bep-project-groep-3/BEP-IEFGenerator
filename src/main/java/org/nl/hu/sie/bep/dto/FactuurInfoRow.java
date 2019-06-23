package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.external.domain.Factuur;
import org.nl.hu.sie.bep.external.domain.FactuurRegel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class FactuurInfoRow extends Row {
  public FactuurInfoRow() {
    super(RowType.FACTUUR);
  }

  private Date factuurdatum;
  private String factuurNummer;
  private List<FactuurRow> factuurRegels;

  public void convert(Factuur factuur) {
    factuurdatum = factuur.getDatumtijd();
    factuurNummer = Integer.toString(factuur.getNummer());

    factuurRegels = new ArrayList<>();
    for (FactuurRegel factuurRegel : factuur.getRegels()) {
      FactuurRow factuurRow = new FactuurRow();
      factuurRow.convert(factuur, factuurRegel);
      factuurRegels.add(factuurRow);
    }
  }

  @Override
  public boolean equals(Object otherFactuurInfoRow) {
    if (this == otherFactuurInfoRow) return true;
    if (otherFactuurInfoRow == null || getClass() != otherFactuurInfoRow.getClass()) return false;
    FactuurInfoRow that = (FactuurInfoRow) otherFactuurInfoRow;

    return factuurdatum.compareTo(that.getFactuurdatum()) == 0
        && factuurNummer.equals(that.getFactuurNummer())
        && factuurRegels.equals(that.getFactuurRegels());
  }

  @Override
  public int hashCode() {
    return Objects.hash(factuurdatum, factuurNummer, factuurRegels);
  }

  public Date getFactuurdatum() {
    return factuurdatum;
  }

  public void setFactuurdatum(Date factuurdatum) {
    this.factuurdatum = factuurdatum;
  }

  public String getFactuurNummer() {
    return factuurNummer;
  }

  public void setFactuurNummer(String factuurNummer) {
    this.factuurNummer = factuurNummer;
  }

  public List<FactuurRow> getFactuurRegels() {
    return factuurRegels;
  }

  public void setFactuurRegels(List<FactuurRow> factuurRegels) {
    this.factuurRegels = factuurRegels;
  }

  @Override
  public String toString() {
    return "FactuurInfoRow{"
        + "factuurdatum="
        + factuurdatum
        + ", factuurNummer='"
        + factuurNummer
        + '\''
        + ", factuurRegels="
        + factuurRegels
        + '}';
  }
}

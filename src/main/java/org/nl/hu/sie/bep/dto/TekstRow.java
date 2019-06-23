package org.nl.hu.sie.bep.dto;

import java.util.Objects;

public class TekstRow extends Row {
  public TekstRow() {
    super(RowType.TEKST);
  }

  private String productieOmschrijving;

  public void convert(String text) {
    productieOmschrijving = text;
  }

  @Override
  public boolean equals(Object otherTekstRow) {
    if (this == otherTekstRow) return true;
    if (otherTekstRow == null || getClass() != otherTekstRow.getClass()) return false;
    TekstRow that = (TekstRow) otherTekstRow;

    return productieOmschrijving.equals(that.getProductieOmschrijving());
  }

  @Override
  public int hashCode() {
    return Objects.hash(productieOmschrijving);
  }

  public String getProductieOmschrijving() {
    return productieOmschrijving;
  }

  public void setProductieOmschrijving(String productieOmschrijving) {
    this.productieOmschrijving = productieOmschrijving;
  }

  @Override
  public String toString() {
    return "TekstRow{" + "productieOmschrijving='" + productieOmschrijving + '\'' + '}';
  }
}

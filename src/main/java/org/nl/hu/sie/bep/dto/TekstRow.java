package org.nl.hu.sie.bep.dto;

public class TekstRow extends Row {
  public TekstRow() {
    super(RowType.TEKST);
  }

  private String productieOmschrijving;

  public void convert(String text) {
    productieOmschrijving = text;
  }

  public String getProductieOmschrijving() {
    return productieOmschrijving;
  }

  @Override
  public String toString() {
    return "TekstRow{" + "productieOmschrijving='" + productieOmschrijving + '}';
  }
}

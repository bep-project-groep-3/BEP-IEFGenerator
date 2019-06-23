package org.nl.hu.sie.bep.dto;

public class TekstRow extends Row {
  public TekstRow() {
    super(RowType.TEKST);
  }

  private String productieOmschrijving;

  public void convert(String text) {
    productieOmschrijving = text;
  }
}

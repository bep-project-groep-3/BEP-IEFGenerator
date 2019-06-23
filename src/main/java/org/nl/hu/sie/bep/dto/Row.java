package org.nl.hu.sie.bep.dto;

public abstract class Row {
  protected enum RowType {
    BEDRIJF,
    KLANT,
    FACTUUR,
    FACTUURREGEL,
    TEKST
  }

  private RowType type;

  public Row(RowType type) {
    this.type = type;
  }

  public RowType getType() {
    return type;
  }
}

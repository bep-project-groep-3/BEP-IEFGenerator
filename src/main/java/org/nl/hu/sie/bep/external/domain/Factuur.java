package org.nl.hu.sie.bep.external.domain;

import java.util.Date;
import java.util.List;

public class Factuur {

  private Date datumtijd;
  private int nummer;
  private List<FactuurRegel> regels;

  public Factuur() {}

  public Date getDatumtijd() {
    return datumtijd;
  }

  public void setDatumtijd(Date datumtijd) {
    this.datumtijd = datumtijd;
  }

  public int getNummer() {
    return nummer;
  }

  public void setNummer(int nummer) {
    this.nummer = nummer;
  }

  public List<FactuurRegel> getRegels() {
    return regels;
  }

  public void setRegels(List<FactuurRegel> regels) {
    this.regels = regels;
  }
}

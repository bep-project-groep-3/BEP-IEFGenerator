package org.nl.hu.sie.bep.domain;

import java.util.Date;
import java.util.List;

public class Factuur {

  private int ID;
  private Date datumtijd;
  private int nummer;
  private String opmerking;

  private int klantID;
  private int PersoonID;
  private List<FactuurRegel> regels;

  public Factuur(
      int ID,
      Date datumtijd,
      int nummer,
      String opmerking,
      int klantID,
      int persoonID,
      List<FactuurRegel> regels) {
    this.ID = ID;
    this.datumtijd = datumtijd;
    this.nummer = nummer;
    this.opmerking = opmerking;
    this.klantID = klantID;
    PersoonID = persoonID;
    this.regels = regels;
  }

  public int getID() {
    return ID;
  }

  public Date getDatumtijd() {
    return datumtijd;
  }

  public int getNummer() {
    return nummer;
  }

  public String getOpmerking() {
    return opmerking;
  }

  public int getKlantID() {
    return klantID;
  }

  public int getPersoonID() {
    return PersoonID;
  }

  public List<FactuurRegel> getRegels() {
    return regels;
  }
}

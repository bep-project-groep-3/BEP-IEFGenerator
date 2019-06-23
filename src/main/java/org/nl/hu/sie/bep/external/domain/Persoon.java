package org.nl.hu.sie.bep.external.domain;

public class Persoon {

  private String voornaam;
  private String tussenvoegsel;
  private String achternaam;
  private char geslacht;

  public Persoon() {}

  public String getVoornaam() {
    return voornaam;
  }

  public void setVoornaam(String voornaam) {
    this.voornaam = voornaam;
  }

  public String getTussenvoegsel() {
    return tussenvoegsel;
  }

  public void setTussenvoegsel(String tussenvoegsel) {
    this.tussenvoegsel = tussenvoegsel;
  }

  public String getAchternaam() {
    return achternaam;
  }

  public void setAchternaam(String achternaam) {
    this.achternaam = achternaam;
  }

  public char getGeslacht() {
    return geslacht;
  }

  public void setGeslacht(char geslacht) {
    this.geslacht = geslacht;
  }
}

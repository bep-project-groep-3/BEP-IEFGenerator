package org.nl.hu.sie.bep.domain;

public class Persoon {

  private int ID;
  private String voornaam;
  private String tussenvoegsel;
  private String achternaam;
  private int telefoon;
  private String fax;
  private char geslacht;

  private int klantID;

  public Persoon(
      int ID,
      String voornaam,
      String tussenvoegsel,
      String achternaam,
      int telefoon,
      String fax,
      char geslacht,
      int klantID) {
    this.ID = ID;
    this.voornaam = voornaam;
    this.tussenvoegsel = tussenvoegsel;
    this.achternaam = achternaam;
    this.telefoon = telefoon;
    this.fax = fax;
    this.geslacht = geslacht;
    this.klantID = klantID;
  }

  public int getID() {
    return ID;
  }

  public String getVoornaam() {
    return voornaam;
  }

  public String getTussenvoegsel() {
    return tussenvoegsel;
  }

  public String getAchternaam() {
    return achternaam;
  }

  public int getTelefoon() {
    return telefoon;
  }

  public String getFax() {
    return fax;
  }

  public char getGeslacht() {
    return geslacht;
  }

  public int getKlantID() {
    return klantID;
  }
}

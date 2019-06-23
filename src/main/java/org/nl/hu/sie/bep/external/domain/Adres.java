package org.nl.hu.sie.bep.external.domain;

public class Adres {

  private String straat;
  private char type;
  private String huisnummer;
  private String postcode;
  private String plaats;

  public Adres() {}

  public String getStraat() {
    return straat;
  }

  public void setStraat(String straat) {
    this.straat = straat;
  }

  public void setType(char type) {
    this.type = type;
  }

  public String getHuisnummer() {
    return huisnummer;
  }

  public void setHuisnummer(String huisnummer) {
    this.huisnummer = huisnummer;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public String getPlaats() {
    return plaats;
  }

  public void setPlaats(String plaats) {
    this.plaats = plaats;
  }
}

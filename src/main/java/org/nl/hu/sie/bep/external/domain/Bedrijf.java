package org.nl.hu.sie.bep.external.domain;

import java.util.List;

// Er is nu nog maar 1 bedrijf, Bifi waarvan de data niet in de db staat.
public class Bedrijf {

  private String bedrijfsnaam;
  private String straat;
  private String huisnummer;
  private String postcode;
  private String plaats;
  private String BTWNummer;
  private String IBAN;
  private String BIC;
  private List<Klant> klanten;

  public Bedrijf() {}

  public String getBedrijfsnaam() {
    return bedrijfsnaam;
  }

  public void setBedrijfsnaam(String bedrijfsnaam) {
    this.bedrijfsnaam = bedrijfsnaam;
  }

  public String getStraat() {
    return straat;
  }

  public void setStraat(String straat) {
    this.straat = straat;
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

  public String getBTWNummer() {
    return BTWNummer;
  }

  public void setBTWNummer(String BTWNummer) {
    this.BTWNummer = BTWNummer;
  }

  public String getIBAN() {
    return IBAN;
  }

  public void setIBAN(String IBAN) {
    this.IBAN = IBAN;
  }

  public String getBIC() {
    return BIC;
  }

  public void setBIC(String BIC) {
    this.BIC = BIC;
  }

  public List<Klant> getKlanten() {
    return klanten;
  }

  public void setKlanten(List<Klant> klanten) {
    this.klanten = klanten;
  }
}

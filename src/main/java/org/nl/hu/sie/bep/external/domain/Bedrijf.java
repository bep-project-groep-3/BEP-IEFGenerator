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

  public Bedrijf(
      String bedrijfsnaam,
      String straat,
      String huisnummer,
      String postcode,
      String plaats,
      String BTWNummer,
      String IBAN,
      String BIC,
      List<Klant> klanten) {
    this.bedrijfsnaam = bedrijfsnaam;
    this.straat = straat;
    this.huisnummer = huisnummer;
    this.postcode = postcode;
    this.plaats = plaats;
    this.BTWNummer = BTWNummer;
    this.IBAN = IBAN;
    this.BIC = BIC;
    this.klanten = klanten;
  }

  public String getBedrijfsnaam() {
    return bedrijfsnaam;
  }

  public String getStraat() {
    return straat;
  }

  public String getHuisnummer() {
    return huisnummer;
  }

  public String getPostcode() {
    return postcode;
  }

  public String getPlaats() {
    return plaats;
  }

  public String getBTWNummer() {
    return BTWNummer;
  }

  public String getIBAN() {
    return IBAN;
  }

  public String getBIC() {
    return BIC;
  }

  public List<Klant> getKlanten() {
    return klanten;
  }

  public void setKlanten(List<Klant> klanten) {
    this.klanten = klanten;
  }
}

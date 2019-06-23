package org.nl.hu.sie.bep.external.domain;

import java.util.List;

public class Klant {

  private String naam;
  private String btwnummer;
  private String bankRek;
  private String BIC;

  private List<Adres> adressen;
  private List<Persoon> contactPersonen;
  private List<Factuur> facturen;

  public Klant() {}

  public String getNaam() {
    return naam;
  }

  public void setNaam(String naam) {
    this.naam = naam;
  }

  public String getBtwnummer() {
    return btwnummer;
  }

  public void setBtwnummer(String btwnummer) {
    this.btwnummer = btwnummer;
  }

  public String getBankRek() {
    return bankRek;
  }

  public void setBankRek(String bankRek) {
    this.bankRek = bankRek;
  }

  public String getBIC() {
    return BIC;
  }

  public void setBIC(String BIC) {
    this.BIC = BIC;
  }

  public List<Adres> getAdressen() {
    return adressen;
  }

  public void setAdressen(List<Adres> adressen) {
    this.adressen = adressen;
  }

  public List<Persoon> getContactPersonen() {
    return contactPersonen;
  }

  public void setContactPersonen(List<Persoon> contactPersonen) {
    this.contactPersonen = contactPersonen;
  }

  public List<Factuur> getFacturen() {
    return facturen;
  }

  public void setFacturen(List<Factuur> facturen) {
    this.facturen = facturen;
  }
}

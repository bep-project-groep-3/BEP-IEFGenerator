package org.nl.hu.sie.bep.domain;

import java.util.List;

public class Klant {

  private int ID;
  private String naam;
  private String rechtsvorm;
  private String btwnummer;
  private String bankRek;
  private String giro;
  private String BIC;

  private List<Adres> adressen;
  private List<Persoon> contactPersonen;
  private List<Factuur> facturen;

  public Klant(
      int ID,
      String naam,
      String rechtsvorm,
      String btwnummer,
      String bankRek,
      String giro,
      String BIC,
      List<Adres> adressen,
      List<Persoon> contactPersonen,
      List<Factuur> facturen) {
    this.ID = ID;
    this.naam = naam;
    this.rechtsvorm = rechtsvorm;
    this.btwnummer = btwnummer;
    this.bankRek = bankRek;
    this.giro = giro;
    this.BIC = BIC;
    this.adressen = adressen;
    this.contactPersonen = contactPersonen;
    this.facturen = facturen;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getNaam() {
    return naam;
  }

  public void setNaam(String naam) {
    this.naam = naam;
  }

  public String getRechtsvorm() {
    return rechtsvorm;
  }

  public void setRechtsvorm(String rechtsvorm) {
    this.rechtsvorm = rechtsvorm;
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

  public String getGiro() {
    return giro;
  }

  public void setGiro(String giro) {
    this.giro = giro;
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

package org.nl.hu.sie.bep.external.domain;

public class FactuurRegel {

  private String productnaam;
  private double hoeveelheid;
  private double totaalprijs;
  private char BTWCode;
  private String eenheid;

  public FactuurRegel() {}

  public String getProductnaam() {
    return productnaam;
  }

  public void setProductnaam(String productnaam) {
    this.productnaam = productnaam;
  }

  public double getHoeveelheid() {
    return hoeveelheid;
  }

  public void setHoeveelheid(double hoeveelheid) {
    this.hoeveelheid = hoeveelheid;
  }

  public double getTotaalprijs() {
    return totaalprijs;
  }

  public void setTotaalprijs(double totaalprijs) {
    this.totaalprijs = totaalprijs;
  }

  public char getBTWCode() {
    return BTWCode;
  }

  public void setBTWCode(char BTWCode) {
    this.BTWCode = BTWCode;
  }

  public String getEenheid() {
    return eenheid;
  }

  public void setEenheid(String eenheid) {
    this.eenheid = eenheid;
  }
}

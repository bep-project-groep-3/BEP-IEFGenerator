package org.nl.hu.sie.bep.external.domain;

public class FactuurRegel {

  private int ID;
  private int productID;
  private String productnaam;
  private double hoeveelheid;
  private double totaalprijs;
  private char BTWCode;
  private String eenheid;

  private int FactuurID;

  public FactuurRegel(
      int ID,
      int productID,
      String productnaam,
      double hoeveelheid,
      double totaalprijs,
      char BTWCode,
      String eenheid,
      int factuurID) {
    this.ID = ID;
    this.productID = productID;
    this.productnaam = productnaam;
    this.hoeveelheid = hoeveelheid;
    this.totaalprijs = totaalprijs;
    this.BTWCode = BTWCode;
    this.eenheid = eenheid;
    FactuurID = factuurID;
  }

  public int getID() {
    return ID;
  }

  public int getProductID() {
    return productID;
  }

  public String getProductnaam() {
    return productnaam;
  }

  public double getHoeveelheid() {
    return hoeveelheid;
  }

  public double getTotaalprijs() {
    return totaalprijs;
  }

  public char getBTWCode() {
    return BTWCode;
  }

  public String getEenheid() {
    return eenheid;
  }

  public int getFactuurID() {
    return FactuurID;
  }
}

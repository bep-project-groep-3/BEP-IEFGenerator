package org.nl.hu.sie.bep.domain;

public class Adres {
	
	private int ID;
	private String straat;
	private char type;
	private String huisnummer;
	private String postcode;
	private String plaats;
	private String BIC;
	
	private int klantID;

  public Adres(int ID, String straat, char type, String huisnummer, String postcode, String plaats, String BIC, int klantID) {
    this.ID = ID;
    this.straat = straat;
    this.type = type;
    this.huisnummer = huisnummer;
    this.postcode = postcode;
    this.plaats = plaats;
    this.BIC = BIC;
    this.klantID = klantID;
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getStraat() {
    return straat;
  }

  public void setStraat(String straat) {
    this.straat = straat;
  }

  public char getType() {
    return type;
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

  public String getBIC() {
    return BIC;
  }

  public void setBIC(String BIC) {
    this.BIC = BIC;
  }

  public int getKlantID() {
    return klantID;
  }

  public void setKlantID(int klantID) {
    this.klantID = klantID;
  }
}

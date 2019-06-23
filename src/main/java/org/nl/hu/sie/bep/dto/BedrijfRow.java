package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.external.domain.Bedrijf;
import org.nl.hu.sie.bep.external.domain.Klant;

import java.util.ArrayList;
import java.util.List;

public class BedrijfRow extends Row {
  private String bedrijfsNaam;
  private String straat;
  private String straatNummer;
  private String postcode;
  private String plaats;
  private String btwcode;
  private String iban;
  private String bic;
  private List<KlantRow> klanten;

  public BedrijfRow() {
    super(RowType.BEDRIJF);
  }

  public void convert(Bedrijf bedrijf) {
    bedrijfsNaam = bedrijf.getBedrijfsnaam();
    straat = bedrijf.getStraat();
    straatNummer = bedrijf.getHuisnummer();
    postcode = bedrijf.getPostcode();
    plaats = bedrijf.getPlaats();
    btwcode = bedrijf.getBTWNummer();
    iban = bedrijf.getIBAN();
    bic = bedrijf.getBIC();

    klanten = new ArrayList<>();
    for (Klant klant : bedrijf.getKlanten()) {
      KlantRow klantRow = new KlantRow();
      klantRow.convert(klant);
      klanten.add(klantRow);
    }
  }

  public String getBedrijfsNaam() {
    return bedrijfsNaam;
  }

  public void setBedrijfsNaam(String bedrijfsNaam) {
    this.bedrijfsNaam = bedrijfsNaam;
  }

  public String getStraat() {
    return straat;
  }

  public void setStraat(String straat) {
    this.straat = straat;
  }

  public String getStraatNummer() {
    return straatNummer;
  }

  public void setStraatNummer(String straatNummer) {
    this.straatNummer = straatNummer;
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

  public String getBtwcode() {
    return btwcode;
  }

  public void setBtwcode(String btwcode) {
    this.btwcode = btwcode;
  }

  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public List<KlantRow> getKlanten() {
    return klanten;
  }

  public void setKlanten(List<KlantRow> klanten) {
    this.klanten = klanten;
  }

  @Override
  public String toString() {
    return "BedrijfRow{"
        + "bedrijfsNaam='"
        + bedrijfsNaam
        + '\''
        + ", straat='"
        + straat
        + '\''
        + ", straatNummer='"
        + straatNummer
        + '\''
        + ", postcode='"
        + postcode
        + '\''
        + ", plaats='"
        + plaats
        + '\''
        + ", btwcode='"
        + btwcode
        + '\''
        + ", iban='"
        + iban
        + '\''
        + ", bic='"
        + bic
        + '\''
        + ", klanten="
        + klanten
        + '}';
  }
}

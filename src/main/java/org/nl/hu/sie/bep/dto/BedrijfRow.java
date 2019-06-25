package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.business.filesaving.EditRows;
import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.domain.domain.Klant;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

  @Override
  public boolean equals(Object otherBedrijfRow) {
    if (this == otherBedrijfRow) return true;
    if (otherBedrijfRow == null || getClass() != otherBedrijfRow.getClass()) return false;
    BedrijfRow that = (BedrijfRow) otherBedrijfRow;

    return bedrijfsNaam.equals(that.getBedrijfsNaam())
        && straat.equals(that.getStraat())
        && straatNummer.equals(that.getStraatNummer())
        && postcode.equals(that.getPostcode())
        && plaats.equals(that.getPlaats())
        && btwcode.equals(that.getBtwcode())
        && iban.equals(that.getIban())
        && bic.equals(that.getBic())
        && klanten.equals(that.getKlanten());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bedrijfsNaam, straat, straatNummer, postcode, plaats, btwcode, iban, bic, klanten);
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

  @Override
  public String getText() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("B");
    stringBuilder.append(EditRows.editString(bedrijfsNaam, 60));
    stringBuilder.append(EditRows.editString(straat, 60));
    stringBuilder.append(EditRows.editString(straatNummer, 10));
    stringBuilder.append(EditRows.editString(postcode, 6));
    stringBuilder.append(EditRows.editString(plaats, 20));
    stringBuilder.append(EditRows.editString(btwcode, 13));
    stringBuilder.append(EditRows.editString(iban, 64));
    stringBuilder.append(EditRows.editString(bic, 10));
    stringBuilder.append("\n");

    for (KlantRow klantRow : klanten) {
      stringBuilder.append(klantRow.getText());
    }
    return stringBuilder.toString();
  }
}

package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.domain.Bedrijf;
import org.nl.hu.sie.bep.domain.Klant;

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

    klanten = new ArrayList<KlantRow>();
    for (Klant klant : bedrijf.getKlanten()) {
      KlantRow klantRow = new KlantRow();
      klantRow.convert(klant, bedrijf);
      klanten.add(klantRow);
    }
  }

  public String getBedrijfsNaam() {
    return bedrijfsNaam;
  }

  public String getStraat() {
    return straat;
  }

  public String getStraatNummer() {
    return straatNummer;
  }

  public String getPostcode() {
    return postcode;
  }

  public String getPlaats() {
    return plaats;
  }

  public String getBtwcode() {
    return btwcode;
  }

  public String getIban() {
    return iban;
  }

  public String getBic() {
    return bic;
  }

  public List<KlantRow> getKlanten() {
    return klanten;
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

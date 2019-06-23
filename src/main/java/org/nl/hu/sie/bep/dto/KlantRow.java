package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.domain.*;

import java.util.ArrayList;
import java.util.List;

public class KlantRow extends Row {
  public KlantRow() {
    super(RowType.KLANT);
  }

  private String bedrijfsnaam;
  private String aanhef;
  private String voornaam;
  private String tussenvoegsel;
  private String achternaam;
  private String straat;
  private String huisnummer;
  private String postcode;
  private String plaats;
  private String btwNummer;
  private String iban;
  private String bic;
  private List<FactuurInfoRow> facturen;

  public void convert(Klant klant, Bedrijf bedrijf) {
    bedrijfsnaam = bedrijf.getBedrijfsnaam();
    btwNummer = klant.getBtwnummer();
    iban = klant.getBankRek();
    bic = klant.getBIC();

    Adres adres = klant.getAdressen().get(0);
    straat = adres.getStraat();
    huisnummer = adres.getHuisnummer();
    postcode = adres.getPostcode();
    plaats = adres.getPlaats();

    Persoon persoon = klant.getContactPersonen().get(0);
    aanhef = persoon.getGeslacht() == 'm' ? "dhr" : "mevr";
    voornaam = persoon.getVoornaam();
    tussenvoegsel = persoon.getTussenvoegsel();
    achternaam = persoon.getAchternaam();

    facturen = new ArrayList<FactuurInfoRow>();
    for (Factuur factuur : klant.getFacturen()) {
      FactuurInfoRow factuurInfoRow = new FactuurInfoRow();
      factuurInfoRow.convert(factuur);
      facturen.add(factuurInfoRow);
    }
  }

  public String getBedrijfsnaam() {
    return bedrijfsnaam;
  }

  public String getAanhef() {
    return aanhef;
  }

  public String getVoornaam() {
    return voornaam;
  }

  public String getTussenvoegsel() {
    return tussenvoegsel;
  }

  public String getAchternaam() {
    return achternaam;
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

  public String getBtwNummer() {
    return btwNummer;
  }

  public String getIban() {
    return iban;
  }

  public String getBic() {
    return bic;
  }

  public List<FactuurInfoRow> getFacturen() {
    return facturen;
  }

  @Override
  public String toString() {
    return "KlantRow{"
        + "bedrijfsnaam='"
        + bedrijfsnaam
        + '\''
        + ", aanhef='"
        + aanhef
        + '\''
        + ", voornaam='"
        + voornaam
        + '\''
        + ", tussenvoegsel='"
        + tussenvoegsel
        + '\''
        + ", achternaam='"
        + achternaam
        + '\''
        + ", straat='"
        + straat
        + '\''
        + ", huisnummer='"
        + huisnummer
        + '\''
        + ", postcode='"
        + postcode
        + '\''
        + ", plaats='"
        + plaats
        + '\''
        + ", btwNummer='"
        + btwNummer
        + '\''
        + ", iban='"
        + iban
        + '\''
        + ", bic='"
        + bic
        + '\''
        + ", facturen="
        + facturen
        + '}';
  }
}

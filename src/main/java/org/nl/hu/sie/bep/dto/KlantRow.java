package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.external.domain.Adres;
import org.nl.hu.sie.bep.external.domain.Factuur;
import org.nl.hu.sie.bep.external.domain.Klant;
import org.nl.hu.sie.bep.external.domain.Persoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

  public void convert(Klant klant) {
    bedrijfsnaam = klant.getNaam();
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

    facturen = new ArrayList<>();
    for (Factuur factuur : klant.getFacturen()) {
      FactuurInfoRow factuurInfoRow = new FactuurInfoRow();
      factuurInfoRow.convert(factuur);
      facturen.add(factuurInfoRow);
    }
  }

  @Override
  public boolean equals(Object otherKlantRow) {
    if (this == otherKlantRow) return true;
    if (otherKlantRow == null || getClass() != otherKlantRow.getClass()) return false;
    KlantRow that = (KlantRow) otherKlantRow;

    return bedrijfsnaam.equals(that.getBedrijfsnaam())
        && aanhef.equals(that.getAanhef())
        && voornaam.equals(that.getVoornaam())
        && tussenvoegsel.equals(that.getTussenvoegsel())
        && achternaam.equals(that.getAchternaam())
        && straat.equals(that.getStraat())
        && huisnummer.equals(that.getHuisnummer())
        && postcode.equals(that.getPostcode())
        && plaats.equals(that.getPlaats())
        && btwNummer.equals(that.getBtwNummer())
        && iban.equals(that.getIban())
        && bic.equals(that.getBic())
        && facturen.equals(that.getFacturen());
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bedrijfsnaam,
        aanhef,
        voornaam,
        tussenvoegsel,
        achternaam,
        straat,
        huisnummer,
        postcode,
        plaats,
        btwNummer,
        iban,
        bic,
        facturen);
  }

  public String getBedrijfsnaam() {
    return bedrijfsnaam;
  }

  public void setBedrijfsnaam(String bedrijfsnaam) {
    this.bedrijfsnaam = bedrijfsnaam;
  }

  public String getAanhef() {
    return aanhef;
  }

  public void setAanhef(String aanhef) {
    this.aanhef = aanhef;
  }

  public String getVoornaam() {
    return voornaam;
  }

  public void setVoornaam(String voornaam) {
    this.voornaam = voornaam;
  }

  public String getTussenvoegsel() {
    return tussenvoegsel;
  }

  public void setTussenvoegsel(String tussenvoegsel) {
    this.tussenvoegsel = tussenvoegsel;
  }

  public String getAchternaam() {
    return achternaam;
  }

  public void setAchternaam(String achternaam) {
    this.achternaam = achternaam;
  }

  public String getStraat() {
    return straat;
  }

  public void setStraat(String straat) {
    this.straat = straat;
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

  public String getBtwNummer() {
    return btwNummer;
  }

  public void setBtwNummer(String btwNummer) {
    this.btwNummer = btwNummer;
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

  public List<FactuurInfoRow> getFacturen() {
    return facturen;
  }

  public void setFacturen(List<FactuurInfoRow> facturen) {
    this.facturen = facturen;
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

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

    klanten = new ArrayList<KlantRow>();
    for (Klant klant : bedrijf.getKlanten()) {
      KlantRow klantRow = new KlantRow();
      klantRow.convert(klant, bedrijf);
      klanten.add(klantRow);
    }
  }
}

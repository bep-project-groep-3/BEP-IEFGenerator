package org.nl.hu.sie.bep.business;

import org.junit.BeforeClass;
import org.junit.Test;
import org.nl.hu.sie.bep.adapter.IEFGenerator;
import org.nl.hu.sie.bep.adapter.IEFGeneratorAdapter;
import org.nl.hu.sie.bep.domain.domain.*;
import org.nl.hu.sie.bep.dto.BedrijfRow;
import org.nl.hu.sie.bep.dto.FactuurInfoRow;
import org.nl.hu.sie.bep.dto.FactuurRow;
import org.nl.hu.sie.bep.dto.KlantRow;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

// import org.nl.hu.sie.bep.domain.domain.*;

public class IEFGeneratorTest {
  private static IEFGeneratorAdapter iefGenerator;

  @BeforeClass
  public static void initIEFGenerator() {
    iefGenerator = new IEFGenerator();
  }

  @Test
  public void testIEFGenerator() {
    Bedrijf bedrijf = createBedrijf();
    BedrijfRow bedrijfCheckRow = createCheckBedrijfRow();

    BedrijfRow bedrijfRow = (BedrijfRow) iefGenerator.generate(1, bedrijf);

    assertEquals(bedrijfRow, bedrijfCheckRow);
  }

  public Bedrijf createBedrijf() {
    List<FactuurRegel> factuurRegelsFactuur1 = new ArrayList<>();

    FactuurRegel factuurRegel1Factuur1 =
        new FactuurRegel(
            1,
            "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin",
            3,
            26000,
            "H",
            "stuk");
    factuurRegelsFactuur1.add(factuurRegel1Factuur1);

    FactuurRegel factuurRegel2Factuur1 =
        new FactuurRegel(
            1,
            "Auto met 300 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi",
            3,
            26000,
            "H",
            "stuk");
    factuurRegelsFactuur1.add(factuurRegel2Factuur1);

    FactuurRegel factuurRegel3Factuur1 = new FactuurRegel(2, "BiFi", 23, 460.20, "L", "kg");
    factuurRegelsFactuur1.add(factuurRegel3Factuur1);

    List<Factuur> facturenKlant1 = new ArrayList<>();

    Calendar factuur1Calendar = Calendar.getInstance();
    factuur1Calendar.set(2019, 10, 11, 10, 2, 1);
    factuur1Calendar.set(Calendar.MILLISECOND, 0);

    Factuur factuur1Klant1 =
        new Factuur(factuur1Calendar.getTime(), 1, "Opmerking voor factuur 1", 1, 1);
    factuur1Klant1.setRegels(factuurRegelsFactuur1);
    facturenKlant1.add(factuur1Klant1);

    List<Adres> adressenKlant1 = new ArrayList<>();

    Adres adres1Klant1 =
        new Adres("Claude Debussylaan", "v", "34", "1082MD", "Amsterdam", "RABONL2U", 1);
    adressenKlant1.add(adres1Klant1);

    List<Persoon> contactPersonenKlant1 = new ArrayList<>();

    Persoon contactPersoon1Klant1 =
        new Persoon(1, "Pim", "van der", "Feltz", "06-12345678", "0312-192192", "m", 1);
    contactPersonenKlant1.add(contactPersoon1Klant1);

    List<FactuurRegel> factuurRegelsFactuur2 = new ArrayList<>();
    FactuurRegel factuurRegel1Factuur2 =
        new FactuurRegel(
            4,
            "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin",
            3,
            26000,
            "H",
            "stuk");
    factuurRegelsFactuur2.add(factuurRegel1Factuur2);

    List<FactuurRegel> factuurRegelsFactuur3 = new ArrayList<>();
    FactuurRegel factuurRegel1Factuur3 = new FactuurRegel(5, "Houten plank", 25, 250, "G", "meter");
    factuurRegelsFactuur3.add(factuurRegel1Factuur3);

    FactuurRegel factuurRegel2Factuur3 = new FactuurRegel(6, "BiFi", 13212, 73212, "L", "stuk");
    factuurRegelsFactuur3.add(factuurRegel2Factuur3);

    List<Factuur> facturenKlant2 = new ArrayList<>();

    Calendar factuur2Calendar = Calendar.getInstance();
    factuur2Calendar.set(2011, 2, 19, 23, 54, 12);
    factuur2Calendar.set(Calendar.MILLISECOND, 0);

    Factuur factuur2Klant2 =
        new Factuur(factuur2Calendar.getTime(), 2, "Opmerking voor factuur 2", 2, 2);
    factuur2Klant2.setRegels(factuurRegelsFactuur2);
    facturenKlant2.add(factuur2Klant2);

    Calendar factuur3Calendar = Calendar.getInstance();
    factuur3Calendar.set(2018, 4, 12, 2, 1, 0);
    factuur3Calendar.set(Calendar.MILLISECOND, 0);

    Factuur factuur3Klant2 =
        new Factuur(factuur3Calendar.getTime(), 3, "Opmerking voor factuur 3", 2, 2);
    factuur3Klant2.setRegels(factuurRegelsFactuur3);
    facturenKlant2.add(factuur3Klant2);

    List<Adres> adressenKlant2 = new ArrayList<>();

    Adres adres1Klant2 =
        new Adres("Evert van de Beekstraat", "v", "354", "1118CZ", "Schiphol", "RABONL2U", 2);
    adressenKlant2.add(adres1Klant2);

    Adres adres2Klant2 =
        new Adres("Evert van de Beekstraat", "v", "355", "1118CZ", "Schiphol", "RABONL2U", 2);
    adressenKlant2.add(adres2Klant2);

    List<Persoon> contactPersonenKlant2 = new ArrayList<>();

    Persoon contactPersoon1Klant2 =
        new Persoon(2, "Cara", "", "Antoine", "06-12345678", "0312-192192", "v", 2);
    contactPersonenKlant2.add(contactPersoon1Klant2);

    Persoon contactPersoon2Klant2 =
        new Persoon(3, "Ernst Jan", "", "Stigter", "06-12345678", "0312-192192", "m", 2);
    contactPersonenKlant2.add(contactPersoon2Klant2);

    List<Klant> klanten = new ArrayList<Klant>();

    Klant klant1 =
        new Klant(
            1,
            "Google Amsterdam",
            "BV",
            "NL001234567B01",
            "NL44RABO0123456789",
            "1234",
            "RABONL2U");
    klant1.setAdressen(adressenKlant1);
    klant1.setContactPersonen(contactPersonenKlant1);
    klant1.setFacturen(facturenKlant1);
    klanten.add(klant1);

    Klant klant2 =
        new Klant(
            1,
            "Microsoft Nederland",
            "BV",
            "NL009205127B12",
            "NL29RABO8958291820",
            "1234",
            "RABONL2U");
    klant2.setAdressen(adressenKlant2);
    klant2.setContactPersonen(contactPersonenKlant2);
    klant2.setFacturen(facturenKlant2);
    klanten.add(klant2);

    Bedrijf bedrijf =
        new Bedrijf(
            "BiFi",
            "Kalverstraat",
            "1",
            "1012PA",
            "Amsterdam",
            "NL002234567B01",
            "NL12RABO0124525121",
            "RABONL2U");
    bedrijf.setKlanten(klanten);

    return bedrijf;
  }

  private BedrijfRow createCheckBedrijfRow() {
    List<FactuurRow> factuurRowsFactuur1 = new ArrayList<FactuurRow>();

    Calendar factuur1Calendar = Calendar.getInstance();
    factuur1Calendar.set(2019, 10, 11, 10, 2, 1);
    factuur1Calendar.set(Calendar.MILLISECOND, 0);

    FactuurRow factuurRow1Factuur1 = new FactuurRow();
    factuurRow1Factuur1.setProductOmschrijving(
        "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin");
    factuurRow1Factuur1.setAantal(3.0);
    factuurRow1Factuur1.setPrijsPerStuk(8666.666666666666);
    factuurRow1Factuur1.setBtwType(FactuurRow.BtwType.HOOG);
    factuurRow1Factuur1.setRegelDatum(factuur1Calendar.getTime());
    factuurRow1Factuur1.setEenheid("stuk");
    factuurRowsFactuur1.add(factuurRow1Factuur1);

    FactuurRow factuurRow2Factuur1 = new FactuurRow();
    factuurRow2Factuur1.setProductOmschrijving(
        "Auto met 300 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi");
    factuurRow2Factuur1.setAantal(3.0);
    factuurRow2Factuur1.setPrijsPerStuk(8666.666666666666);
    factuurRow2Factuur1.setBtwType(FactuurRow.BtwType.HOOG);
    factuurRow2Factuur1.setRegelDatum(factuur1Calendar.getTime());
    factuurRow2Factuur1.setEenheid("stuk");
    factuurRowsFactuur1.add(factuurRow2Factuur1);

    FactuurRow factuurRow3Factuur1 = new FactuurRow();
    factuurRow3Factuur1.setProductOmschrijving("BiFi");
    factuurRow3Factuur1.setAantal(23.0);
    factuurRow3Factuur1.setPrijsPerStuk(20.008695652173913);
    factuurRow3Factuur1.setBtwType(FactuurRow.BtwType.LAAG);
    factuurRow3Factuur1.setRegelDatum(factuur1Calendar.getTime());
    factuurRow3Factuur1.setEenheid("kg");
    factuurRowsFactuur1.add(factuurRow3Factuur1);

    List<FactuurInfoRow> factuurRowsKlant1 = new ArrayList<FactuurInfoRow>();

    FactuurInfoRow factuur1Row = new FactuurInfoRow();
    factuur1Row.setFactuurdatum(factuur1Calendar.getTime());
    factuur1Row.setFactuurNummer("1");
    factuur1Row.setFactuurRegels(factuurRowsFactuur1);
    factuurRowsKlant1.add(factuur1Row);

    List<KlantRow> klanten = new ArrayList<KlantRow>();

    KlantRow klant1Row = new KlantRow();
    klant1Row.setBedrijfsnaam("Google Amsterdam");
    klant1Row.setAanhef("dhr");
    klant1Row.setVoornaam("Pim");
    klant1Row.setTussenvoegsel("van der");
    klant1Row.setAchternaam("Feltz");
    klant1Row.setStraat("Claude Debussylaan");
    klant1Row.setHuisnummer("34");
    klant1Row.setPostcode("1082MD");
    klant1Row.setPlaats("Amsterdam");
    klant1Row.setBtwNummer("NL001234567B01");
    klant1Row.setIban("NL44RABO0123456789");
    klant1Row.setBic("RABONL2U");
    klant1Row.setFacturen(factuurRowsKlant1);
    klanten.add(klant1Row);

    List<FactuurRow> factuurRowsFactuur2 = new ArrayList<FactuurRow>();

    Calendar factuur2Calendar = Calendar.getInstance();
    factuur2Calendar.set(2011, 2, 19, 23, 54, 12);
    factuur2Calendar.set(Calendar.MILLISECOND, 0);

    FactuurRow factuurRow1Factuur2 = new FactuurRow();
    factuurRow1Factuur2.setProductOmschrijving(
        "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin");
    factuurRow1Factuur2.setAantal(3.0);
    factuurRow1Factuur2.setPrijsPerStuk(8666.666666666666);
    factuurRow1Factuur2.setBtwType(FactuurRow.BtwType.HOOG);
    factuurRow1Factuur2.setRegelDatum(factuur2Calendar.getTime());
    factuurRow1Factuur2.setEenheid("stuk");
    factuurRowsFactuur2.add(factuurRow1Factuur2);

    List<FactuurInfoRow> factuurRowsKlant2 = new ArrayList<FactuurInfoRow>();

    FactuurInfoRow factuur2Row = new FactuurInfoRow();
    factuur2Row.setFactuurdatum(factuur2Calendar.getTime());
    factuur2Row.setFactuurNummer("2");
    factuur2Row.setFactuurRegels(factuurRowsFactuur2);
    factuurRowsKlant2.add(factuur2Row);

    Calendar factuur3Calendar = Calendar.getInstance();
    factuur3Calendar.set(2018, 4, 12, 2, 1, 0);
    factuur3Calendar.set(Calendar.MILLISECOND, 0);

    List<FactuurRow> factuurRowsFactuur3 = new ArrayList<FactuurRow>();

    FactuurRow factuurRow1Factuur3 = new FactuurRow();
    factuurRow1Factuur3.setProductOmschrijving("Houten plank");
    factuurRow1Factuur3.setAantal(25.0);
    factuurRow1Factuur3.setPrijsPerStuk(10.00);
    factuurRow1Factuur3.setBtwType(FactuurRow.BtwType.GEEN);
    factuurRow1Factuur3.setRegelDatum(factuur3Calendar.getTime());
    factuurRow1Factuur3.setEenheid("meter");
    factuurRowsFactuur3.add(factuurRow1Factuur3);

    FactuurRow factuurRow2Factuur3 = new FactuurRow();
    factuurRow2Factuur3.setProductOmschrijving("BiFi");
    factuurRow2Factuur3.setAantal(13212.0);
    factuurRow2Factuur3.setPrijsPerStuk(5.541326067211626);
    factuurRow2Factuur3.setBtwType(FactuurRow.BtwType.LAAG);
    factuurRow2Factuur3.setRegelDatum(factuur3Calendar.getTime());
    factuurRow2Factuur3.setEenheid("stuk");
    factuurRowsFactuur3.add(factuurRow2Factuur3);

    FactuurInfoRow factuur3Row = new FactuurInfoRow();
    factuur3Row.setFactuurdatum(factuur3Calendar.getTime());
    factuur3Row.setFactuurNummer("3");
    factuur3Row.setFactuurRegels(factuurRowsFactuur3);
    factuurRowsKlant2.add(factuur3Row);

    KlantRow klant2Row = new KlantRow();
    klant2Row.setBedrijfsnaam("Microsoft Nederland");
    klant2Row.setAanhef("mevr");
    klant2Row.setVoornaam("Cara");
    klant2Row.setTussenvoegsel("");
    klant2Row.setAchternaam("Antoine");
    klant2Row.setStraat("Evert van de Beekstraat");
    klant2Row.setHuisnummer("354");
    klant2Row.setPostcode("1118CZ");
    klant2Row.setPlaats("Schiphol");
    klant2Row.setBtwNummer("NL009205127B12");
    klant2Row.setIban("NL29RABO8958291820");
    klant2Row.setBic("RABONL2U");
    klant2Row.setFacturen(factuurRowsKlant2);
    klanten.add(klant2Row);

    BedrijfRow bedrijfCheckRow = new BedrijfRow();
    bedrijfCheckRow.setBedrijfsNaam("BiFi");
    bedrijfCheckRow.setStraat("Kalverstraat");
    bedrijfCheckRow.setStraatNummer("1");
    bedrijfCheckRow.setPostcode("1012PA");
    bedrijfCheckRow.setPlaats("Amsterdam");
    bedrijfCheckRow.setBtwcode("NL002234567B01");
    bedrijfCheckRow.setIban("NL12RABO0124525121");
    bedrijfCheckRow.setBic("RABONL2U");
    bedrijfCheckRow.setKlanten(klanten);

    return bedrijfCheckRow;
  }
}

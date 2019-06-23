package org.nl.hu.sie.bep.business;

import org.junit.BeforeClass;
import org.junit.Test;
import org.nl.hu.sie.bep.adapter.IEFGenerator;
import org.nl.hu.sie.bep.adapter.IEFGeneratorAdapter;
import org.nl.hu.sie.bep.dto.*;
import org.nl.hu.sie.bep.external.domain.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.junit.Assert.assertEquals;

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

    BedrijfRow bedrijfRow = (BedrijfRow) iefGenerator.generate(bedrijf);

    assertEquals(bedrijfRow, bedrijfCheckRow);
  }

  public Bedrijf createBedrijf() {
    List<FactuurRegel> factuurRegelsFactuur1 = new ArrayList<FactuurRegel>();

    FactuurRegel factuurRegel1Factuur1 = new FactuurRegel();
    factuurRegel1Factuur1.setBTWCode('H');
    factuurRegel1Factuur1.setEenheid("stuk");
    factuurRegel1Factuur1.setHoeveelheid(3);
    factuurRegel1Factuur1.setProductnaam(
        "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin");
    factuurRegel1Factuur1.setTotaalprijs(26000);
    factuurRegelsFactuur1.add(factuurRegel1Factuur1);

    FactuurRegel factuurRegel2Factuur1 = new FactuurRegel();
    factuurRegel2Factuur1.setBTWCode('H');
    factuurRegel2Factuur1.setEenheid("stuk");
    factuurRegel2Factuur1.setHoeveelheid(3);
    factuurRegel2Factuur1.setProductnaam(
        "Auto met 300 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi");
    factuurRegel2Factuur1.setTotaalprijs(26000);
    factuurRegelsFactuur1.add(factuurRegel2Factuur1);

    FactuurRegel factuurRegel3Factuur1 = new FactuurRegel();
    factuurRegel3Factuur1.setBTWCode('L');
    factuurRegel3Factuur1.setEenheid("kg");
    factuurRegel3Factuur1.setHoeveelheid(23);
    factuurRegel3Factuur1.setProductnaam("BiFi");
    factuurRegel3Factuur1.setTotaalprijs(460.20);
    factuurRegelsFactuur1.add(factuurRegel3Factuur1);

    List<Factuur> facturenKlant1 = new ArrayList<Factuur>();

    Calendar factuur1Calendar = Calendar.getInstance();
    factuur1Calendar.set(2019, 10, 11, 10, 2, 1);
    factuur1Calendar.set(Calendar.MILLISECOND, 0);

    Factuur factuur1Klant1 = new Factuur();
    factuur1Klant1.setDatumtijd(factuur1Calendar.getTime());
    factuur1Klant1.setNummer(1);
    factuur1Klant1.setRegels(factuurRegelsFactuur1);
    facturenKlant1.add(factuur1Klant1);

    List<Adres> adressenKlant1 = new ArrayList<Adres>();

    Adres adres1Klant1 = new Adres();
    adres1Klant1.setStraat("Claude Debussylaan");
    adres1Klant1.setHuisnummer("34");
    adres1Klant1.setPlaats("Amsterdam");
    adres1Klant1.setPostcode("1082MD");
    adres1Klant1.setType('v');
    adressenKlant1.add(adres1Klant1);

    List<Persoon> contactPersonenKlant1 = new ArrayList<Persoon>();

    Persoon contactPersoon1Klant1 = new Persoon();
    contactPersoon1Klant1.setVoornaam("Pim");
    contactPersoon1Klant1.setTussenvoegsel("van der");
    contactPersoon1Klant1.setAchternaam("Feltz");
    contactPersoon1Klant1.setGeslacht('m');

    contactPersonenKlant1.add(contactPersoon1Klant1);

    List<FactuurRegel> factuurRegelsFactuur2 = new ArrayList<FactuurRegel>();
    FactuurRegel factuurRegel1Factuur2 = new FactuurRegel();
    factuurRegel1Factuur2.setBTWCode('H');
    factuurRegel1Factuur2.setEenheid("stuk");
    factuurRegel1Factuur2.setHoeveelheid(3);
    factuurRegel1Factuur2.setProductnaam(
        "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin");
    factuurRegel1Factuur2.setTotaalprijs(26000);
    factuurRegelsFactuur2.add(factuurRegel1Factuur2);

    List<FactuurRegel> factuurRegelsFactuur3 = new ArrayList<FactuurRegel>();
    FactuurRegel factuurRegel1Factuur3 = new FactuurRegel();
    factuurRegel1Factuur3.setBTWCode('G');
    factuurRegel1Factuur3.setEenheid("meter");
    factuurRegel1Factuur3.setHoeveelheid(25);
    factuurRegel1Factuur3.setProductnaam("Houten plank");
    factuurRegel1Factuur3.setTotaalprijs(250);
    factuurRegelsFactuur3.add(factuurRegel1Factuur3);

    FactuurRegel factuurRegel2Factuur3 = new FactuurRegel();
    factuurRegel2Factuur3.setBTWCode('L');
    factuurRegel2Factuur3.setEenheid("stuk");
    factuurRegel2Factuur3.setHoeveelheid(13212);
    factuurRegel2Factuur3.setProductnaam("BiFi");
    factuurRegel2Factuur3.setTotaalprijs(73212);
    factuurRegelsFactuur3.add(factuurRegel2Factuur3);

    List<Factuur> facturenKlant2 = new ArrayList<Factuur>();

    Calendar factuur2Calendar = Calendar.getInstance();
    factuur2Calendar.set(2011, 2, 19, 23, 54, 12);
    factuur2Calendar.set(Calendar.MILLISECOND, 0);

    Factuur factuur2Klant2 = new Factuur();
    factuur2Klant2.setDatumtijd(factuur2Calendar.getTime());
    factuur2Klant2.setNummer(2);
    factuur2Klant2.setRegels(factuurRegelsFactuur2);
    facturenKlant2.add(factuur2Klant2);

    Calendar factuur3Calendar = Calendar.getInstance();
    factuur3Calendar.set(2018, 4, 12, 2, 1, 0);
    factuur3Calendar.set(Calendar.MILLISECOND, 0);

    Factuur factuur3Klant2 = new Factuur();
    factuur3Klant2.setDatumtijd(factuur3Calendar.getTime());
    factuur3Klant2.setNummer(3);
    factuur3Klant2.setRegels(factuurRegelsFactuur3);
    facturenKlant2.add(factuur3Klant2);

    List<Adres> adressenKlant2 = new ArrayList<Adres>();

    Adres adres1Klant2 = new Adres();
    adres1Klant2.setStraat("Evert van de Beekstraat");
    adres1Klant2.setHuisnummer("354");
    adres1Klant2.setPlaats("Schiphol");
    adres1Klant2.setPostcode("1118CZ");
    adres1Klant2.setType('v');
    adressenKlant2.add(adres1Klant2);

    Adres adres2Klant2 = new Adres();
    adres2Klant2.setStraat("Evert van de Beekstraat");
    adres2Klant2.setHuisnummer("355");
    adres2Klant2.setPlaats("Schiphol");
    adres2Klant2.setPostcode("1118CZ");
    adres2Klant2.setType('v');
    adressenKlant2.add(adres2Klant2);

    List<Persoon> contactPersonenKlant2 = new ArrayList<Persoon>();

    Persoon contactPersoon1Klant2 = new Persoon();
    contactPersoon1Klant2.setVoornaam("Cara");
    contactPersoon1Klant2.setTussenvoegsel("");
    contactPersoon1Klant2.setAchternaam("Antoine");
    contactPersoon1Klant2.setGeslacht('v');
    contactPersonenKlant2.add(contactPersoon1Klant2);

    Persoon contactPersoon2Klant2 = new Persoon();
    contactPersoon2Klant2.setVoornaam("Ernst Jan");
    contactPersoon2Klant2.setTussenvoegsel("");
    contactPersoon2Klant2.setAchternaam("Stigter");
    contactPersoon2Klant2.setGeslacht('m');
    contactPersonenKlant2.add(contactPersoon2Klant2);

    List<Klant> klanten = new ArrayList<Klant>();

    Klant klant1 = new Klant();
    klant1.setAdressen(adressenKlant1);
    klant1.setContactPersonen(contactPersonenKlant1);
    klant1.setFacturen(facturenKlant1);
    klant1.setBankRek("NL44RABO0123456789");
    klant1.setBIC("RABONL2U");
    klant1.setBtwnummer("NL001234567B01");
    klant1.setNaam("Google Amsterdam");
    klanten.add(klant1);

    Klant klant2 = new Klant();
    klant2.setAdressen(adressenKlant2);
    klant2.setContactPersonen(contactPersonenKlant2);
    klant2.setFacturen(facturenKlant2);
    klant2.setBankRek("NL29RABO8958291820");
    klant2.setBIC("RABONL2U");
    klant2.setBtwnummer("NL009205127B12");
    klant2.setNaam("Microsoft Nederland");
    klanten.add(klant2);

    Bedrijf bedrijf = new Bedrijf();
    bedrijf.setKlanten(klanten);
    bedrijf.setBIC("RABONL2U");
    bedrijf.setHuisnummer("1");
    bedrijf.setPlaats("Amsterdam");
    bedrijf.setPostcode("1012PA");
    bedrijf.setStraat("Kalverstraat");
    bedrijf.setBedrijfsnaam("BiFi");
    bedrijf.setBTWNummer("NL002234567B01");
    bedrijf.setIBAN("NL12RABO0124525121");

    return bedrijf;
  }

  private BedrijfRow createCheckBedrijfRow() {
    List<TekstRow> tekstRowsFactuurRow1Factuur1 = new ArrayList<TekstRow>();
    TekstRow tekstRow1FactuurRow1Factuur1 = new TekstRow();
    tekstRow1FactuurRow1Factuur1.setProductieOmschrijving(
        "e omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omsc");
    tekstRowsFactuurRow1Factuur1.add(tekstRow1FactuurRow1Factuur1);

    TekstRow tekstRow2FactuurRow1Factuur1 = new TekstRow();
    tekstRow2FactuurRow1Factuur1.setProductieOmschrijving(
        "hrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi");
    tekstRowsFactuurRow1Factuur1.add(tekstRow2FactuurRow1Factuur1);

    TekstRow tekstRow3FactuurRow1Factuur1 = new TekstRow();
    tekstRow3FactuurRow1Factuur1.setProductieOmschrijving("n");
    tekstRowsFactuurRow1Factuur1.add(tekstRow3FactuurRow1Factuur1);

    List<FactuurRow> factuurRowsFactuur1 = new ArrayList<FactuurRow>();

    Calendar factuur1Calendar = Calendar.getInstance();
    factuur1Calendar.set(2019, 10, 11, 10, 2, 1);
    factuur1Calendar.set(Calendar.MILLISECOND, 0);

    FactuurRow factuurRow1Factuur1 = new FactuurRow();
    factuurRow1Factuur1.setProductOmschrijving(
        "Auto met 301 characters omschrijving. Auto met een hele lang");
    factuurRow1Factuur1.setAantal(3.0);
    factuurRow1Factuur1.setPrijsPerStuk(8666.666666666666);
    factuurRow1Factuur1.setBtwType(FactuurRow.BtwType.HOOG);
    factuurRow1Factuur1.setRegelDatum(factuur1Calendar.getTime());
    factuurRow1Factuur1.setEenheid("stuk");
    factuurRow1Factuur1.setTekstRegels(tekstRowsFactuurRow1Factuur1);
    factuurRowsFactuur1.add(factuurRow1Factuur1);

    List<TekstRow> tekstRowsFactuurRow2Factuur1 = new ArrayList<TekstRow>();
    TekstRow tekstRow1FactuurRow2Factuur1 = new TekstRow();
    tekstRow1FactuurRow2Factuur1.setProductieOmschrijving(
        "e omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omsc");
    tekstRowsFactuurRow2Factuur1.add(tekstRow1FactuurRow2Factuur1);

    TekstRow tekstRow2FactuurRow2Factuur1 = new TekstRow();
    tekstRow2FactuurRow2Factuur1.setProductieOmschrijving(
        "hrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi");
    tekstRowsFactuurRow2Factuur1.add(tekstRow2FactuurRow2Factuur1);

    FactuurRow factuurRow2Factuur1 = new FactuurRow();
    factuurRow2Factuur1.setProductOmschrijving(
        "Auto met 300 characters omschrijving. Auto met een hele lang");
    factuurRow2Factuur1.setAantal(3.0);
    factuurRow2Factuur1.setPrijsPerStuk(8666.666666666666);
    factuurRow2Factuur1.setBtwType(FactuurRow.BtwType.HOOG);
    factuurRow2Factuur1.setRegelDatum(factuur1Calendar.getTime());
    factuurRow2Factuur1.setEenheid("stuk");
    factuurRow2Factuur1.setTekstRegels(tekstRowsFactuurRow2Factuur1);
    factuurRowsFactuur1.add(factuurRow2Factuur1);

    FactuurRow factuurRow3Factuur1 = new FactuurRow();
    factuurRow3Factuur1.setProductOmschrijving("BiFi");
    factuurRow3Factuur1.setAantal(23.0);
    factuurRow3Factuur1.setPrijsPerStuk(20.008695652173913);
    factuurRow3Factuur1.setBtwType(FactuurRow.BtwType.LAAG);
    factuurRow3Factuur1.setRegelDatum(factuur1Calendar.getTime());
    factuurRow3Factuur1.setEenheid("kg");
    factuurRow3Factuur1.setTekstRegels(new ArrayList<TekstRow>());
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

    List<TekstRow> tekstRowsFactuurRow1Factuur2 = new ArrayList<TekstRow>();
    TekstRow tekstRow1FactuurRow1Factuur2 = new TekstRow();
    tekstRow1FactuurRow1Factuur2.setProductieOmschrijving(
        "e omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omsc");
    tekstRowsFactuurRow1Factuur2.add(tekstRow1FactuurRow1Factuur2);

    TekstRow tekstRow2FactuurRow1Factuur2 = new TekstRow();
    tekstRow2FactuurRow1Factuur2.setProductieOmschrijving(
        "hrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi");
    tekstRowsFactuurRow1Factuur2.add(tekstRow2FactuurRow1Factuur2);

    TekstRow tekstRow3FactuurRow1Factuur2 = new TekstRow();
    tekstRow3FactuurRow1Factuur2.setProductieOmschrijving("n");
    tekstRowsFactuurRow1Factuur2.add(tekstRow3FactuurRow1Factuur2);

    List<FactuurRow> factuurRowsFactuur2 = new ArrayList<FactuurRow>();

    Calendar factuur2Calendar = Calendar.getInstance();
    factuur2Calendar.set(2011, 2, 19, 23, 54, 12);
    factuur2Calendar.set(Calendar.MILLISECOND, 0);

    FactuurRow factuurRow1Factuur2 = new FactuurRow();
    factuurRow1Factuur2.setProductOmschrijving(
        "Auto met 301 characters omschrijving. Auto met een hele lang");
    factuurRow1Factuur2.setAantal(3.0);
    factuurRow1Factuur2.setPrijsPerStuk(8666.666666666666);
    factuurRow1Factuur2.setBtwType(FactuurRow.BtwType.HOOG);
    factuurRow1Factuur2.setRegelDatum(factuur2Calendar.getTime());
    factuurRow1Factuur2.setEenheid("stuk");
    factuurRow1Factuur2.setTekstRegels(tekstRowsFactuurRow1Factuur2);
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
    factuurRow1Factuur3.setTekstRegels(new ArrayList<TekstRow>());
    factuurRowsFactuur3.add(factuurRow1Factuur3);

    FactuurRow factuurRow2Factuur3 = new FactuurRow();
    factuurRow2Factuur3.setProductOmschrijving("BiFi");
    factuurRow2Factuur3.setAantal(13212.0);
    factuurRow2Factuur3.setPrijsPerStuk(5.541326067211626);
    factuurRow2Factuur3.setBtwType(FactuurRow.BtwType.LAAG);
    factuurRow2Factuur3.setRegelDatum(factuur3Calendar.getTime());
    factuurRow2Factuur3.setEenheid("stuk");
    factuurRow2Factuur3.setTekstRegels(new ArrayList<TekstRow>());
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

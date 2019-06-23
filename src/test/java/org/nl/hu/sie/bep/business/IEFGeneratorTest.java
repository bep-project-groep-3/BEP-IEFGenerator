package org.nl.hu.sie.bep.business;

import org.junit.BeforeClass;
import org.junit.Test;
import org.nl.hu.sie.bep.adapter.IEFGenerator;
import org.nl.hu.sie.bep.adapter.IEFGeneratorAdapter;
import org.nl.hu.sie.bep.external.domain.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class IEFGeneratorTest {
  private static IEFGeneratorAdapter iefGenerator;

  @BeforeClass
  public static void initIEFGenerator() {
    iefGenerator = new IEFGenerator();
  }

  @Test
  public void testIEFGenerator() {
    List<FactuurRegel> factuurRegelsFactuur1 = new ArrayList<FactuurRegel>();
    factuurRegelsFactuur1.add(
        new FactuurRegel(
            1,
            1,
            "Auto met 301 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvin",
            3,
            26000,
            'H',
            "stuk",
            1));
    factuurRegelsFactuur1.add(
        new FactuurRegel(
            2,
            2,
            "Auto met 300 characters omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijving. Auto met een hele lange omschrijvi",
            3,
            1029100,
            'H',
            "stuk",
            1));
    factuurRegelsFactuur1.add(new FactuurRegel(3, 4, "Fiets", 2, 4000, 'H', "stuk", 1));
    factuurRegelsFactuur1.add(new FactuurRegel(4, 88, "Motor", 8, 199999, 'H', "stuk", 1));
    factuurRegelsFactuur1.add(new FactuurRegel(5, 98, "Bifi", 23, 460, 'L', "kg", 1));

    List<Factuur> facturenKlant1 = new ArrayList<Factuur>();
    facturenKlant1.add(
        new Factuur(1, new Date(), 1, "Opmerking van factuur 1", 1, 1, factuurRegelsFactuur1));

    List<Adres> adressenKlant1 = new ArrayList<Adres>();
    adressenKlant1.add(
        new Adres(1, "Claude Debussylaan", 'v', "34", "1082MD", "Amsterdam", "RABONL2U", 1));

    List<Persoon> contactPersonenKlant1 = new ArrayList<Persoon>();
    contactPersonenKlant1.add(
        new Persoon(1, "Pim", "van der", "Feltz", 1234, "010-12345678", 'm', 1));

    List<Klant> klanten = new ArrayList<Klant>();
    klanten.add(
        new Klant(
            1,
            "Google Amsterdam",
            "BV",
            "NL001234567B01",
            "NL44RABO0123456789",
            "1234",
            "RABONL2U",
            adressenKlant1,
            contactPersonenKlant1,
            facturenKlant1));

    Bedrijf bedrijf =
        new Bedrijf(
            "BiFi",
            "Kalverstraat",
            "1",
            "1012PA",
            "Amsterdam",
            "NL002234567B01",
            "NL12RABO0124525121",
            "RABONL2U",
            klanten);

    iefGenerator.generate(bedrijf);
    assertTrue(true);
  }
}

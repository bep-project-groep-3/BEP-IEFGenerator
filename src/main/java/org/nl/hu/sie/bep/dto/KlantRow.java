package org.nl.hu.sie.bep.dto;

import java.util.List;

public class KlantRow extends Row{
    public KlantRow() {
        super(RowType.KLANT);
    }

    public void convert(Klant klant){

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
}

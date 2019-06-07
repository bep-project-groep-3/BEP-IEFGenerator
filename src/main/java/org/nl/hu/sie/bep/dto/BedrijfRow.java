package org.nl.hu.sie.bep.dto;

import java.util.List;

public class BedrijfRow extends Row{
    public BedrijfRow() {
        super(RowType.BEDRIJF);
    }

    public void convert(Bedrijf bedrijf){

    }

    private String bedrijfsNaam;
    private String straat;
    private String straatNummer;
    private String postcode;
    private String plaats;
    private String btwcode;
    private String iban;
    private String bic;
    private List<KlantRow> klanten;
}

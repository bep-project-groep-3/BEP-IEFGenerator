package org.nl.hu.sie.bep.dto;

public class TekstRow extends Row{
    public TekstRow() {
        super(RowType.TEKST);
    }

    public void convert(String text){
        productieOmschrijving = text;
    }

    private String productieOmschrijving;
}

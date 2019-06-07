package org.nl.hu.sie.bep.dto;

import java.util.Date;
import java.util.List;

public class FactuurRow extends Row{
    protected enum BtwType {
        GEEN,
        LAAG,
        HOOG
    }

    public FactuurRow() {
        super(RowType.FACTUURREGEL);
    }

    public void convert(FactuurRegel factuurRegel){

    }

    private String productOmschrijving;
    private double aantal;
    private double prijsPerStuk;
    private BtwType btwType;
    private Date regelDatum;
    private String eenheid;
    private List<TekstRow> tekstRegels;
}

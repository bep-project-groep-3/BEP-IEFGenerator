package org.nl.hu.sie.bep.dto;

import java.util.Date;
import java.util.List;

public class FactuurInfoRow extends Row{
    public FactuurInfoRow() {
        super(RowType.FACTUUR);
    }

    public void convert(Factuur factuur){

    }

    private Date factuurdatum;
    private String factuurNummer;
    private List<FactuurRow> factuurRegels;
}

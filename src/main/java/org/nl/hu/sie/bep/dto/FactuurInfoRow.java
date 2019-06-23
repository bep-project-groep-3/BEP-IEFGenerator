package org.nl.hu.sie.bep.dto;

import org.nl.hu.sie.bep.external.domain.Factuur;
import org.nl.hu.sie.bep.external.domain.FactuurRegel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FactuurInfoRow extends Row {
  public FactuurInfoRow() {
    super(RowType.FACTUUR);
  }

  private Date factuurdatum;
  private String factuurNummer;
  private List<FactuurRow> factuurRegels;

  public void convert(Factuur factuur) {
    factuurdatum = factuur.getDatumtijd();
    factuurNummer = Integer.toString(factuur.getNummer());

    factuurRegels = new ArrayList<FactuurRow>();
    for (FactuurRegel factuurRegel : factuur.getRegels()) {
      FactuurRow factuurRow = new FactuurRow();
      factuurRow.convert(factuur, factuurRegel);
      factuurRegels.add(factuurRow);
    }
  }
}

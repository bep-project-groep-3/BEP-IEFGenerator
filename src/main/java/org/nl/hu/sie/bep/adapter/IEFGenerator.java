package org.nl.hu.sie.bep.adapter;

import org.nl.hu.sie.bep.business.adapter.SaverAdapter;
import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.dto.BedrijfRow;
import org.nl.hu.sie.bep.dto.Row;
import org.nl.hu.sie.bep.factories.IEFFactory;

public class IEFGenerator implements IEFGeneratorAdapter {

  public Row generate(int maand, Bedrijf bedrijf) {
    BedrijfRow bedrijfRow = (BedrijfRow) IEFFactory.create(bedrijf);

    SaverAdapter saverAdapter = new SaverAdapter();
    saverAdapter.save(maand, bedrijfRow);

    return bedrijfRow;
  }
}

package org.nl.hu.sie.bep.adapter;

import org.nl.hu.sie.bep.dto.Row;
import org.nl.hu.sie.bep.external.domain.Bedrijf;
import org.nl.hu.sie.bep.external.saver.SaverAdapter;
import org.nl.hu.sie.bep.factories.IEFFactory;

public class IEFGenerator implements IEFGeneratorAdapter {

  public void generate(Bedrijf bedrijf) {
    Row bedrijfRow = IEFFactory.create(bedrijf);

    SaverAdapter saverAdapter = new SaverAdapter();
    saverAdapter.save(bedrijfRow);
  }
}

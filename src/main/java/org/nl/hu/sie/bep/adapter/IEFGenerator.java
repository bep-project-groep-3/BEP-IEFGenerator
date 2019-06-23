package org.nl.hu.sie.bep.adapter;

import org.nl.hu.sie.bep.domain.Bedrijf;
import org.nl.hu.sie.bep.dto.Row;
import org.nl.hu.sie.bep.factories.IEFFactory;

public class IEFGenerator implements IEFGeneratorAdapter {

  public void generate(Bedrijf bedrijf) {
    Row bedrijfsRow = IEFFactory.create(bedrijf);
    System.out.println(bedrijfsRow);

    // SaverAdapter saverAdapter = new Saver();
    // saverAdapter.save(bedrijfsRow);
  }
}

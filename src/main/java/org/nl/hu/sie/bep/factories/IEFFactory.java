package org.nl.hu.sie.bep.factories;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.dto.BedrijfRow;
import org.nl.hu.sie.bep.dto.Row;

public class IEFFactory {
  private IEFFactory() {}

  public static Row create(Bedrijf bedrijf) {
    BedrijfRow bedrijfRow = new BedrijfRow();
    bedrijfRow.convert(bedrijf);
    return bedrijfRow;
  }
}

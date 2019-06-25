package org.nl.hu.sie.bep.adapter;

import org.nl.hu.sie.bep.domain.domain.Bedrijf;
import org.nl.hu.sie.bep.dto.Row;

public interface IEFGeneratorAdapter {
  Row generate(int maand, Bedrijf bedrijf);
}

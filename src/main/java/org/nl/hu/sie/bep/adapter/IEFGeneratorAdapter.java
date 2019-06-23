package org.nl.hu.sie.bep.adapter;

import org.nl.hu.sie.bep.dto.Row;
import org.nl.hu.sie.bep.external.domain.Bedrijf;

public interface IEFGeneratorAdapter {
    Row generate(Bedrijf bedrijf);
}

package org.nl.hu.sie.bep.adapter;

import org.nl.hu.sie.bep.dto.Row;
import org.nl.hu.sie.bep.factories.IEFFactory;

public class IEFGenerator implements IEFGeneratorAdapter {

    public void generate(Company company) {
        Row bedrijfsRow = IEFFactory.create(company);

        SaverAdapter saverAdapter = new Saver();
        saverAdapter.save(bedrijfsRow);
    }
}

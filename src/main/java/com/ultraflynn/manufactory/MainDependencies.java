package com.ultraflynn.manufactory;

import com.ultraflynn.manufactory.cli.CliReader;
import com.ultraflynn.manufactory.cli.JOptSimpleReader;
import com.ultraflynn.manufactory.model.JsonFacilityBuilder;

public class MainDependencies implements Dependencies {
    @Override
    public CliReader cliReader() {
        return new JOptSimpleReader();
    }

    @Override
    public FacilityBuilder facilityBuilder() {
        return new JsonFacilityBuilder();
    }
}

package com.ultraflynn.manufactory;

import com.ultraflynn.manufactory.cli.CliReader;

public interface Dependencies {
    CliReader cliReader();

    FacilityBuilder facilityBuilder();
}

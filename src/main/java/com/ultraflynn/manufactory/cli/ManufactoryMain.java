package com.ultraflynn.manufactory.cli;

import com.ultraflynn.manufactory.Dependencies;
import com.ultraflynn.manufactory.MainDependencies;
import com.ultraflynn.manufactory.model.Facility;

public class ManufactoryMain {
    private final Dependencies dependencies;

    ManufactoryMain(Dependencies dependencies) {
        this.dependencies = dependencies;
    }

    public static void main(String[] args) {
        new ManufactoryMain(new MainDependencies());
    }

    void start(String[] args) {
        CliReader cliReader = dependencies.cliReader();
        String definitionFile = cliReader.readDefinitionFile(args);
        Facility facility = dependencies.facilityBuilder().fromFile(definitionFile);
        facility.analyse();
    }
}

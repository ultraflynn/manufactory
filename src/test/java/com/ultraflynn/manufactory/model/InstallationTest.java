package com.ultraflynn.manufactory.model;

import org.junit.Test;

import static com.ultraflynn.manufactory.types.ProcessedMaterial.OXYGEN;
import static com.ultraflynn.manufactory.types.RawMaterial.AUTOTROPHS;

public class InstallationTest {
    @Test
    public void shouldBuildAnEmptyInstallation() {
        Installation installation = Installation.newInstallation()
                .build();
    }

    public void otherStuff() throws Exception {
        Installation installation = Installation.newInstallation()
                .extractor("SY-1YA", AUTOTROPHS)
                .basicFactory("XS-9AI", OXYGEN)
                .silo("RR-66G")
                .launchpad("IY-66F")
                .link("SY-1YA", "RR-66G")
                .link("RR-66G", "XS-9AI")
                .link("XS-9AI", "IY-66F")
                .build();

    }
}
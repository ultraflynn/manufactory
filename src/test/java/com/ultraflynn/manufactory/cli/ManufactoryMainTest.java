package com.ultraflynn.manufactory.cli;

import com.ultraflynn.manufactory.TestDependencies;
import com.ultraflynn.manufactory.model.Facility;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ManufactoryMainTest {
    private TestDependencies dependencies;

    @Mock
    private Facility facility;

    @Before
    public void setUp() {
        dependencies = new TestDependencies();
    }

    @Test
    public void shouldAnalyseFacilityFromJsonFile() {
        String[] args = {"filename"};

        when(dependencies.cliReader().readDefinitionFile(args)).thenReturn("definition-file");
        when(dependencies.facilityBuilder().fromFile("definition-file")).thenReturn(facility);

        ManufactoryMain main = new ManufactoryMain(dependencies);
        main.start(args);

        verify(facility).analyse();
    }
}
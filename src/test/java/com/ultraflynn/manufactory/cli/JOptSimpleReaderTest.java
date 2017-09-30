package com.ultraflynn.manufactory.cli;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JOptSimpleReaderTest {
    @Test
    public void shouldParseDefinitionFile() {
        JOptSimpleReader reader = new JOptSimpleReader();
        String definitionFile = reader.readDefinitionFile(new String[]{"-d", "dummy-definition.json"});

        assertThat(definitionFile, is("dummy-definition.json"));
    }
}
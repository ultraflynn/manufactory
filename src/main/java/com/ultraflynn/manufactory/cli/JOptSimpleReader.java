package com.ultraflynn.manufactory.cli;

import joptsimple.OptionParser;
import joptsimple.OptionSet;
import joptsimple.OptionSpec;

public class JOptSimpleReader implements CliReader {
    @Override
    public String readDefinitionFile(String[] args) {
        OptionParser parser = new OptionParser();
        OptionSpec<String> definition = parser.accepts("d").withRequiredArg().ofType(String.class);

        OptionSet options = parser.parse(args);
        return definition.value(options);
    }
}

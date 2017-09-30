package com.ultraflynn.manufactory;

import com.google.common.collect.Maps;
import com.ultraflynn.manufactory.cli.CliReader;
import org.mockito.Mockito;

import java.util.Map;

public class TestDependencies implements Dependencies {
    private final Map<Class<?>, Object> mocks = Maps.newHashMap();

    private <T> T mock(Class<T> type) {
        return type.cast(mocks.computeIfAbsent(type, Mockito::mock));
    }

    @Override
    public CliReader cliReader() {
        return mock(CliReader.class);
    }

    @Override
    public FacilityBuilder facilityBuilder() {
        return mock(FacilityBuilder.class);
    }
}

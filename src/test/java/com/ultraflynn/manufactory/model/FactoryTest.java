package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.SpecializedCommodity;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void shouldInstantiate() {
        Factory factory = new Factory("XS-9AI", SpecializedCommodity.BIOTECH_RESEARCH_REPORTS);
    }
}
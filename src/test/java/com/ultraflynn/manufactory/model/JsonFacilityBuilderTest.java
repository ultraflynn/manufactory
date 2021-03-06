package com.ultraflynn.manufactory.model;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class JsonFacilityBuilderTest {
    @Test
    public void shouldReadFacilityFromFile() {
        JsonFacilityBuilder facilityBuilder = new JsonFacilityBuilder();
        Facility facility = facilityBuilder.fromFile("src/test/resources/schematics/all-types.json");

        System.out.println(facility);
        assertThat(facility, is(not(nullValue())));
    }
}
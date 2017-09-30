package com.ultraflynn.manufactory.model;

import com.google.gson.Gson;
import com.ultraflynn.manufactory.FacilityBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JsonFacilityBuilder implements FacilityBuilder {
    private static final Gson GSON = new Gson();

    @Override
    public Facility fromFile(String definitionFile) {
        try {
            FileReader json = new FileReader(new File(definitionFile));
            return GSON.fromJson(json, Facility.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

package com.ultraflynn.manufactory.model;

import com.google.gson.*;
import com.ultraflynn.manufactory.FacilityBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;

public class JsonFacilityBuilder implements FacilityBuilder {
    private static final Gson GSON;

    static {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Building.class, new BuildingDeserializer());
        GSON = builder.create();
    }

    private static class BuildingDeserializer implements JsonDeserializer<Building> {
        @Override
        public Building deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
                throws JsonParseException {
            JsonElement element = jsonElement.getAsJsonObject().get("type");

            String buildingType = element.getAsString();
            if ("EXTRACTOR".equals(buildingType)) {
                return context.deserialize(jsonElement, Extractor.class);
            } else if ("FACTORY".equals(buildingType)) {
                return context.deserialize(jsonElement, Factory.class);
            } else if ("SILO".equals(buildingType)) {
                return context.deserialize(jsonElement, Silo.class);
            } else if ("LAUNCHPAD".equals(buildingType)) {
                return context.deserialize(jsonElement, Launchpad.class);
            } else {
                throw new RuntimeException("Unsupport building type " + buildingType);
            }
        }
    }

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

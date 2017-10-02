package com.ultraflynn.manufactory.model;

import com.google.gson.*;
import com.ultraflynn.manufactory.FacilityBuilder;
import com.ultraflynn.manufactory.types.AdvancedCommodity;
import com.ultraflynn.manufactory.types.ProcessedMaterial;
import com.ultraflynn.manufactory.types.RefinedCommodity;
import com.ultraflynn.manufactory.types.SpecializedCommodity;

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

    @Override
    public Facility fromFile(String definitionFile) {
        try {
            FileReader json = new FileReader(new File(definitionFile));
            return GSON.fromJson(json, Facility.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static class BuildingDeserializer implements JsonDeserializer<Building> {
        @Override
        public Building deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext context)
                throws JsonParseException {
            JsonElement buildingElement = jsonElement.getAsJsonObject().get("type");

            String buildingType = buildingElement.getAsString();
            if ("EXTRACTOR".equals(buildingType)) {
                return context.deserialize(jsonElement, Extractor.class);
            } else if ("FACTORY".equals(buildingType)) {
                JsonElement outputElement = jsonElement.getAsJsonObject().get("output");

                String outputType = outputElement.getAsString();

                if (ProcessedMaterial.fromString(outputType).isPresent()) {
                    return context.deserialize(jsonElement, ProcessedMaterialFactory.class);
                } else if (RefinedCommodity.fromString(outputType).isPresent()) {
                    return context.deserialize(jsonElement, RefinedCommodityFactory.class);
                } else if (SpecializedCommodity.fromString(outputType).isPresent()) {
                    return context.deserialize(jsonElement, SpecializedCommodityFactory.class);
                } else if (AdvancedCommodity.fromString(outputType).isPresent()) {
                    return context.deserialize(jsonElement, AdvancedCommodityFactory.class);
                } else {
                    throw new RuntimeException("Unsupported factory output " + outputType);
                }

            } else if ("SILO".equals(buildingType)) {
                return context.deserialize(jsonElement, Silo.class);
            } else if ("LAUNCHPAD".equals(buildingType)) {
                return context.deserialize(jsonElement, Launchpad.class);
            } else {
                throw new RuntimeException("Unsupported building " + buildingType);
            }
        }
    }
}

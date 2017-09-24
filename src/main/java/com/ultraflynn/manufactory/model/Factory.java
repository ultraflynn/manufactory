package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.AdvancedCommodity;
import com.ultraflynn.manufactory.types.ProcessedMaterial;
import com.ultraflynn.manufactory.types.RefinedCommodity;
import com.ultraflynn.manufactory.types.SpecializedCommodity;

import static com.ultraflynn.manufactory.model.Factory.Type.*;

public class Factory implements Building {
    public enum Type {
        BASIC_INDUSTRY_FACILITY,
        ADVANCED_INDUSTRY_FACILITY,
        HIGH_TECH_PRODUCTION_PLANT
    }

    private final Type type;

    public Factory(String name, ProcessedMaterial material) {
        type = BASIC_INDUSTRY_FACILITY;
    }

    public Factory(String name, RefinedCommodity commodity) {
        type = ADVANCED_INDUSTRY_FACILITY;
    }

    public Factory(String name, SpecializedCommodity commodity) {
        type = ADVANCED_INDUSTRY_FACILITY;
    }

    public Factory(String name, AdvancedCommodity commodity) {
        type = HIGH_TECH_PRODUCTION_PLANT;
    }
}

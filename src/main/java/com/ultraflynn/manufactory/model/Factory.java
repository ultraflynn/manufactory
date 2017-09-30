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

    private final String name;
    private final Type type;

    public Factory(String name, ProcessedMaterial material) {
        this.name = name;
        this.type = BASIC_INDUSTRY_FACILITY;
    }

    public Factory(String name, RefinedCommodity commodity) {
        this.name = name;
        this.type = ADVANCED_INDUSTRY_FACILITY;
    }

    public Factory(String name, SpecializedCommodity commodity) {
        this.name = name;
        this.type = ADVANCED_INDUSTRY_FACILITY;
    }

    public Factory(String name, AdvancedCommodity commodity) {
        this.name = name;
        this.type = HIGH_TECH_PRODUCTION_PLANT;
    }

    @Override
    public String toString() {
        return "Factory{" +
                "name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}

package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.RawMaterial;

import java.util.List;

import static com.ultraflynn.manufactory.types.RawMaterial.*;

public class Planet {
    private final Type type;
    private final String name;
    private final List<Installation> installations;
    public Planet(Type type, String name, List<Installation> installations) {
        this.type = type;
        this.name = name;
        this.installations = installations;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", installations=" + installations +
                '}';
    }

    public enum Type {
        BARREN("Barren", AQUEOUS_LIQUIDS, BASE_METALS, CARBON_COMPOUNDS, MICRO_ORGANISMS, NOBLE_METALS),
        GAS("Gas", AQUEOUS_LIQUIDS, BASE_METALS, IONIC_SOLUTIONS, NOBLE_GAS, REACTIVE_GAS),
        ICE("Ice", AQUEOUS_LIQUIDS, HEAVY_METALS, MICRO_ORGANISMS, NOBLE_GAS, PLANKTIC_COLONIES),
        LAVA("Lava", BASE_METALS, FELSIC_MAGMA, HEAVY_METALS, NON_CS_CRYSTALS, SUSPENDED_PLASMA),
        OCEANIC("Oceanic", AQUEOUS_LIQUIDS, CARBON_COMPOUNDS, COMPLEX_ORGANISMS, MICRO_ORGANISMS, PLANKTIC_COLONIES),
        PLASMA("Plasma", BASE_METALS, HEAVY_METALS, NOBLE_METALS, NON_CS_CRYSTALS, SUSPENDED_PLASMA),
        STORM("Storm", AQUEOUS_LIQUIDS, BASE_METALS, IONIC_SOLUTIONS, NOBLE_GAS, SUSPENDED_PLASMA),
        TEMPERATE("Temperate", AQUEOUS_LIQUIDS, AUTOTROPHS, CARBON_COMPOUNDS, COMPLEX_ORGANISMS, MICRO_ORGANISMS);

        private final String name;
        private final RawMaterial[] materials;

        Type(String name, RawMaterial... materials) {
            this.name = name;
            this.materials = materials;
        }
    }
}

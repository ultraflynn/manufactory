package com.ultraflynn.manufactory.types;

import static com.ultraflynn.manufactory.types.RawMaterial.*;

public enum ProcessedMaterial {
    BACTERIA("Bacteria", MICRO_ORGANISMS),
    BIOFUELS("Biofuels", CARBON_COMPOUNDS),
    BIOMASS("Biomass", PLANKTIC_COLONIES),
    CHIRAL_STRUCTURES("Chiral Structures", NON_CS_CRYSTALS),
    ELECTROLYTES("Electrolytes", IONIC_SOLUTIONS),
    INDUSTRIAL_FIBERS("Industrial Fibers", AUTOTROPHS),
    OXIDIZING_COMPOUND("Oxidizing Compound", REACTIVE_GAS),
    OXYGEN("Oxygen", NOBLE_GAS),
    PLASMOIDS("Plasmoids", SUSPENDED_PLASMA),
    PRECIOUS_METALS("Precious Metals", NOBLE_METALS),
    PROTEINS("Proteins", COMPLEX_ORGANISMS),
    REACTIVE_METALS("Reactive Metals", BASE_METALS),
    SILICON("Silicon", FELSIC_MAGMA),
    TOXIC_METALS("Toxic Metals", HEAVY_METALS),
    WATER("Water", AQUEOUS_LIQUIDS);

    public static final double VOLUME = 0.38;

    private final String name;
    private final RawMaterial input;

    ProcessedMaterial(String name, RawMaterial input) {
        this.name = name;
        this.input = input;
    }
}

package com.ultraflynn.manufactory.types;

public enum RawMaterial {
    MICRO_ORGANISMS("Micro Organisms"),
    CARBON_COMPOUNDS("Carbon Compounds"),
    PLANKTIC_COLONIES("Planktic Colonies"),
    NON_CS_CRYSTALS("Non-CS Crystals"),
    IONIC_SOLUTIONS("Ionic Solutions"),
    AUTOTROPHS("Autotrophs"),
    REACTIVE_GAS("Reactive Gas"),
    NOBLE_GAS("Noble Gas"),
    SUSPENDED_PLASMA("Suspended Plasma"),
    NOBLE_METALS("Noble Metals"),
    COMPLEX_ORGANISMS("Complex Organisms"),
    BASE_METALS("Base Metals"),
    FELSIC_MAGMA("Felsic Magma"),
    HEAVY_METALS("Heavy Metals"),
    AQUEOUS_LIQUIDS("Aqueous Liquids");

    public static final double VOLUME = 0.01;

    private final String name;

    RawMaterial(String name) {
        this.name = name;
    }
}

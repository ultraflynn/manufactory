package com.ultraflynn.manufactory.types;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Optional;

import static com.ultraflynn.manufactory.types.ProcessedMaterial.*;

public enum RefinedCommodity {
    BIOCELLS("Biocells", PRECIOUS_METALS, BIOFUELS),
    CONSTRUCTION_BLOCKS("onstruction Blocks", TOXIC_METALS, REACTIVE_METALS),
    CONSUMER_ELECTRONICS("Consumer Electronics", CHIRAL_STRUCTURES, TOXIC_METALS),
    COOLANT("Coolant", WATER, ELECTROLYTES),
    ENRICHED_URANIUM("Enriched Uranium", TOXIC_METALS, PRECIOUS_METALS),
    FERTILIZER("Fertilizer", PROTEINS, BACTERIA),
    GENETICALLY_ENHANCED_LIVESTOCK("Gen. Enhanced Livestock", BIOMASS, PROTEINS),
    LIVESTOCK("Livestock", BIOFUELS, PROTEINS),
    MECHANICAL_PARTS("Mechanical Parts", PRECIOUS_METALS, REACTIVE_METALS),
    MICROFIBER_SHIELDING("Microfiber Shielding", SILICON, INDUSTRIAL_FIBERS),
    MINIATURE_ELECTRONICS("Miniature Electronics", SILICON, CHIRAL_STRUCTURES),
    NANITES("Nanites", REACTIVE_METALS, BACTERIA),
    OXIDES("Oxides", OXYGEN, OXIDIZING_COMPOUND),
    POLYARAMIDS("Polyaramids", INDUSTRIAL_FIBERS, OXIDIZING_COMPOUND),
    POLYTEXTILES("Polytextiles", INDUSTRIAL_FIBERS, BIOFUELS),
    ROCKET_FUEL("Rocket Fuel", ELECTROLYTES, PLASMOIDS),
    SILICATE_GLASS("Silicate Glass", SILICON, OXIDIZING_COMPOUND),
    SUPERCONDUCTORS("Superconductors", WATER, PLASMOIDS),
    SUPERTENSILE_PLASTICS("Supertensile Plastics", BIOMASS, OXYGEN),
    SYNTHETIC_OIL("Synthetic Oil", OXYGEN, ELECTROLYTES),
    TEST_CULTURES("Test Cultures", WATER, BACTERIA),
    TRANSMITTER("Transmitter", CHIRAL_STRUCTURES, PLASMOIDS),
    VIRAL_AGENT("Viral Agent", BIOMASS, BACTERIA),
    WATERCOOLED_CPU("Water-Cooled CPU", WATER, REACTIVE_METALS);

    public static final double VOLUME = 1.5;
    private static final Map<String, RefinedCommodity> lookup = Maps.newHashMap();

    static {
        for (RefinedCommodity m : values()) lookup.put(m.toString(), m);
    }

    private final String name;
    private final ProcessedMaterial input1;
    private final ProcessedMaterial input2;
    RefinedCommodity(String name, ProcessedMaterial input1, ProcessedMaterial input2) {
        this.name = name;
        this.input1 = input1;
        this.input2 = input2;
    }

    public static Optional<RefinedCommodity> fromString(String s) {
        return Optional.ofNullable(lookup.get(s));
    }
}

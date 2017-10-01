package com.ultraflynn.manufactory.types;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.Optional;

import static com.ultraflynn.manufactory.types.RefinedCommodity.*;

public enum SpecializedCommodity {
    BIOTECH_RESEARCH_REPORTS("Biotech Research Reports", NANITES, LIVESTOCK, CONSTRUCTION_BLOCKS),
    CAMERA_DRONES("Camera Drones", SILICATE_GLASS, ROCKET_FUEL),
    CONDENSATES("Condensates", OXIDES, COOLANT),
    CRYOPROTECTANT_SOLUTION("Cryoprotectant Solution", TEST_CULTURES, SYNTHETIC_OIL, FERTILIZER),
    DATA_CHIPS("Data Chips", SUPERTENSILE_PLASTICS, MICROFIBER_SHIELDING),
    GEL_MATRIX_BIOPASTE("Gel-Matrix Biopaste", OXIDES, BIOCELLS, SUPERCONDUCTORS),
    GUIDANCE_SYSTEMS("Guidance Systems", WATERCOOLED_CPU, TRANSMITTER),
    HAZMAT_DETECTION_SYSTEMS("Hazmat Detection Systems", POLYTEXTILES, VIRAL_AGENT, TRANSMITTER),
    HERMETIC_MEMBRANES("Hermetic Membranes", POLYARAMIDS, GENETICALLY_ENHANCED_LIVESTOCK),
    HIGH_TECH_TRANSMITTERS("High-Tech Transmitters", POLYARAMIDS, TRANSMITTER),
    INDUSTRIAL_EXPLOSIVES("Industrial Explosives", FERTILIZER, POLYTEXTILES),
    NEOCOMS("Neocoms", BIOCELLS, SILICATE_GLASS),
    NUCLEAR_REACTORS("Nuclear Reactors", MICROFIBER_SHIELDING, ENRICHED_URANIUM),
    PLANETARY_VEHICLES("Planetary Vehicles", SUPERTENSILE_PLASTICS, MECHANICAL_PARTS, MINIATURE_ELECTRONICS),
    ROBOTICS("Robotics", MECHANICAL_PARTS, CONSUMER_ELECTRONICS),
    SMARTFAB_UNITS("Smartfab Units", CONSTRUCTION_BLOCKS, MINIATURE_ELECTRONICS),
    SUPERCOMPUTERS("Supercomputers", WATERCOOLED_CPU, COOLANT, CONSUMER_ELECTRONICS),
    SYNTHETIC_SYNAPSES("Synthetic Synapses", SUPERTENSILE_PLASTICS, TEST_CULTURES),
    TRANSCRANIAL_MICROCONTROLLERS("Transcranial Microcontrollers", BIOCELLS, NANITES),
    UKOMI_SUPERCONDUCTORS("Ukomi Superconductors", SYNTHETIC_OIL, SUPERCONDUCTORS),
    VACCINES("Vaccines", LIVESTOCK, VIRAL_AGENT);

    private static final Map<String, SpecializedCommodity> lookup = Maps.newHashMap();

    static {
        for (SpecializedCommodity m : values()) lookup.put(m.toString(), m);
    }

    public static Optional<SpecializedCommodity> fromString(String s) {
        return Optional.ofNullable(lookup.get(s));
    }

    public static final double VOLUME = 6.0;

    private final String name;
    private final RefinedCommodity input1;
    private final RefinedCommodity input2;
    private final Optional<RefinedCommodity> input3;

    SpecializedCommodity(String name, RefinedCommodity input1, RefinedCommodity input2) {
        this.name = name;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = Optional.empty();
    }

    SpecializedCommodity(String name, RefinedCommodity input1, RefinedCommodity input2, RefinedCommodity input3) {
        this.name = name;
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = Optional.of(input3);
    }
}

package com.ultraflynn.manufactory.types;

import java.util.Optional;

import static com.ultraflynn.manufactory.types.ProcessedMaterial.BACTERIA;
import static com.ultraflynn.manufactory.types.ProcessedMaterial.REACTIVE_METALS;
import static com.ultraflynn.manufactory.types.ProcessedMaterial.WATER;
import static com.ultraflynn.manufactory.types.SpecializedCommodity.*;

public enum AdvancedCommodity {
    BROADCAST_NODE("Broadcast Node", NEOCOMS, DATA_CHIPS, HIGH_TECH_TRANSMITTERS),
    INTEGRITY_RESPONSE_DRONES("Integrity Response Drones", GEL_MATRIX_BIOPASTE, HAZMAT_DETECTION_SYSTEMS, PLANETARY_VEHICLES),
    NANO_FACTORY("Nano-Factory", INDUSTRIAL_EXPLOSIVES, UKOMI_SUPERCONDUCTORS, REACTIVE_METALS),
    ORGANIC_MORTAR_APPLICATORS("Organic Mortar Applicators", CONDENSATES, ROBOTICS, BACTERIA),
    RECURSIVE_COMPUTING_MODULE("Recursive Computing Module", SYNTHETIC_SYNAPSES, GUIDANCE_SYSTEMS, TRANSCRANIAL_MICROCONTROLLERS),
    SELF_HARMONIZING_POWER_CORE("Self-Harmonizing Power Core", CAMERA_DRONES, NUCLEAR_REACTORS, HERMETIC_MEMBRANES),
    STERILE_CONDUITS("Sterile Conduits", SMARTFAB_UNITS, VACCINES, WATER),
    WETWARE_MAINFRAME("Wetware Mainframe", SUPERCOMPUTERS, BIOTECH_RESEARCH_REPORTS, CRYOPROTECTANT_SOLUTION);

    public static final double VOLUME = 100.0;

    private final String name;
    private final SpecializedCommodity input1;
    private final SpecializedCommodity input2;
    private final Optional<ProcessedMaterial> input3processed;
    private final Optional<SpecializedCommodity> input3specialized;

    AdvancedCommodity(String name, SpecializedCommodity input1, SpecializedCommodity input2, ProcessedMaterial input3) {
        this.name = name;
        this.input1 = input1;
        this.input2 = input2;
        this.input3processed = Optional.of(input3);
        this.input3specialized = Optional.empty();
    }

    AdvancedCommodity(String name, SpecializedCommodity input1, SpecializedCommodity input2, SpecializedCommodity input3) {
        this.name = name;
        this.input1 = input1;
        this.input2 = input2;
        this.input3processed = Optional.empty();
        this.input3specialized = Optional.of(input3);
    }
}

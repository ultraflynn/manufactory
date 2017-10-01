package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.ProcessedMaterial;

public class ProcessedMaterialFactory implements Building {
    private final String name;
    private final ProcessedMaterial output;

    public ProcessedMaterialFactory(String name, ProcessedMaterial output) {
        this.name = name;
        this.output = output;
    }

    @Override
    public String toString() {
        return "ProcessedMaterialFactory{" +
                "name='" + name + '\'' +
                ", output=" + output +
                '}';
    }
}

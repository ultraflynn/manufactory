package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.RawMaterial;

public class Extractor implements Building {
    private final String name;
    private final RawMaterial material;

    public Extractor(String name, RawMaterial material) {
        this.name = name;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Extractor{" +
                "name='" + name + '\'' +
                ", material=" + material +
                '}';
    }
}

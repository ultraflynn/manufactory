package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.SpecializedCommodity;

public class SpecializedCommodityFactory implements Building {
    private final String name;
    private final SpecializedCommodity output;

    public SpecializedCommodityFactory(String name, SpecializedCommodity output) {
        this.name = name;
        this.output = output;
    }

    @Override
    public String toString() {
        return "SpecializedCommodityFactory{" +
                "name='" + name + '\'' +
                ", output=" + output +
                '}';
    }
}

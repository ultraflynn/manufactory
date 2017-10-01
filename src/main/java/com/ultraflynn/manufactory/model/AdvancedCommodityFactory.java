package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.AdvancedCommodity;

public class AdvancedCommodityFactory implements Building {
    private final String name;
    private final AdvancedCommodity output;

    public AdvancedCommodityFactory(String name, AdvancedCommodity output) {
        this.name = name;
        this.output = output;
    }

    @Override
    public String toString() {
        return "AdvancedCommodityFactory{" +
                "name='" + name + '\'' +
                ", output=" + output +
                '}';
    }
}

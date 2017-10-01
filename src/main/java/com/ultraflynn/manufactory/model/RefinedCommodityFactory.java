package com.ultraflynn.manufactory.model;

import com.ultraflynn.manufactory.types.RefinedCommodity;

public class RefinedCommodityFactory implements Building {
    private final String name;
    private final RefinedCommodity output;

    public RefinedCommodityFactory(String name, RefinedCommodity output) {
        this.name = name;
        this.output = output;
    }

    @Override
    public String toString() {
        return "RefinedCommodityFactory{" +
                "name='" + name + '\'' +
                ", output=" + output +
                '}';
    }
}

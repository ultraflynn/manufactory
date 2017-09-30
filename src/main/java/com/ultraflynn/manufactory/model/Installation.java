package com.ultraflynn.manufactory.model;

import java.util.List;

public class Installation {
    private final String name;
    private final List<Building> buildings;

    public Installation(String name, List<Building> buildings) {
        this.name = name;
        this.buildings = buildings;
    }

    @Override
    public String toString() {
        return "Installation{" +
                "name='" + name + '\'' +
                ", buildings=" + buildings +
                '}';
    }

}

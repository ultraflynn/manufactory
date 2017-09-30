package com.ultraflynn.manufactory.model;

import java.util.List;

public class Installation {
    private final String name;
    private final List<Building> buildings;
    private final List<Route> routes;

    public Installation(String name, List<Building> buildings, List<Route> routes) {
        this.name = name;
        this.buildings = buildings;
        this.routes = routes;
    }

    @Override
    public String toString() {
        return "Installation{" +
                "name='" + name + '\'' +
                ", buildings=" + buildings +
                ", routes=" + routes +
                '}';
    }

}

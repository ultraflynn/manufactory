package com.ultraflynn.manufactory.model;

import java.util.List;

public class Facility {
    private final String name;
    private final List<Planet> planets;

    public Facility(String name, List<Planet> planets) {
        this.name = name;
        this.planets = planets;
    }

    public void analyse() {
    }

    @Override
    public String toString() {
        return "Facility{" +
                "name='" + name + '\'' +
                ", planets=" + planets +
                '}';
    }
}

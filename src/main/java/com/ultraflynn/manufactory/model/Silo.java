package com.ultraflynn.manufactory.model;

public class Silo implements Building {
    private final String name;

    public Silo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Silo{" +
                "name='" + name + '\'' +
                '}';
    }
}

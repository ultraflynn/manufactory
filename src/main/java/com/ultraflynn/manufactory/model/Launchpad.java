package com.ultraflynn.manufactory.model;

public class Launchpad implements Building {
    private final String name;

    public Launchpad(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Launchpad{" +
                "name='" + name + '\'' +
                '}';
    }
}

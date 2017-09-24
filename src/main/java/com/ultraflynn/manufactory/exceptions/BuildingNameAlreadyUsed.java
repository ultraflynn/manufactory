package com.ultraflynn.manufactory.exceptions;

public class BuildingNameAlreadyUsed extends Exception {
    public BuildingNameAlreadyUsed(String name) {
        super("Building name has already been used - " + name);
    }
}

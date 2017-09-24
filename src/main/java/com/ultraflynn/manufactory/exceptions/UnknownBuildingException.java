package com.ultraflynn.manufactory.exceptions;

public class UnknownBuildingException extends Exception {
    public UnknownBuildingException(String building) {
        super("Unknown building: " + building);
    }
}

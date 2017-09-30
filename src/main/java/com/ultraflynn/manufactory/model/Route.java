package com.ultraflynn.manufactory.model;

public class Route {
    private final String from;
    private final String to;

    public Route(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public String toString() {
        return "Route{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}

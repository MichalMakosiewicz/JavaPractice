package com.makosavage;

public class Vehicle {

    private boolean handSteering;
    private String engine;
    private int direction;
    private int weight;

    public Vehicle(boolean handSteering, String engine, int direction, int weight) {
        this.handSteering = handSteering;
        this.engine = engine;
        this.direction = direction;
        this.weight = weight;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}

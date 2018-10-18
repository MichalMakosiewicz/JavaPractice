package com.makosavage;

public class Car extends Vehicle {

    private int weels;
    private int lights;
    private String Gas;
    private int gear;


    public Car(boolean handSteering, String engine, int direction, int weight, int weels, int lights, String gas, int gear) {
        super(handSteering, engine, direction, weight);
        this.weels = weels;
        this.lights = lights;
        Gas = gas;
        this.gear = 1;
    }
}

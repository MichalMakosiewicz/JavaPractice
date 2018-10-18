package com.makosavage;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;

    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String startEngine(){
        return "Car Undefined, Nothing heppend.";
    }

    public String accelerate(){
        return "Car Undefined, Nothing heppend.";
    }

    public String brake(){
        return "Car Undefined, Nothing heppend.";
    }
}

class Hyundai extends Car{
    public Hyundai(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Hyundai has started the engine!!!";
    }

    @Override
    public String accelerate() {
        return "Hyundai is accelerating!!!";
    }

    @Override
    public String brake() {
        return "Hyundai is breaking";
    }
}

class Bmw extends Car{
    public Bmw() {
        super("BMW", 6);
    }

    @Override
    public String startEngine() {
        return "BMW has started the engine.";
    }

    @Override
    public String accelerate() {
        return "This beast accelerate fast!";
    }

    @Override
    public String brake() {
        return "We are breaking in BMW";
    }
}

class Hummer extends Car{
    public Hummer(){
        super("Hummer", 8);
    }

    @Override
    public String startEngine() {
        return "Hummer has started WOAH!!!";
    }

    @Override
    public String accelerate() {
        return "Hummer is to fat to accelerate fast";
    }

    @Override
    public String brake() {
        return "Hummer has no brakes :(";
    }
}

public class Main {

    public static Car carChooser(int numer){

        switch (numer){
            case 1:
                return new Hyundai("Hyundai",4);

            case 2:
                return new Bmw();

            case 3:
                return new Hummer();
        }
        return null;
    }

    public static void main(String[] args) {

        for (int i=1; i<=3; i++){
            Car car = carChooser(i);
            System.out.println("Name: " + car.getName());
            System.out.println("Engine: " + car.isEngine());
            System.out.println("Cylinders: " +car.getCylinders());
            System.out.println("Wheels: " + car.getWheels());
            System.out.println("Starting: " + car.startEngine());
            System.out.println("Acceleration: " + car.accelerate());
            System.out.println("Breaking: " + car.brake());
            System.out.println("");
        }

    }
}

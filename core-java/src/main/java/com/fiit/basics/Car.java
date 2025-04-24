package com.fiit.basics;

public class Car {
    String model;
    String color;
    int horsePower;
    static final byte NO_OF_WHEELS = 4;
    static byte noOfEngines;
    static {
        noOfEngines = 1;
        System.out.println("static blocking is being executed.");
    }
    {
        System.out.println("car object is being created.");
    }
    public Car() {
        System.out.println("Car - Default constructor");
    }
    public Car(String model, String color, int horsePower) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        System.out.println("Car - Argument constructor being created.");
    }
    public void startCar() {
        System.out.println("Vehicle started..");
    }
    public String stopCar() {
        String output = "Vehicle stopped..";
        return output;
    }
}

package com.fiit.basics;

public class CarMain {
    static {
        System.out.println("static block from the same CarMain class");
    }
    public static void main(String[] args) {
        System.out.println("Main method invocation started..");
        Car car1 = new Car();
        Car car2 = new Car("Honda", "Black", 200);
        System.out.println(Car.noOfEngines);
        car1.startCar();
        System.out.println(car1.stopCar());
    }
}

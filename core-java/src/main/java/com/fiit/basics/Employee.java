package com.fiit.basics;

public class Employee {
    String firstName;
    String lastName;
    int age;
    char gender;
    static final String EMPLOYER_NAME = "Google";
    public Employee() {
        this("William","Smith",21, 'M');
        System.out.println("Object is getting created in Default constructor..");
    }    //default constructor
    /*
    argument constructor
     */
    public Employee(String firstName, String lastName, int age, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        System.out.println("Object is getting created in overloaded constructor...");
    }

}

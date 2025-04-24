package com.fiit.basics;

class Student{
    int regId;
    void displayRegId() {
        System.out.println("The Student registration ID is " + regId);
    }
}
public class StudentMain {
    public static void main(String[] args) {
        Student stud;          // object initialization
        stud = new Student();  // object instantiate
        stud.regId = 1201;
        stud.displayRegId();
    }
}

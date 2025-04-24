package com.fiit.basics;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee a = new Employee();
        Employee b = new Employee("John", "Smith", 18, 'M');
        Employee c = new Employee("Priyanka", "Ravichandran", 19, 'F');
        Employee d = new Employee();

        a.firstName = "Kannan";
        a.lastName = "Rajendran";

        System.out.println("Employer Name: "+Employee.EMPLOYER_NAME); //it should be static

        System.out.println("First Name: "+c.firstName);
        System.out.println("Last Name: "+c.lastName);
        System.out.println("Age: "+c.age);
        System.out.println("Gender: "+c.gender);
    }
}

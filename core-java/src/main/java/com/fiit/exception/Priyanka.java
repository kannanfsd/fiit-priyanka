package com.fiit.exception;

import java.util.Scanner;

public class Priyanka {
    public static void main(String[] args) {
        System.out.println("Begin the Arithmetic");
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the a value: ");
            int a = sc.nextInt();
            System.out.println("Enter the b value: ");
            int b = sc.nextInt();
            int result = a / b;
            System.out.println(result);
        } catch(ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("End the Arithmetic");
    }
}

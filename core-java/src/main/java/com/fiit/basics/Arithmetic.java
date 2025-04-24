package com.fiit.basics;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 20;
        int b = 12;
        add(a, b);
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
    }
    public static void add(int a, int b){
        System.out.println((a+b));
    }
    public static int subtract(int a, int b){
        return a - b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static int divide(int a, int b){
        return a / b;
    }
}

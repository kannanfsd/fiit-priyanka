package com.fiit.exception;

public class Ravichandarn {
    public static void main(String[] args) {
        /**
         * Integer.parseInt() - convert string data to Integer data
         */
        System.out.println("Begin the code.");
        try{
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int result = a / b;
            System.out.println(result);
        } catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }
        System.out.println("End the code.");
    }
}

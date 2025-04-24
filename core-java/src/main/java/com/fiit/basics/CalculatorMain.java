package com.fiit.basics;

class Calculator {
    int op1, op2;
    void displayOperand() {
        System.out.println("The value of Operand 1 is " + op1);
        System.out.println("The value of Operand 2 is " + op2);
    }
}
public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.op1 = 98;
        calc.op2 = 43;
        calc.displayOperand();
    }
}

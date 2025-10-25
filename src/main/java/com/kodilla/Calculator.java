package com.kodilla;

public class Calculator {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(7, 5));

        System.out.println(calculator.sub(3, 2));
    }


    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }
}

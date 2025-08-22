package com.demo.assessment;

import java.util.Scanner;

class Calculator {
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        switch (operation.toLowerCase()) {
            case "add":
            case "addition":
                return a + b;
            case "sub":
            case "subtract":
            case "subtraction":
                return a - b;
            case "mul":
            case "multiply":
            case "multiplication":
                return a * b;
            case "div":
            case "divide":
            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed!");
                }
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.next();

        Calculator calc = new Calculator(a, b, operation);

        try {
            double result = calc.calculate();
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

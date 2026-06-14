package com.tutorialProjects;

import java.util.Scanner;

public class calculator1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        String operation;
        boolean validOperation;


        System.out.print("Enter the first number(a): ");
        a = scanner.nextDouble();
        System.out.print("Enter the second number(b): ");
        b = scanner.nextDouble();
        System.out.print("Enter the operation(+,-,*,/,%,^): ");
        operation = scanner.next();

        switch(operation) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> {
                if (b == 0) {
                    System.out.println("Invalid");
                    validOperation = false;
                } else {
                    System.out.println(a / b);
                }
            }
            case "%" -> System.out.println(a % b);
            case "^" -> System.out.println(Math.pow(a,b));
            default -> {
                System.out.println("INVALID OPERATION!");
                validOperation = false;
            }
        }
        scanner.close();
    }
}
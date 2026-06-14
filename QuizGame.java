package com.tutorialProjects;

import java.util.Random;
import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int points = 0;

        System.out.println("***Simple Quiz Game***");
        System.out.print("Press E to enter: ");
        String entry = scanner.next().toUpperCase();

        System.out.print("1. What color is rainbow: ");
        String a1 = scanner.next().toUpperCase();
        {
            if(a1.contains("VIBGYOR")) {
                System.out.println("CORRECT!");
                points++;
            } else {
                System.out.println("INCORRECT!");
                points--;
            }
        }
        System.out.print("2. Number of letters in alphabet: ");
        int a2 = scanner.nextInt();
        {
            if(a2 == 26) {
                System.out.println("CORRECT!");
                points++;
            } else {
                System.out.println("INCORRECT!");
                points--;
            }
        }
        System.out.print("3. What is value of pi: ");
        double a3 = scanner.nextDouble();
        {
            if(a3 == 3.14) {
                System.out.println("CORRECT!");
                points++;
            } else {
                System.out.println("INCORRECT!");
                points--;
            }
        }
        System.out.print("4. What is full form of etc: ");
        String a4 = scanner.next().toUpperCase();
        {
            if(a4.contains("EXCETRA")) {
                System.out.println("CORRECT!");
                points++;
            } else {
                System.out.println("INCORRECT!");
                points--;
            }
        }
        System.out.print("5. What is color of sky: ");
        String a5 = scanner.next().toUpperCase();
        {
            if(a5.contains("BLUE")) {
                System.out.println("CORRECT!");
                points++;
            } else {
                System.out.println("INCORRECT!");
                points--;
            }
        }

        System.out.println("Your score is: "+points +"/5");

        scanner.close();
    }
}

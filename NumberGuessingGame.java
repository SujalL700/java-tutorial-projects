package com.tutorialProjects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min,max+1);

        System.out.println("Number Guessing game");
        System.out.printf("Guess a number between %d-%d\n", min, max);

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;

            if(guess<randomNumber) {
                System.out.println("TOO LOW! Try again");
            }
            else if(guess>randomNumber) {
                System.out.println("TOO HIGH! Try again");
            }
            else {
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("Number of attempts: "+attempts);
            }

        } while(guess!=randomNumber);

       scanner.close();


        scanner.close();
    }
}

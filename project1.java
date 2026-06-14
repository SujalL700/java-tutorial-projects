package com.tutorialProjects;//WEIGHT CONVERSION PROGRAM

import java.util.Scanner;

public class project1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1. convert lbs to kgs");
        System.out.println("2. convert kgs to lbs");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        if(choice == 1) {
            System.out.print("Enter weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("Weight in kgs is: %.2f" , newWeight);
        } else if(choice == 2) {
            System.out.print("Enter weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs is: %.2f" , newWeight);
        } else {
            System.out.println("INVALID CHOICE!!!!!");
        }
        scanner.close();
    }
}
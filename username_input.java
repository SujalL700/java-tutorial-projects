package com.tutorialProjects;

import java.util.Scanner;

public class username_input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username;

        System.out.print("Enter the username: ");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12) {
            System.out.println("Username must be between 4-12 characters.");
        }
        else if(username.contains(" ") || username.contains("_")) {
            System.out.println("Username must not contain spaces or underscores.");
        }
        else {
            System.out.println("Hello " + username);
        }

        scanner.close();
    }
}
package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int score = 0;
        boolean role = true;

        Random rand = new Random();

        System.out.println("Welcome to Piglet");

        while (role) {
            int randomNumber = rand.nextInt(6) + 1;
            System.out.println("You rolled a: " + randomNumber + "!");

            if (randomNumber > 1) {
                score += randomNumber;
                System.out.print("Roll Again? (Yes/No)");
                String userInput = in.next();

                while (!userInput.equals("Yes") && !userInput.equals("No")) {
                    System.out.print("Type only Yes or No!");
                    userInput = in.next();
                }
                if (userInput.equals("No")) {
                    role = false;
                }
            } else {
                score = 0;
                role = false;
            }
        }

        System.out.println("Your got a " + score + " points.");
    }
}
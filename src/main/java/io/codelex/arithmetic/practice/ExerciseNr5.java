package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class ExerciseNr5 {
    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;

        Scanner input = new Scanner(System.in);

        boolean correct = false;
        System.out.println("I'm thinking of a number between 1 and 100.\nYou have 5 tries to guess the number.");
        int guess;
        while (!correct) {
            System.out.println("Enter your guess: ");
            guess = input.nextInt();

            if(guess > 100 || guess < 1){
                System.out.println("Number between 1 - 100");
            } else if (guess == randomNumber) {
                System.out.println("You guessed the number!\nYou win!");
                correct = true;
                break;
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
       
            } else {
                System.out.println("Your guess is too low.");
            }
        }



    }
}

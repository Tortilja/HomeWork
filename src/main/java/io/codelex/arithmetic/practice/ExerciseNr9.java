package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class ExerciseNr9 {
    public static void main(String[] args) {

        double weight;
        double height;

        // Get input from user
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter weight? (kg)");
        weight = keyboard.nextDouble();

        System.out.print("Enter height? (cm)");
        height = keyboard.nextDouble();

        double heightInCm = height / 100;
        double bodyMassIndex = weight / (heightInCm * heightInCm);

        if(bodyMassIndex >= 18.5 && bodyMassIndex <= 25){
            System.out.println("Your Body Mass Index are " + bodyMassIndex + " and your weight is optimal");
        } else if (bodyMassIndex < 18.5) {
            System.out.println("Your Body Mass Index are " + bodyMassIndex + " and your weight is underweight");
        }else {
            System.out.println("Your Body Mass Index are " + bodyMassIndex + " and your weight is overweight");

        }

    }
}

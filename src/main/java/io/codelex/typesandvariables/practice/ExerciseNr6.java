package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExerciseNr6 {
    public static void main(String[] args) {
        int sum = 0;
        int numSeries = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you wont in series!");
        numSeries = in.nextInt();

        for (int i = 1; i <= numSeries; i++) {
            System.out.println("Insert " + i + "number");
            int number = in.nextInt();
            sum += number;
        }

        System.out.println("Sum of your numbers series are: " + sum);
    }
}

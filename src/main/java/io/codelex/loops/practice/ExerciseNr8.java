package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseNr8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many rows you wont: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4 * (n - i) - 4; j++) {
                System.out.print("/");
            }

            for (int j = 0; j < 8 * i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < 4 * (n - i) - 4; j++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }
}

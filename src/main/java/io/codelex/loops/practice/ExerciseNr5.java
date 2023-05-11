package io.codelex.loops.practice;

import java.util.Scanner;

public class ExerciseNr5 {
    public static void main(String[] args) {

        Scanner text = new Scanner(System.in);

        String firstString = text.nextLine();
        String secondString = text.nextLine();

        int charCount = 0;

        for (int i = 0; i < firstString.length(); i++) {
            charCount++;
        }
        for (int i = 0; i < secondString.length(); i++) {
            charCount++;
        }

        int dotNeeded = 20 - charCount;

        System.out.print(firstString);

        for (int i = 0; i < dotNeeded; i++) {
           System.out.print(".");
        }

        System.out.print(secondString);
    }
}

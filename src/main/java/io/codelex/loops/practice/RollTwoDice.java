package io.codelex.loops.practice;

import java.util.Random;
import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Chose Your Desired Sum! (2-12)");
        int desiredSum = in.nextInt();

        Random rand = new Random();

        int sum = 0;

        while (desiredSum != sum){
            int firstDice = rand.nextInt(6)+1;
            int secondDice = rand.nextInt(6)+1;

            sum = firstDice + secondDice;

            System.out.println(firstDice + " and " + secondDice + " = " + sum);
        }

    }
}

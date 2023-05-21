package io.codelex.arrays.practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Exercise2 {

    //TODO: Write a Java program to sum values of an array.
    // Array values are starting from min (including) till max (including) number.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a min number");
        int minNumber = input.nextInt();

        System.out.print("Please enter a max number");
        int maxNumber = input.nextInt();

        int myArray[] = IntStream.rangeClosed(minNumber, maxNumber).toArray();
        int sum = 0;


        for (int i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }


        System.out.println("The sum is " + sum);
    }
}

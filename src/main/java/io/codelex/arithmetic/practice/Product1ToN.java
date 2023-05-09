package io.codelex.arithmetic.practice;

import java.util.Scanner;

public class Product1ToN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the N number:");

        int numberN = scanner.nextInt();

        long sum = 1;

        for (int i = 1; i <= numberN; i++) {
            sum *= i;
        }
        System.out.println("Factorial of " + numberN + " is " + sum);
    }
}

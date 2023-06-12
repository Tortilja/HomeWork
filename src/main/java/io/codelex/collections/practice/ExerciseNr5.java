package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExerciseNr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isHappyNumber(number)) {
            System.out.println(number + " is a happy number.");
        } else {
            System.out.println(number + " is not a happy number.");
        }
    }

    private static boolean isHappyNumber(int number) {
        Set<Integer> visited = new HashSet<>();

        while (number != 1 && !visited.contains(number)) {
            visited.add(number);
            number = getNextNumber(number);
        }

        return number == 1;
    }

    private static int getNextNumber(int number) {
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit;
            number /= 10;
        }

        return sum;
    }
}

package io.codelex.arithmetic.practice;

public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        int lowerBound = 1;
        int upperBound = 100;

        for (int number = lowerBound; number <= upperBound; ++number) {
            sum += number;
            count += 1;
        }

        double average =  (double) sum / count;

        System.out.println("The Sum Of " + lowerBound + " To " + upperBound + " is " + sum);
        System.out.println("The average is " + average);
    }
}

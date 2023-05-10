package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExerciseNr8 {
    public static void main(String[] args) {
        int minutesInDay = 60 * 24;
        int minutesInYear = minutesInDay * 365;

        Scanner in = new Scanner(System.in);

        System.out.print("Input minutes: ");

        int min = in.nextInt();

        double convertedDays = (double) min / minutesInDay;
        double convertedYears = (double) min / minutesInYear;
        System.out.println("Minutes in Days: "+ convertedDays);
        System.out.println("Minutes in Years: "+ convertedYears);

    }
}

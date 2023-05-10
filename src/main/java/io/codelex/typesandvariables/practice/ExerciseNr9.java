package io.codelex.typesandvariables.practice;

import java.util.Scanner;

public class ExerciseNr9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Insert Distance: ");
        double meter = in.nextDouble();

        System.out.print("Insert hours: ");
        double hours = in.nextDouble();

        System.out.print("Insert minutes: ");
        double minutes = in.nextDouble();

        System.out.print("Insert seconds: ");
        double seconds = in.nextDouble();

        double miles = meter / 1609;

        double allTimeToSeconds = (hours * (60 * 60)) + (minutes * 60) + seconds;
        double allTimeToHours = allTimeToSeconds / 3600 ;

        double metersInSeconds = meter /allTimeToSeconds;
        double metersInHours = (meter /allTimeToHours) / 1000;
        double milesInHours = (miles /allTimeToHours) ;

        System.out.println("Your speed in meters/second is: " + metersInSeconds);
        System.out.println("Your speed in km/h is: " + metersInHours);
        System.out.println("Your speed in miles/h is: " + milesInHours);

    }
}

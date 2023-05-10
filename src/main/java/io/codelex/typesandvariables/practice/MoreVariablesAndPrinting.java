package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class MoreVariablesAndPrinting {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        String name = "Zed A. Shaw";
        String eyes = "Blue";
        String teeth = "White";
        String hair = "Brown";

        int age = 35;
        double heightInches = 74;  // inches
        double weightPound = 180; // lbs

        double heightCm = heightInches * 2.54;
        double weightKg = weightPound * 0.453592 ;

        System.out.println("Let's talk about " + name + ".");
        System.out.println("He's " + df.format(heightInches) + " inches tall.");
        System.out.println("He's " + df.format(heightCm) + " cm tall.");
        System.out.println("He's " + df.format(weightPound) + " pounds heavy.");
        System.out.println("He's " + df.format(weightKg) + " kg heavy.");
        System.out.println("Actually, that's not too heavy.");
        System.out.println("He's got " + eyes + " eyes and " + hair + " hair.");
        System.out.println("His teeth are usually " + teeth + " depending on the coffee.");

        System.out.println("If I add " + age + ", " + df.format(heightInches) + ", and " + df.format(weightPound)
                + " I get " + df.format(age + heightInches + weightPound) + ".");
    }
}
package io.codelex.classesandobjects.practice.Car;

import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.print("Enter Start kilometers: " );
        double startKilometers = scan.nextDouble();

        System.out.print("Enter end kilometers: " );
        double endKilometers = scan.nextDouble();

        System.out.print("Enter liters consumed: " );
        double liters = scan.nextDouble();

        Car car = new Car( startKilometers , endKilometers , liters);

        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );

        if (car.gasHog()) {
            System.out.println("Your car is a fuel graveyard!");
        } else if (car.economyCar()) {
            System.out.println("Your car is economic!");
        } else {
            System.out.println("You car have average!");
        }


        System.out.print("Enter miles: " );
        int mileage = scan.nextInt();

        System.out.print("Enter liters: " );
        double fillLiter = scan.nextDouble();

        car.fillUp(mileage,fillLiter);

        System.out.println("You filled " + fillLiter + " liters" + ", for " + mileage + " mileage");

        System.out.println( "Kilometers per liter are "  + car.calculateConsumption() );


    }
}

package io.codelex.classesandobjects.practice.CarSimulation;

public class CarSimulation {
    public static void main(String[] args) {
        Odometer odometer = new Odometer();
        odometer.fillUp();

        while (odometer.getFuelGauge().getFuelLevel() > 0) {
            odometer.incrementMileage();

            System.out.println("Mileage: " + odometer.getMileage());
            System.out.println("Fuel level: " + odometer.getFuelGauge().getFuelLevel() + " liters");
        }
    }
}

package io.codelex.classesandobjects.practice.Car;

public class Car {
    double startKilometers;
    double endKilometers;
    double liters;
    Car(double startOdo, double endingOdo, double liters){
        this.startKilometers = startOdo;
        this.endKilometers = endingOdo;
        this.liters = liters;
    }

    public double calculateConsumption(){
        double traveledKilometers = endKilometers - startKilometers;
        return (liters * 100) / traveledKilometers;
    }

    public boolean gasHog(){
        return calculateConsumption() >= 15;
    }
    public boolean economyCar(){
        return calculateConsumption() <= 5;
    }
    public void fillUp( int mileage, double liters ){
        endKilometers = mileage;
        this.liters = liters;
    }
}

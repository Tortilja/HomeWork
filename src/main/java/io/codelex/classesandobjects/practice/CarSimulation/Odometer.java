package io.codelex.classesandobjects.practice.CarSimulation;

public class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;

    public Odometer() {
        mileage = 0;
        fuelGauge = new FuelGauge();
    }

    public int getMileage() {
        return mileage;
    }

    public FuelGauge getFuelGauge() {
        return fuelGauge;
    }

    public void incrementMileage() {
        if (mileage == 999999) {
            mileage = 0;
        } else {
            mileage++;
        }

        if (mileage % 10 == 0) {
            fuelGauge.decrementFuelLevel();
        }
    }

    public void fillUp() {
        while (fuelGauge.getFuelLevel() < 70) {
            fuelGauge.incrementFuelLevel();
        }
    }
}

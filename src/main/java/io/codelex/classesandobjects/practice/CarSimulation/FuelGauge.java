package io.codelex.classesandobjects.practice.CarSimulation;

public class FuelGauge {
    private int fuelLevel;

    public FuelGauge() {
        fuelLevel = 0;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void incrementFuelLevel() {
        if (fuelLevel < 70) {
            fuelLevel++;
        }
    }

    public void decrementFuelLevel() {
        if (fuelLevel > 0) {
            fuelLevel--;
        }
    }
}

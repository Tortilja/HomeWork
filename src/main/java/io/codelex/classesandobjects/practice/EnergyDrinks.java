package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    final static int NUMBERED_SURVEYED = 12467;
    final static double PURCHASED_ENERGY_DRINKS = 0.14;
    final static double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        int energyDrinkers = (int) calculateEnergyDrinkers(NUMBERED_SURVEYED);

        int preferCitrus = (int) calculatePreferCitris(energyDrinkers);

        // Display the results
        System.out.println("Total number of people surveyed: " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those prefer citrus flavored energy drinks.");
    }

    public static double calculateEnergyDrinkers(int numberSurveyed) {
        return numberSurveyed * PURCHASED_ENERGY_DRINKS;
    }

    public static double calculatePreferCitris(int energyDrinkers) {
        return energyDrinkers * PREFER_CITRUS_DRINKS;
    }
}

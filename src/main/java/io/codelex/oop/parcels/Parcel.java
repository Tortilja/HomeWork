package io.codelex.oop.parcels;

public class Parcel implements Validatable {
    private int xLength;
    private int yLength;
    private int zLength;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLength, int yLength, int zLength, float weight, boolean isExpress) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
        this.isExpress = isExpress;
    }

    public boolean validate() {
        int sumOfDimensions = xLength + yLength + zLength;
        if (sumOfDimensions > 300) {
            System.out.println("Error: Sum of dimensions exceeds 300.");
            return false;
        }
        if (xLength < 30 || yLength < 30 || zLength < 30) {
            System.out.println("Error: Each dimension should be at least 30.");
            return false;
        }
        float maxWeight = isExpress ? 15.0f : 30.0f;
        if (weight > maxWeight) {
            System.out.println("Error: Weight exceeds " + maxWeight + " for isExpress=" + isExpress + ".");
            return false;
        }
        return true;
    }
}
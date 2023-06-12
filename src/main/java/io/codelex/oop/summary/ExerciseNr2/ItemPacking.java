package io.codelex.oop.summary.ExerciseNr2;

public class ItemPacking implements Service {
    private static final String NAME = "Item packing";
    private static final double PRICE = 5.0;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getPrice() {
        return PRICE;
    }

    @Override
    public String getFullInfo() {
        return getName() + ", " + String.format("%.2f", getPrice()) + " EUR";
    }
}
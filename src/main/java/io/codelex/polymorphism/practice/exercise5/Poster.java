package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    private String dimensions;
    private int numOfCopies;
    private int costPerCopy;

    public Poster(int fee, String dimensions, int numOfCopies, int costPerCopy) {
        super(fee);
        this.dimensions = dimensions;
        this.numOfCopies = numOfCopies;
        this.costPerCopy = costPerCopy;
    }


    @Override
    public int cost() {
        return super.cost() + (int) (numOfCopies * costPerCopy);
    }

    @Override
    public String toString() {
        return super.toString()
                + " Dimensions = " + dimensions
                + " Number of copies = " + numOfCopies
                + " Cost per copy = " + costPerCopy;
    }
}

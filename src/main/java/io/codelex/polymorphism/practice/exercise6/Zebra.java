package io.codelex.polymorphism.practice.exercise6;

public class Zebra extends Mammal {
    public Zebra(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "Black and Yellow";
    }

    @Override
    public boolean doEat(Food food) {
        return food instanceof Vegetable;
    }


    @Override
    public String toString() {
        return "Zebra{" +
                "name='" + animalName + '\'' +
                ", weight=" + animalWeight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}

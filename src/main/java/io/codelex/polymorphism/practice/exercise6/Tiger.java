package io.codelex.polymorphism.practice.exercise6;

public class Tiger extends Feline {
    public Tiger(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }

    @Override
    public String makeSound() {
        return "Roar";
    }

    @Override
    public boolean doEat(Food food) {
        return food instanceof Meat;
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + animalName + '\'' +
                ", weight=" + animalWeight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}

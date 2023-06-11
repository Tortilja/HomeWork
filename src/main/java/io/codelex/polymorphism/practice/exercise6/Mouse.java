package io.codelex.polymorphism.practice.exercise6;

public class Mouse extends Mammal {

    public Mouse(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight, livingRegion);
    }


    @Override
    public String makeSound() {
        return "Peeee ,Peeee!";
    }

    @Override
    public boolean doEat(Food food) {
        return food instanceof Vegetable;
    }


    @Override
    public String toString() {
        return "Mouse{" +
                "name='" + animalName + '\'' +
                ", weight=" + animalWeight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}

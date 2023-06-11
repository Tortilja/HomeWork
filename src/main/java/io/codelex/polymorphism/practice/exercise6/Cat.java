package io.codelex.polymorphism.practice.exercise6;

public class Cat extends Feline {
    protected String breed;

    public Cat(String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Miaow";
    }

    @Override
    public boolean doEat(Food food) {
        return true;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + animalName + '\'' +
                ", weight=" + animalWeight +
                ", livingRegion='" + livingRegion + '\'' +
                ", foodEaten=" + foodEaten +
                '}';
    }
}

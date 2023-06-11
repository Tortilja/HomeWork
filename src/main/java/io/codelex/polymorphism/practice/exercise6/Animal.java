package io.codelex.polymorphism.practice.exercise6;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected Double animalWeight;
    protected int foodEaten;

    public Animal(String animalName, Double animalWeight) {
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    abstract String makeSound();

    abstract boolean doEat(Food food);

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }
}

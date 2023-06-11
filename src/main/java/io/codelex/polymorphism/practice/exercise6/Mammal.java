package io.codelex.polymorphism.practice.exercise6;

public abstract class Mammal extends Animal {
    protected String livingRegion;

    public Mammal(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, animalWeight);
        this.livingRegion = livingRegion;
    }
}

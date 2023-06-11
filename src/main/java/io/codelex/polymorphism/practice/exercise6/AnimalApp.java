package io.codelex.polymorphism.practice.exercise6;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.println("Enter animal(type, name, weight, living Region, (and breed if its cat): ");
            String animalLine = scanner.nextLine();
            if (animalLine.equals("End")) {
                break;
            }
            System.out.println("Enter food (meat or vegetables) and quantity ");
            String foodLine = scanner.nextLine();

            String[] animalInfo = animalLine.split(" ");
            String animalType = animalInfo[0];
            String animalName = animalInfo[1];
            double animalWeight = Double.parseDouble(animalInfo[2]);
            String animalLivingRegion = animalInfo[3];
            String catBreed = null;
            if (animalType.equals("Cat")) {
                catBreed = animalInfo[4];
            }

            Animal animal = switch (animalType) {
                case "Mouse" -> new Mouse(animalName, animalWeight, animalLivingRegion);
                case "Cat" -> new Cat(animalName, animalWeight, animalLivingRegion, catBreed);
                case "Tiger" -> new Tiger(animalName, animalWeight, animalLivingRegion);
                case "Zebra" -> new Zebra(animalName, animalWeight, animalLivingRegion);
                default -> null;
            };

            if (animal != null) {
                System.out.println(">" + animal.makeSound());

                String[] foodInfo = foodLine.split(" ");
                if (foodInfo.length == 2) {
                    String foodType = foodInfo[0];
                    int quantity = Integer.parseInt(foodInfo[1]);
                    Food food = switch (foodType) {
                        case "Vegetable" -> new Vegetable(quantity);
                        case "Meat" -> new Meat(quantity);
                        default -> null;
                    };

                    if (food != null && animal.doEat(food)) {
                        animal.eat(food);
                    } else {
                        System.out.println(animalType + " are not eating that type of food!");
                    }
                } else {
                    System.out.println("Invalid food information format!");
                }

                animals.add(animal);
            }
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}

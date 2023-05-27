package io.codelex.oop.Cars;


import java.util.List;

public class CarServiceApp {
    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Manufacturer 1", 1990, "Country 1");
        Manufacturer manufacturer2 = new Manufacturer("Manufacturer 2", 1985, "Country 2");
        Manufacturer manufacturer3 = new Manufacturer("Manufacturer 3", 2000, "Country 3");
        Manufacturer manufacturer4 = new Manufacturer("Manufacturer 4", 1998, "Country 4");

        Car car1 = new Car("Car 1", "Model 1", 10000, 1995, List.of(manufacturer1, manufacturer2), EngineType.V8);
        Car car2 = new Car("Car 2", "Model 2", 20000, 2005, List.of(manufacturer1, manufacturer3), EngineType.V6);
        Car car3 = new Car("Car 3", "Model 3", 15000, 1998, List.of(manufacturer2, manufacturer3), EngineType.S6);
        Car car4 = new Car("Car 4", "Model 4", 30000, 1992, List.of(manufacturer1, manufacturer2, manufacturer4), EngineType.V12);

        CarService carService = new CarService();
        carService.addCar(car1);
        carService.addCar(car2);
        carService.addCar(car3);
        carService.addCar(car4);

        System.out.println("All Cars:");
        carService.getAllCars().forEach(System.out::println);

        System.out.println("\nCars with V12 Engine:");
        carService.getCarsWithV12Engine().forEach(System.out::println);

        System.out.println("\nCars Produced Before 1999:");
        carService.getCarsProducedBefore(1999).forEach(System.out::println);

        System.out.println("\nMost Expensive Car:");
        System.out.println(carService.getMostExpensiveCar());

        System.out.println("\nCheapest Car:");
        System.out.println(carService.getCheapestCar());

        System.out.println("\nCars with at Least 3 Manufacturers:");
        carService.getCarsWithAtLeastThreeManufacturers().forEach(System.out::println);

        System.out.println("\nCars Sorted by Price (Ascending):");
        carService.getCarsSortedByPrice(true).forEach(System.out::println);

        System.out.println("\nCars Sorted by Price (Descending):");
        carService.getCarsSortedByPrice(false).forEach(System.out::println);

        System.out.println("\nDoes Car 2 Exist? " + carService.hasCar(car2));
        System.out.println("Does Car 5 Exist? " + carService.hasCar(new Car("Car 5", "Model 5", 25000, 2003, List.of(manufacturer1), EngineType.S4)));

        System.out.println("\nCars Manufactured by Manufacturer 2:");
        carService.getCarsManufacturedBy(manufacturer2).forEach(System.out::println);

        System.out.println("\nCars Manufactured by Manufacturer 2 with Year > 1995:");
        carService.getCarsManufacturedByWithYearComparison(manufacturer2, ">", 1995).forEach(System.out::println);
    }
}
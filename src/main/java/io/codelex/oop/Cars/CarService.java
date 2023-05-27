package io.codelex.oop.Cars;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void removeCar(Car car) {
        cars.remove(car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars);
    }

    public List<Car> getCarsWithV12Engine() {
        return cars.stream()
                .filter(car -> car.getEngineType() == EngineType.V12)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsProducedBefore(int year) {
        return cars.stream()
                .filter(car -> car.getYearOfManufacture() < year)
                .collect(Collectors.toList());
    }

    public Car getMostExpensiveCar() {
        return cars.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    public Car getCheapestCar() {
        return cars.stream()
                .min(Comparator.comparingDouble(Car::getPrice))
                .orElse(null);
    }

    public List<Car> getCarsWithAtLeastThreeManufacturers() {
        return cars.stream()
                .filter(car -> car.getManufacturers().size() >= 3)
                .collect(Collectors.toList());
    }

    public List<Car> getCarsSortedByPrice(boolean ascending) {
        if (ascending) {
            return cars.stream()
                    .sorted(Comparator.comparingDouble(Car::getPrice))
                    .collect(Collectors.toList());
        } else {
            return cars.stream()
                    .sorted(Comparator.comparingDouble(Car::getPrice).reversed())
                    .collect(Collectors.toList());
        }
    }

    public boolean hasCar(Car car) {
        return cars.contains(car);
    }

    public List<Car> getCarsManufacturedBy(Manufacturer manufacturer) {
        return cars.stream()
                .filter(car -> car.getManufacturers().contains(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsManufacturedByWithYearComparison(Manufacturer manufacturer, String comparisonOperator, int year) {
        switch (comparisonOperator) {
            case "<":
                return cars.stream()
                        .filter(car -> car.getManufacturers().contains(manufacturer) && car.getYearOfManufacture() < year)
                        .collect(Collectors.toList());
            case ">":
                return cars.stream()
                        .filter(car -> car.getManufacturers().contains(manufacturer) && car.getYearOfManufacture() > year)
                        .collect(Collectors.toList());
            case "<=":
                return cars.stream()
                        .filter(car -> car.getManufacturers().contains(manufacturer) && car.getYearOfManufacture() <= year)
                        .collect(Collectors.toList());
            case ">=":
                return cars.stream()
                        .filter(car -> car.getManufacturers().contains(manufacturer) && car.getYearOfManufacture() >= year)
                        .collect(Collectors.toList());
            case "=":
                return cars.stream()
                        .filter(car -> car.getManufacturers().contains(manufacturer) && car.getYearOfManufacture() == year)
                        .collect(Collectors.toList());
            case "!=":
                return cars.stream()
                        .filter(car -> car.getManufacturers().contains(manufacturer) && car.getYearOfManufacture() != year)
                        .collect(Collectors.toList());
            default:
                return new ArrayList<>();
        }
    }
}
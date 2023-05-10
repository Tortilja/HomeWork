package io.codelex.typesandvariables.practice;

import java.text.DecimalFormat;

public class VariablesAndNames {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        int cars = 100;
        int seats_in_a_car = 4;
        int drivers = 30;
        int passengers = 90;
        int cars_not_driven = cars - drivers;
        int carpool_capacity = drivers * seats_in_a_car;
        double average_passengers_per_car = passengers / drivers;

        System.out.println("There are " + cars + " cars available.");
        System.out.println("There are only " + drivers + " drivers available.");
        System.out.println("There will be " + cars_not_driven + " empty cars today.");
        System.out.println("We can transport " + carpool_capacity + " people today.");
        System.out.println("We have " + passengers + " to carpool today.");
        System.out.println("We need to put about " + df.format(average_passengers_per_car) + " in each car.");
    }
}
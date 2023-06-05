package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FlightPlanner {    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        final Path path = Paths.get(FlightPlanner.class.getResource(file).toURI());
        List<String> lines = Files.readAllLines(path, charset);

        Map<String, List<String>> flights = parseFlights(lines);

        System.out.println("What would you like to do:");
        System.out.println("To display list of the cities, press 1");
        System.out.println("To exit program, press #");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (input.equals("1")) {
            displayCities(flights);
        }

        System.out.println("To select a city from which you would like to start, press 1");

        input = scanner.nextLine();

        if (input.equals("1")) {
            selectStartingCity(flights);
        }
    }

    private static Map<String, List<String>> parseFlights(List<String> lines) {
        Map<String, List<String>> flights = new HashMap<>();

        for (String line : lines) {
            line = line.trim();
            if (line.isEmpty()) {
                continue; // Ignore blank lines
            }
            String[] cities = line.split("->");
            String origin = cities[0].trim();
            String destination = cities[1].trim();

            flights.putIfAbsent(origin, new ArrayList<>());
            flights.get(origin).add(destination);
        }

        return flights;
    }

    private static void displayCities(Map<String, List<String>> flights) {
        System.out.println("Cities:");

        Set<String> cities = flights.keySet();
        for (String city : cities) {
            System.out.println(city);
        }
    }

    private static void selectStartingCity(Map<String, List<String>> flights) {
        Scanner scanner = new Scanner(System.in);
        String startingCity = scanner.nextLine();
        String currentCity = startingCity;
        List<String> route = new ArrayList<>();
        route.add(currentCity);

        while (true) {
            List<String> destinations = flights.get(currentCity);
            System.out.println("Destinations from " + currentCity + ":");
            for (String destination : destinations) {
                System.out.println(destination);
            }

            System.out.println("Select the next city or press # to exit:");

            String input = scanner.nextLine();

            if (input.equals("#")) {
                break;
            }

            currentCity = input;
            route.add(currentCity);

            if (currentCity.equals(startingCity)) {
                break;
            }
        }

        System.out.println("Flight route:");
        for (String city : route) {
            System.out.println(city);
        }
    }
}

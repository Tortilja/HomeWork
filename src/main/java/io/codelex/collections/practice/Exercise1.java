package io.codelex.collections.practice;

import java.util.*;

/**
 * Origination:
 * Audi -> Germany
 * BMW -> Germany
 * Honda -> Japan
 * Mercedes -> Germany
 * VolksWagen -> Germany
 * Tesla -> USA
 */
public class Exercise1 {
    public static void main(String[] args) {
        String[] array = {"Audi", "BMW", "Honda", "Mercedes", "VolksWagen", "Mercedes", "Tesla"};

        //todo - replace array with an ArrayList and print out the results
        List<String> list = new ArrayList<>();
        list.add("Audi");
        list.add("BMW");
        list.add("Honda");
        list.add("Mercedes");
        list.add("VolksWagen");
        list.add("Mercedes");
        list.add("Tesla");

        System.out.println();
        System.out.println("Array List:");

        for (String brand : list) {
            System.out.println(brand);
        }
        //todo - replace array with a HashSet and print out the results
        Set<String> set = new HashSet<>();
        set.add("Audi");
        set.add("BMW");
        set.add("Honda");
        set.add("Mercedes");
        set.add("VolksWagen");
        set.add("Mercedes");
        set.add("Tesla");

        System.out.println();
        System.out.println("Hash Set:");

        for (String brand : set) {
            System.out.println(brand);
        }
        //todo - replace array with a HashMap (use brand as key and origination as value) an print out the results
        Map<String, String> map = new HashMap<>();
        map.put("Audi", "Germany");
        map.put("BMW", "Germany");
        map.put("Honda", "Japan");
        map.put("Mercedes", "Germany");
        map.put("VolksWagen", "Germany");
        map.put("Tesla", "USA");

        System.out.println();
        System.out.println("Map:");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Brand: " + entry.getKey() + ", Origination: " + entry.getValue());
        }
    }
}

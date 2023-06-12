package io.codelex.collections.practice.lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExercise11 {

    public static void main(String[] args) {
        //TODO: Create an ArrayList with String elements
        List<String> car = new ArrayList<>();
        //TODO: Add 10 values to list
        car.add("Audi");
        car.add("BMW");
        car.add("Toyota");
        car.add("VolksWagen");
        car.add("Dodge");
        car.add("Dacia");
        car.add("Nissan");
        car.add("Opel");
        car.add("Volvo");

        System.out.println("List" + car);

        //TODO: Add new value at 5th position
        car.add(4, "Subaru");
        System.out.println("List" + car);

        //TODO: Change value at last position (Calculate last position programmatically)
        int lastIndex = car.size() - 1;
        car.set(lastIndex, "Honda");
        System.out.println("Replaced last element: " + car);

        //TODO: Sort your list in alphabetical order
        Collections.sort(car);
        System.out.println("Sorted List: " + car);

        //TODO: Check if your list contains "Foobar" element
        if(car.contains("Foobar")){
            System.out.println("Found the element");
        }else {
            System.out.println("There is no such element");
        }

        //TODO: Print each element of list using loop

        for(String element : car){
            System.out.println(element);
        }

    }

}

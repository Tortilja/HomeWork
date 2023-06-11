package io.codelex.collections.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueNames {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            uniqueNames.add(name);
        }

        System.out.print("Unique name list contains: ");
        for (String name : uniqueNames) {
            System.out.print(name + " ");
        }
    }
}

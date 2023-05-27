package io.codelex.oop.persons;

import java.time.LocalDate;

public class PersonApp {
    public static void main(String[] args) {
        Person employee = new Employee("John", "Brown", "E123", 35, "Accountant", LocalDate.of(2014, 6, 12));
        System.out.println(employee.getInfo());

        Person customer = new Customer("Peter", "Brown", "CID1234", 28, "CID1234", 10);
        ((Customer) customer).setPurchaseCount(11);
        System.out.println(customer.getInfo());
    }
}
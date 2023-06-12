package io.codelex.polymorphism.practice.exercise3;

public class PersonApp {
    public static void main(String[] args) {
        Person student = new Student("Steav", "Gūlbis", "Brīvibas bulvāris 5", 1001, 5.5);
        Person employee = new Employee("Barack", "Obama", "Aleksanda Čaksa 15", 1002, "Graphic Designer");

        student.display();
        System.out.println();
        employee.display();
    }
}

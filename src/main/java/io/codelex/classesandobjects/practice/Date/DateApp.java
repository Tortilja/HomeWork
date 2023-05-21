package io.codelex.classesandobjects.practice.Date;

public class DateApp {
    public static void main(String[] args) {
        Date date = new Date(5, 17, 2023);

        // Display the initial date
        System.out.print("Initial date: ");
        date.displayDate();

        // Update the date using the set methods
        date.setMonth(12);
        date.setDay(31);
        date.setYear(2023);

        // Display the updated date
        System.out.print("Updated date: ");
        date.displayDate();
    }
}

package io.codelex.dateandtime.practice;

import java.time.LocalDate;

public class ExerciseNr1 {
    public static void main(String[] args) {
        // Enter the start and end dates
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2023, 1, 31);

        int workingHours = calculateWorkingHours(startDate, endDate);
        System.out.println("Total working hours: " + workingHours);
    }

    public static int calculateWorkingHours(LocalDate startDate, LocalDate endDate) {
        int workingHours = 0;
        LocalDate currentDate = startDate;

        while (currentDate.isBefore(endDate) || currentDate.isEqual(endDate)) {
            if (currentDate.getDayOfWeek().getValue() >= 1 && currentDate.getDayOfWeek().getValue() <= 5) {
                workingHours += 8;
            }

            currentDate = currentDate.plusDays(1);
        }

        return workingHours;
    }
}

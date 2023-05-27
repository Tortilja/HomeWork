package io.codelex.dateandtime.practice;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class ExerciseNr2 {
    public static void main(String[] args) {
        LocalDate serverLaunchDate = LocalDate.of(2022, 2, 2);
        int year = 2022;
        int month = 10;

        List<LocalDate> updateDates = calculateServerUpdateDates(serverLaunchDate, year, month);
        System.out.println("Server update dates for " + year + "-" + month + ":");
        for (LocalDate date : updateDates) {
            System.out.println(date);
        }
    }

    public static List<LocalDate> calculateServerUpdateDates(LocalDate serverLaunchDate, int year, int month) {
        List<LocalDate> updateDates = new ArrayList<>();
        LocalDate currentDate = LocalDate.of(year, month, 1);

        while (currentDate.getMonthValue() == month) {
            if (ChronoUnit.DAYS.between(serverLaunchDate, currentDate) % 14 == 0) {
                updateDates.add(currentDate);
            }

            currentDate = currentDate.plusDays(1);
        }

        return updateDates;
    }
}

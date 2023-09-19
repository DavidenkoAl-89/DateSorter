package com.davydenko;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DateSorter dateSorter = new DateSorter();

        LocalDate date1 = LocalDate.of(2005, 7, 1);
        LocalDate date2 = LocalDate.of(2005, 1, 2);
        LocalDate date3 = LocalDate.of(2005, 1, 1);
        LocalDate date4 = LocalDate.of(2005, 5, 3);

        List<LocalDate> unsortedDates = new ArrayList<>(Arrays.asList(date1, date2, date3, date4));

        System.out.println("Before sort: " + unsortedDates);
        System.out.println("After sort: " + dateSorter.sortDates(unsortedDates));
    }
}
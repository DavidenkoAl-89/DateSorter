package com.davydenko;

import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;


public class DateSorterTest {
    @Test
    public void testSortDates() {
        DateSorter dateSorter = new DateSorter();

        LocalDate date1 = LocalDate.of(2005, 7, 1);   //July
        LocalDate date2 = LocalDate.of(2005, 1, 2);   //January
        LocalDate date3 = LocalDate.of(2005, 1, 1);   //January
        LocalDate date4 = LocalDate.of(2005, 5, 3);   //May

        List<LocalDate> unsortedDates = new ArrayList<>(Arrays.asList(date1, date2, date3, date4));
        Collection<LocalDate> sortedDates = dateSorter.sortDates(unsortedDates);

        // Expected sort: (2005-01-01, 2005-01-02, 2005-07-01, 2005-05-03)
        LocalDate[] expected = {date3, date2, date1, date4};
        assertArrayEquals(expected, sortedDates.toArray());
    }
}

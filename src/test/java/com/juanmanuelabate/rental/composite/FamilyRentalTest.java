package com.juanmanuelabate.rental.composite;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FamilyRentalTest {

    private FamilyRental familyRental;

    @Before
    public void setUp() {
        familyRental = new FamilyRental();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testSetRentedTimeIsUnsupported() {
        familyRental.setRentedTime(0);
    }

    @Test
    public void testCalculateRental() {
        //This rental has a discount of 30%.
        Rental hourRental = new HourRental();
        hourRental.setRentedTime(5);
        Rental dayRental = new DayRental();
        dayRental.setRentedTime(5);
        Rental weekRental = new WeekRental();
        weekRental.setRentedTime(5);

        familyRental.addRentals(Arrays.asList(hourRental, dayRental, weekRental));
        double result = familyRental.calculateRental();

        assertEquals(297.5, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRentalsErrorWhenRentalsIsLessThanMinimum() {
        familyRental.addRentals(Arrays.<Rental>asList(new HourRental()));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddRentalsErrorWhenRentalsIsBiggerThanMaximum() {
        familyRental.addRentals(Arrays.<Rental>asList(
                new HourRental(),
                new HourRental(),
                new HourRental(),
                new HourRental(),
                new HourRental(),
                new HourRental())
        );
    }

}

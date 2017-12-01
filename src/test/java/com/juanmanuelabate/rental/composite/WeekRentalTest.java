package com.juanmanuelabate.rental.composite;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class WeekRentalTest {

    private WeekRental weekRental;

    @Before
    public void setUp() {
        weekRental = new WeekRental();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddRentalsIsUnsupported() {
        weekRental.addRentals(new ArrayList<Rental>());
    }

    @Test
    public void testCalculateRental() {
        //Charging rate is 60 for day rental.
        weekRental.setRentedTime(5);
        double result = weekRental.calculateRental();
        assertEquals(300, result, 0);
    }
}

package com.juanmanuelabate.rental.composite;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DayRentalTest {

    private DayRental dayRental;

    @Before
    public void setUp() {
        dayRental = new DayRental();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddRentalsIsUnsupported() {
        dayRental.addRentals(new ArrayList<Rental>());
    }

    @Test
    public void testCalculateRental() {
        //Charging rate is 20 for day rental.
        dayRental.setRentedTime(5);
        double result = dayRental.calculateRental();
        assertEquals(100, result, 0);
    }
}

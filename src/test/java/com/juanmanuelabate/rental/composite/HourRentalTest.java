package com.juanmanuelabate.rental.composite;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HourRentalTest {

    private HourRental hourRental;

    @Before
    public void setUp() {
        hourRental = new HourRental();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testAddRentalsIsUnsupported() {
        hourRental.addRentals(new ArrayList<Rental>());
    }

    @Test
    public void testCalculateRental() {
        //Charging rate is 5 for hour rental.
        hourRental.setRentedTime(5);
        double result = hourRental.calculateRental();
        assertEquals(25, result, 0);
    }
}

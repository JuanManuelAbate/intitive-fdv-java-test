package com.juanmanuelabate.rental.factory;

import com.juanmanuelabate.rental.composite.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RentalFactoryTest {

    private Rental rental;

    @Before
    public void setUp() {
        rental = null;
    }

    @Test
    public void testHourRentalCreation() {
        rental = RentalFactory.createRental(RentalOptions.HOUR);
        assertTrue(rental instanceof HourRental);
    }

    @Test
    public void testDayRentalCreation() {
        rental = RentalFactory.createRental(RentalOptions.DAY);
        assertTrue(rental instanceof DayRental);
    }

    @Test
    public void testWeekRentalCreation() {
        rental = RentalFactory.createRental(RentalOptions.WEEK);
        assertTrue(rental instanceof WeekRental);
    }

    @Test
    public void testFamilyRentalCreation() {
        rental = RentalFactory.createRental(RentalOptions.FAMILY);
        assertTrue(rental instanceof FamilyRental);
    }

    @Test
    public void testInexistentRentalOption() {
        rental = RentalFactory.createRental(null);
        assertEquals(rental, null);
    }

}

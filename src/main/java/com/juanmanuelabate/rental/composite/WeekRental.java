package com.juanmanuelabate.rental.composite;

import java.util.List;

/**
 * An implementation of {@link Rental} that contains the logic to work with week rentals.
 */
public class WeekRental implements Rental {

    private static final int CHARGING_RATE = 60;

    private int rentedTime;

    public void addRentals(List<Rental> rentals) {
        throw new UnsupportedOperationException("This operation is unsupported for Week Rental.");
    }

    public void setRentedTime(int rentedTime) {
        this.rentedTime = rentedTime;
    }

    public double calculateRental() {
        return this.rentedTime * CHARGING_RATE;
    }
}

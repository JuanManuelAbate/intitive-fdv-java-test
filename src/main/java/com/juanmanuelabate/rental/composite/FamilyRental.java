package com.juanmanuelabate.rental.composite;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * An implementation of {@link Rental} that contains the logic to work with family rentals.
 */
public class FamilyRental implements Rental {

    private static final int MINIMUM_PROMOTION_RENTAL_QUANTITY = 3;
    private static final int MAXIMUM_PROMOTION_RENTAL_QUANTITY = 5;
    private static final double PROMOTION_DISCOUNT = 0.7;

    private List<Rental> rentals = new ArrayList<Rental>();

    public void addRentals(List<Rental> rentals) {
        if (rentals.size() > MAXIMUM_PROMOTION_RENTAL_QUANTITY || rentals.size() < MINIMUM_PROMOTION_RENTAL_QUANTITY) {
            throw new IllegalArgumentException(MessageFormat.format(
                    "Number of rentals for a promotion should be between {0} and {1}.",
                    MINIMUM_PROMOTION_RENTAL_QUANTITY,
                    MAXIMUM_PROMOTION_RENTAL_QUANTITY
            ));
        } else {
            this.rentals = rentals;
        }
    }

    public void setRentedTime(int rentedTime) {
        throw new UnsupportedOperationException("This operation is unsupported for Family Rental.");
    }

    public double calculateRental() {
        double totalRental = 0;
        for (Rental rental : rentals) {
            totalRental = totalRental + rental.calculateRental();
        }
        return totalRental * PROMOTION_DISCOUNT;
    }
}

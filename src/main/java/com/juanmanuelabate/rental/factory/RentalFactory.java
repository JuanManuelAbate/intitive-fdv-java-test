package com.juanmanuelabate.rental.factory;

import com.juanmanuelabate.rental.composite.*;

/**
 * A factory that provides a mechanism to create instances of implementations of {@link Rental}.
 */
public final class RentalFactory {

    public static Rental createRental(RentalOptions rentalOption) {

        if (RentalOptions.HOUR.equals(rentalOption)) {
            return new HourRental();
        }
        if (RentalOptions.DAY.equals(rentalOption)) {
            return new DayRental();
        }
        if (RentalOptions.WEEK.equals(rentalOption)) {
            return new WeekRental();
        }
        if (RentalOptions.FAMILY.equals(rentalOption)) {
            return new FamilyRental();
        }
        return null;
    }
}

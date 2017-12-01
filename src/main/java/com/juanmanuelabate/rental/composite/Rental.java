package com.juanmanuelabate.rental.composite;

import java.util.List;

/**
 * An interface that represent the behavior of a rental.
 */
public interface Rental {

    /**
     * Method that can be used in composed rentals to add the components that the rental
     * contains.
     * @param rentals List of rentals that compose a composed rental.
     */
    void addRentals(List<Rental> rentals);

    /**
     * Method used to set the rented time of a rental.
     * @param rentedTime the rented time of a renta.
     */
    void setRentedTime(int rentedTime);

    /**
     * Method to calculate the total cost of a rental.
     * @return the total cost of a rental.
     */
    double calculateRental();
}

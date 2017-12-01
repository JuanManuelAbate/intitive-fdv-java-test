package com.juanmanuelabate.rental;

import com.juanmanuelabate.rental.composite.Rental;
import com.juanmanuelabate.rental.factory.RentalFactory;
import com.juanmanuelabate.rental.factory.RentalOptions;

import java.util.Arrays;

public class UseExample {

    public static void main(String[] args) {

        //Create a hour rental and set rented time.
        Rental hourRental = RentalFactory.createRental(RentalOptions.HOUR);
        hourRental.setRentedTime(5);

        //Create a day rental and set rented time.
        Rental dayRental = RentalFactory.createRental(RentalOptions.DAY);
        dayRental.setRentedTime(1);

        //Create a week rental and set rented time.
        Rental weekRental = RentalFactory.createRental(RentalOptions.WEEK);
        weekRental.setRentedTime(3);

        //Create a family rental and set the rentals that compose it.
        Rental familyRental = RentalFactory.createRental(RentalOptions.FAMILY);
        familyRental.addRentals(Arrays.asList(
                hourRental,
                dayRental,
                weekRental
        ));

        System.out.println("Hour rental with a cost of: " + hourRental.calculateRental());
        System.out.println("Day rental with a cost of: " + dayRental.calculateRental());
        System.out.println("Week rental with a cost of: " + weekRental.calculateRental());
        System.out.println("Family rental with a cost of: " + familyRental.calculateRental());
    }
}

package org.example.coursera.ds_alg_module_1_array_lists.controller;




import org.example.coursera.ds_alg_module_1_array_lists.model.Seat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class SeatBooking {
    // List to store bookings
    private List<Seat> bookedSeatsList;
    // Constructor
    public SeatBooking() {
        // Initialize the list of booked seats
        // TODO 1 : this.bookedSeatsList = ?
        this.bookedSeatsList = new ArrayList<Seat>();
    }
    // Method to add a new seat booking
    public void addNewBooking(String seatNumber) {
        for (Seat s: this.bookedSeatsList) {
            if(Objects.equals(s.getSeatNumber(), seatNumber) && s.isBooked() &&  !s.isCanceled()) {
                System.out.println("This book has been taken");
                return;
            }

        }


            Seat newSeat = new Seat(seatNumber);
            newSeat.setBooked(true);
            newSeat.setBookingDate(new Date());
            this.bookedSeatsList.add(newSeat);
            System.out.printf("Seat %s has been successfully booked!", seatNumber);


        // TODO 2: check if the seat is already booked and not canceled



        // TODO 3 create a new Seat object for the booking,
        // mark the seat as booked,
        // set the current date as the booking date
        // TODO 4: add the new seat to the bookedSeatsList
        // TODO 5: confirm the booking to the user
    }
    // Method to cancel a booking
    public void cancelBooking(String seatNumber) {
        for (Seat s : this.bookedSeatsList) {
            if(Objects.equals(s.getSeatNumber(), seatNumber) && !s.isCanceled()) {
                s.setCanceled(true);
                s.setBooked(false);
                System.out.printf("Booking for seat %s has been successfully canceled!", seatNumber);

                return;
            }

        }
        System.out.printf("No booking found for seat number: %s", seatNumber);

        // TODO 6: iterate through the list of booked seats
        // TODO 7: check if the seat number matches and is not already canceled
        // mark the seat as canceled
        // mark the seat as not booked
        // confirm the cancellation to the user
        // TODO 8: inform the user if no booking was found for the seat number
    }
    // Method to update a booking seat number
    public void updateBooking(String oldSeatNumber, String newSeatNumber) {

        // TODO 9: iterate through the list of booked seats
        for (Seat s : this.bookedSeatsList) {
            if(Objects.equals(s.getSeatNumber(), oldSeatNumber) && !s.isCanceled()) {
                s.setSeatNumber(newSeatNumber);
                System.out.printf("\n Seat %s has been updated to %s", oldSeatNumber, newSeatNumber);
                return;
            }
            System.out.printf("\n Seat %s] not found.", oldSeatNumber);
        }
        // TODO 10: check if the seat number matches the old seat number and is not canceled
        // TODO 11: update the seat number to the new seat number
        // confirm the update to the user
        // TODO 12: inform the user if no booking was found for the old seat number
    }
    // Method to display all bookings
    public void displayBookings() {
        // TODO 13: check if the bookedSeatsList is empty, inform the user that no bookings have been made yet
        if(this.bookedSeatsList.isEmpty()) {
            System.out.println("No bookings made yet");
        } else {
            for (Seat s : this.bookedSeatsList) {
                System.out.printf("\n Seat Number: %s, Booking Date: %s", s.getSeatNumber(), s.getBookingDate());
            }
        }
        // TODO 14: iterate through the list of booked seats, Check if the seat is booked and not canceled
        // TODO 15: display the seat number and booking date

    }
}

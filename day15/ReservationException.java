package day15;

import day14.BankException;

public class ReservationException extends Exception

{
    static class FullyBookedFlightException extends ReservationException
    {
        public FullyBookedFlightException()
        {
            System.out.println("The flight is Booked and no any seat is available");
        }
    }
    static class NegativeAvailableSeats extends ReservationException
    {
        public NegativeAvailableSeats()
        {
            System.out.println("The available Seats cannot be negative");
        }
    }
   static class NonExistingFlights extends ReservationException
    {
        public NonExistingFlights()
        {
            System.out.println("Flight does not exists");
        }
    }

}

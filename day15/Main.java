package day15;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main
{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Reservation re=new Reservation();
        System.out.println("Welcome to the Flight Reservation System");
        while(true)
        {
            System.out.println("Select one option");
            System.out.println("0. Exit");
            System.out.println("1. Add Flight");
            System.out.println("2. Reservation");
            System.out.println("3. Cancellation");
            System.out.println("4. Display Flights");
            int n=sc.nextInt();
            if(n==0)
            {
                System.out.println("Exiting");
                break;
            }
            switch (n)
            {
                case 1:
                {
                    re.addFlight();
                    break;
                }
                case 2:
                {
                    try{
                        re.reserve();
                    } catch (ReservationException.FullyBookedFlightException|ReservationException.NegativeAvailableSeats | ReservationException.NonExistingFlights e)
                    {
                        System.out.println(e.getMessage());
                    }
                    catch (ReservationException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                case 3:
                {
                    try {
                        re.cancelling();
                    }
                    catch (ReservationException.FullyBookedFlightException|ReservationException.NegativeAvailableSeats | ReservationException.NonExistingFlights e)
                    {
                        System.out.println(e.getMessage());
                    }
                    catch (ReservationException e)
                    {
                        e.printStackTrace();
                    }
                    break;
                }
                case 4:
                {
                    re.displayFlights();
                    break;
                }
                default:
                {
                    System.out.println("You have entered an invalid option");
                }
            }
        }
    }
}

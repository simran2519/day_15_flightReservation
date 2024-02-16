package day15;

import java.util.ArrayList;
import java.util.List;

public class Flight
{
    private int flightNumber;
    private String departureCity;
    private String destinationCity;
    private int availableSeats;
    public List<User> userList;
    Flight(int flightNumber,String departureCity,String destinationCity,int availableSeats)
    {
        userList=new ArrayList<>();
        this.availableSeats=availableSeats;
        this.departureCity=departureCity;
        this.flightNumber=flightNumber;
        this.destinationCity=destinationCity;
    }
    //Getters
    public int getFlightNumber()
    {
        return flightNumber;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }
   public String toString()
    {
        return "FlightNo.: "+flightNumber+"\nDeparture City: "+departureCity+"\nDestination City: "+destinationCity+"\nAvalilable Seats: "+availableSeats;
    }
}

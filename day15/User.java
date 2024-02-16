package day15;

public class User
{
    private int ticketNumber;
    private String name;
    private String phoneNumber;
    private int seatNumber;
    User(int ticketNumber,String name,String phoneNumber,int seatNumber)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.ticketNumber=ticketNumber;
        this.seatNumber=seatNumber;

    }
    //getters
    public int getTicketNumber() {
        return ticketNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String toString()
    {
        return "[User name:"+getName()+" PhoneNumber:"+getPhoneNumber()+" Ticket no. "+getTicketNumber()+"]";
    }
}

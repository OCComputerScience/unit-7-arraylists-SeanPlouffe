package AirlineTickets;

import java.util.ArrayList;

public class TicketOrganizer
{
    ArrayList<AirlineTicket> tickets = new ArrayList<>();

    public TicketOrganizer(ArrayList<AirlineTicket> inputTickets)
    {
        tickets = inputTickets;
    }

    public ArrayList<AirlineTicket> getTickets()
    {
        return tickets;
    }



}

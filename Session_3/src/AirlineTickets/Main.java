package AirlineTickets;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<AirlineTicket> tickets = new ArrayList<>();

        //This creates a randomized list of passengers
        addPassengers(tickets);
        for(AirlineTicket elem: tickets)
        {
            System.out.println(elem);
        }

        // Create the TicketOrganizer object
        TicketOrganizer ticketOrganizer = new TicketOrganizer(tickets);

        // Print the methods
        System.out.println("\nPassengers Ordered by Boarding Group:");

        printPassengersByBoardingGroup(tickets, 5);

        System.out.println("\nPassengers in line who can board together:");

        canBoardTogether(tickets);

    }

    //Do not touch this method! It is adding random passengers to the AirlineTicket array
    public static void addPassengers(ArrayList<AirlineTicket> tickets)
    {
        String[] names = {"Xander", "Siena", "Ella-Louise", "Dawn", "Sharon", "Ayla", "Delores", "Adrian", "Candice", "Everly", "Nevaeh", "Patricia", "Saba", "Austin", "Deanna"};
        String[] seats = {"A","B","C","D","E","F"};
        for(int index = 0; index< 15; index++)
        {
            int random = (int)(Math.random() * 5);
            AirlineTicket ticket = new AirlineTicket(names[index], seats[random], ((int)(Math.random()*5)+1), ((int)(Math.random()*8)+1));
            tickets.add(ticket);
        }
    }

    private static void printPassengersByBoardingGroup(ArrayList<AirlineTicket> tickets, int boardingGroups)
    {

        for(int i = 0; i < boardingGroups; i++)
        {

            System.out.println("Boarding Group " + (i+1) + ":");

            for (int j = 0; j < tickets.size(); j++)
            {
                if (tickets.get(j).getBoardingGroup() == i+1)
                {
                    System.out.println(tickets.get(j).getName());

                }

            }

        }

    }

    private static void canBoardTogether(ArrayList<AirlineTicket> tickets)
    {

        int groups = 0;

        for(int i = 0; i < tickets.size()-1; i++)
        {
            AirlineTicket currTicket = tickets.get(i);

            for(int j = i+1; j < tickets.size(); j++)
            {
                AirlineTicket nextTicket = tickets.get(j);

                if(currTicket.getRow() == nextTicket.getRow() && currTicket.getBoardingGroup() == nextTicket.getBoardingGroup())
                {
                    System.out.println(currTicket.getName() + " can board with " + nextTicket.getName());
                    groups++;
                }

            }

        }

        if(groups == 0)
        {
            System.out.println("No passengers can board together.");
        }

    }

}

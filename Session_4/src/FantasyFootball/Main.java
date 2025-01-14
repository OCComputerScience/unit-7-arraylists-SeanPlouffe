package FantasyFootball;

import java.util.ArrayList;
import java.util.Scanner;
import ArrayListExtensions.PrintArrayLists;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> availablePlayers = new ArrayList<String>();
        addPlayers(availablePlayers);

        String[] team = new String[5];

        selectTeam(team, availablePlayers);

    }

    public static void addPlayers(ArrayList<String> array)
    {
        array.add("Frodo");
        array.add("Gandalf");
        array.add("Aragorn");
        array.add("Legolas");
        array.add("Gimli");
        array.add("Samwise");
        array.add("Bilbo");
        array.add("Gollum");
        array.add("Thorin");
        array.add("Balin");
        array.add("Galadriel");
        array.add("Elrond");
        array.add("Sauron");
        array.add("Melkor");
        array.add("Lúthien");
    }

    private static void selectTeam(String[] team, ArrayList<String> availablePlayers)
    {
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < team.length; i++)
        {

            System.out.println("\nEnter name of player to add:");

            String player = input.nextLine();

            while(!availablePlayers.contains(player))
            {

                System.out.println(player + " is not an available player\n");

                player = input.nextLine();

            }

            team[i] = player;
            availablePlayers.remove(player);

        }

        PrintArrayLists.printArrayList(team);
    }

}

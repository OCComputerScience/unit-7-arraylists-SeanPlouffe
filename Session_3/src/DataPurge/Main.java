package DataPurge;

import ArrayListExtensions.PrintArrayLists;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> members = new ArrayList<String>();
        addMembers(members);

        PrintArrayLists.printArrayList(members);

        DataPurge.removeDuplicates(members);

        PrintArrayLists.printArrayList(members);

        DataPurge.removeName(members,"London Braun");

        PrintArrayLists.printArrayList(members);

        DataPurge.correctlyFormatted(members);

        PrintArrayLists.printArrayList(members);

    }
    public static void addMembers(ArrayList<String> emails)
    {
        emails.add("London Braun");
        emails.add("Jaslyn Chavez");
        emails.add("Daphne Kane");
        emails.add("Aden Brock");
        emails.add("Jaime Wolf");
        emails.add("finley Wood");
        emails.add("Trent maynard");
        emails.add("Jaiden Krause");
        emails.add("London Braun");
        emails.add("Jaiden Krause");
        emails.add("Davon Mccormick");
        emails.add("JosieFreeman");
        emails.add("Jaslyn Chavez");
        emails.add("Zaiden Harding");
        emails.add("Araceli Castaneda");
        emails.add("Jaime Wolf");
        emails.add("London Braun");

    }
}

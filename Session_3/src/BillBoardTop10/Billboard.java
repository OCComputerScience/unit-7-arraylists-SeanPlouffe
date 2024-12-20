package BillBoardTop10;

import java.util.ArrayList;

public class Billboard
{
    private ArrayList<Musician> top10 = new ArrayList<>();




    public void add(Musician artist)
    {
        if(top10.size() < 10 && artist.getIsPlatinum())
        {
            top10.add(artist);
        }
        else if(artist.getIsPlatinum())
        {
            replace(artist);
        }
        else
        {
            System.out.println(artist.getName() + " could not be added to the top10 list.");
        }

    }

    private void replace(Musician artist)
    {
        Musician leastTop40 = top10.getFirst();
        int index = 0;

        for(int i = 1; i < top10.size(); i++)
        {
            if(top10.get(i).getWeeksInTop40() < leastTop40.getWeeksInTop40())
            {
                leastTop40 = top10.get(i);
                index = i;
            }

        }

        if(leastTop40.getWeeksInTop40() < artist.getWeeksInTop40())
        {
            top10.remove(index);
            top10.add(artist);
            System.out.println("The musician " + leastTop40.getName() + " has been replaced by " + artist.getName());
        }
        else
        {
            System.out.println("Sorry, " + artist.getName() + " has less weeks in the Top 40 than the other musicians.");
        }
    }

    //Don't make alterations to this method!
    public void printTop10()
    {
        System.out.println(top10);
    }
}

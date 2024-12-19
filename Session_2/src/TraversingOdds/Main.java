package TraversingOdds;


import ArrayListExtensions.PrintArrayLists;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        ArrayList<Integer> arrayList = getIntegerArrayList(1, 51);

        PrintArrayLists.printArrayList(arrayList);

        System.out.println(removeEvens(arrayList));

    }

    private static ArrayList<Integer> getIntegerArrayList(int minInclusive, int maxExclusive)
    {

        ArrayList<Integer> returnArrayList = new ArrayList<>(0);

        for(int i = minInclusive; i < maxExclusive; i++)
        {
            returnArrayList.add(i);
        }

        return  returnArrayList;

    }

    private static ArrayList<Integer> removeEvens(ArrayList<Integer> arrayList)
    {

        for(int i = 0; i < arrayList.size(); i++)
        {

            if(arrayList.get(i) % 2 == 0)
            {
                arrayList.remove(i);
                i--;
            }

        }

        return arrayList;

    }

}

package DataPurge;

import java.util.ArrayList;

public class DataPurge
{

    public static <T> void removeDuplicates(ArrayList<T> arrayList)
    {
        for(int i = 0; i < arrayList.size()-1; i++)
        {

            for(int j = i+1; j < arrayList.size(); j++)
            {

                if(arrayList.get(i) == arrayList.get(j))
                {
                    arrayList.remove(j);
                    j--;
                }

            }

        }

    }

    public static void removeName(ArrayList<String> nameList, String name)
    {

        for(int i = 0; i < nameList.size(); i++)
        {
            if(nameList.get(i).equals(name))
            {
                nameList.remove(i);
                i--;
            }

        }

    }

    public static void correctlyFormatted(ArrayList<String> nameList)
    {

        for(int i = 0; i < nameList.size(); i++)
        {
            if(nameList.get(i).charAt(0) == nameList.get(i).toLowerCase().charAt(0))
            {
                nameList.add(i+1, nameList.get(i).substring(0, 1).toUpperCase() + nameList.get(i).substring(1));
                nameList.remove(i);
            }

            for(int j = 1; j < nameList.get(i).length(); j++)
            {
                if(nameList.get(i).charAt(j) == nameList.get(i).toUpperCase().charAt(j) && nameList.get(i).charAt(j-1) != ' ')
                {
                    System.out.println("Working if only 1");
                }

            }

        }

    }

}

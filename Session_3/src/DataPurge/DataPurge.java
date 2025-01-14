package DataPurge;

import java.util.ArrayList;
import java.util.Locale;

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

    public static boolean correctlyFormatted(ArrayList<String> nameList)
    {

        if(nameList.isEmpty()) return false;

        for(String name : nameList)
        {

            String firstLetter = name.substring(0, 1);

            if(!firstLetter.equals(firstLetter.toUpperCase()))
            {
                return false;
            }

            if(!name.contains(" "))
            {
               return false;
            }

            int idx = name.indexOf(" ") + 1;
            String firstCharOfLastName = name.substring(idx, idx+1);

            if(!firstCharOfLastName.equals(firstCharOfLastName.toUpperCase()))
            {
                return false;
            }

        }

        return true;

    }

    public static void formatProperly(ArrayList<String> nameList)
    {

        for(int i = 0; i < nameList.size(); i++)
        {

            if(nameList.get(i).charAt(0) == nameList.get(i).toLowerCase().charAt(0))
            {
                nameList.add(i+1, nameList.get(i).substring(0, 1).toUpperCase() +
                        nameList.get(i).substring(1));
                nameList.remove(i);
            }

            for(int j = 1; j < nameList.get(i).length(); j++)
            {
                if(nameList.get(i).charAt(j) == nameList.get(i).toUpperCase().charAt(j) &&
                        nameList.get(i).charAt(j) != ' ' && nameList.get(i).charAt(j-1) != ' ')
                {

                    nameList.add(i+1, nameList.get(i).substring(0, j) + " " + nameList.get(i).substring(j));

                    nameList.remove(i);

                }

                if(nameList.get(i).charAt(j-1) == ' ' &&
                        !nameList.get(i).substring(j, j+1).toUpperCase().equals(nameList.get(i).substring(j, j+1)))
                {
                    nameList.add(i+1, nameList.get(i).substring(0, j) +
                            nameList.get(i).substring(j, j+1).toUpperCase() + nameList.get(i).substring(j+1));

                    nameList.remove(i);
                }

            }

        }

    }

}

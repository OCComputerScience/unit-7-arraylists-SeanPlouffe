package LinearSearch;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Double> array = new ArrayList<>();
        array.add(4.5);
        array.add(6.7);
        array.add(5.0);
        array.add(2.9);
        array.add(7.0);


        System.out.println(search(array, 2.9));

        System.out.println(search(array, 9.9));

    }

    private static <T> int search(ArrayList<T> arrayList, T elementToFind)
    {

        for(int i = 0; i < arrayList.size(); i++)
        {

            if(arrayList.get(i).equals(elementToFind))
            {

                return i;

            }

        }

        return -1;

    }

}

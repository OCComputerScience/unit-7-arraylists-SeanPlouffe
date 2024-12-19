package ArrayListExtensions;

import java.util.ArrayList;



public class PrintArrayLists
{

    public static <T> void printArrayList(ArrayList<T> array)
    {

        System.out.print("[");

        for(T element : array)
        {
            System.out.print(element + ", ");
        }

        System.out.println("]");

    }

}

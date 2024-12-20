package ArrayListExtensions;

import java.util.ArrayList;



public class PrintArrayLists
{

    public static <T> void printArrayList(ArrayList<T> arrayList)
    {

        System.out.print("[");

        for(T element : arrayList)
        {
            System.out.print(element + ", ");
        }

        System.out.println("]");

    }

    public static void printArrayList(int[] arrayList)
    {

        System.out.print("[");

        for(int element : arrayList)
        {
            System.out.print(element + ", ");
        }

        System.out.println("]");

    }

}

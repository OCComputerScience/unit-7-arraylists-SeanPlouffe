package HelperMethods;

import ArrayListExtensions.PrintArrayLists;

import java.util.ArrayList;

public class ArrayListMethods
{

    // I already created print. using generic datatypes even, taught myself that. didn't like having to deal with datatypes

    public static ArrayList<Double> condense(ArrayList<Double> arrayList)
    {

        ArrayList<Double> returnArrayList = new ArrayList<>(arrayList);

        for(int i = 0; i < returnArrayList.size(); i++)
        {

            returnArrayList.add(i, returnArrayList.get(i) * returnArrayList.get(i+1));

            returnArrayList.remove(i + 1);
            returnArrayList.remove(i + 1);

            //i--;

        }

        return returnArrayList;

    }

    public static <T> ArrayList<T> duplicate(ArrayList<T> arrayList)
    {

        arrayList.addAll(arrayList);

        return arrayList;

    }

}

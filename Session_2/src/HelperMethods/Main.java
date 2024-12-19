package HelperMethods;

import ArrayListExtensions.PrintArrayLists;

import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {

        ArrayList<Double> prices = new ArrayList<>();

        prices.add(13.45);
        prices.add(8.99);
        prices.add(2.95);
        prices.add(7.88);
        prices.add(12.56);
        prices.add(1.23);

        PrintArrayLists.printArrayList(ArrayListMethods.condense(prices));

        PrintArrayLists.printArrayList(ArrayListMethods.duplicate(prices));

    }

}

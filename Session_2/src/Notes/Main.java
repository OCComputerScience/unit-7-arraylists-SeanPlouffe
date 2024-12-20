package Notes;

import ArrayListExtensions.PrintArrayLists;

public class Main
{

    public static void main(String[] args)
    {

        int[] nums = {64, 34, 25, 12, 22, 11, 90};

        sortIntArray(nums);

        PrintArrayLists.printArrayList(nums);

    }

    private static void sortIntArray(int[] arr)
    {
        //find smallest, swap with first. next smallest, swap with second
        int temp = 0;
        int index = 0;

        for(int i = 0; i < arr.length; i++)
        {
            int smallest = Integer.MAX_VALUE;

            for(int j = i; j < arr.length; j++)
            {
                if(arr[j] < smallest)
                {
                    smallest = arr[j];
                    index = j;
                }

            }

            temp = arr[i];
            arr[i] = smallest;
            arr[index] = temp;

        }

    }

}

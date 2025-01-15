package SelectionSort;

import ArrayListExtensions.PrintArrayLists;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] array1 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] array2 = {5, 6, 4, 8, 9, 7, 3, 1, 2};

        System.out.print("First array: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array: ");
        System.out.println(Arrays.toString(array2));
        System.out.println();

        // sort first array

        selectionSort(array1);

        // sort second array

        selectionSort(array2);

        System.out.print("First array sorted: ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Second array sorted: ");
        System.out.println(Arrays.toString(array2));
    }

    private static void selectionSort(int[] arr)
    {

        int swapCounter = 0;

        for(int i = 0; i < arr.length-1; i++)
        {

            int currentMinIndex = i;

            for(int j = i+1; j < arr.length; j++)
            {

                if(arr[currentMinIndex] > arr[j])
                {
                    currentMinIndex = j;
                }

            }

            if(arr[i] != arr[currentMinIndex])
            {
                swapElements(arr, i, currentMinIndex);
                swapCounter++;
            }

        }

        System.out.println(swapCounter);

    }

    private static void swapElements(int[] arr, int firstIndex, int secondIndex)
    {
        if(arr.length==0) return;

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }

}

package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Integer> sortedNumbers = new ArrayList<>(Arrays.asList(
                1, 9, 16, 22, 24, 30, 34, 39, 41, 47,
                51, 58, 61, 65, 68, 71, 74, 75, 76, 77,
                78, 81, 85, 88, 89
        ));

        System.out.println();

        for(int num : sortedNumbers)
        {
            System.out.println(binarySearch(sortedNumbers, num));
        }

        System.out.println(binarySearch(sortedNumbers, 17));

    }

    private static int binarySearch(ArrayList<Integer> numbers, int target)
    {

        int left = 0;
        int right = numbers.size()-1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            int currNumber = numbers.get(mid);

            if (currNumber == target)
            {
                return mid;
            }
            else if (target < currNumber)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }

        }

        return -1;

    }

}

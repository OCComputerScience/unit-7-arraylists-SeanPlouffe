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


        for(int num : sortedNumbers)
        {
            System.out.println(binarySearch(sortedNumbers, num));
        }

    }

    private static int binarySearch(ArrayList<Integer> numbers, int target)
    {

        int left = 0;
        int right = numbers.size()-1;

        for(int i = 0; i < numbers.size(); i++)
        {
            int mid = left + (right - left) / 2;

            if (numbers.get(mid) == target) {
                return mid;
            } else if (target < numbers.get(mid)) {
                right = mid;
            } else {
                left = mid;
            }

            if(mid == right-1)
            {
                return right;
            }

        }

        return -1;

    }

}

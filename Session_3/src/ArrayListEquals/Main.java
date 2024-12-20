package ArrayListEquals;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args) {
        //This code is just to test your equals method
        ArrayList<Integer> list1 = new ArrayList<>() {{
            add(10);
            add(9);
            add(5);
            add(2);
            add(9);
        }};
        ArrayList<Integer> list2 = new ArrayList<>() {{
            add(10);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        // Test if list1 is equal to list 2
        System.out.println(equals(list1, list2));

        ArrayList<Integer> list3 = new ArrayList<>() {{
            add(1);
            add(9);
            add(5);
            add(2);
            add(9);
        }};

        // Test if list 2 is equal to list 3
        System.out.println(equals(list2, list3));

        ArrayList<String> list4 = new ArrayList<>() {{
            add("E");
            add("F");
            add("G");
            add("H");
            add("I");
        }};
        ArrayList<String> list5 = new ArrayList<>() {{
            add("E");
            add("F");
            add("G");
            add("H");
            add("I");
        }};

        System.out.println(equals(list4, list5));

    }

    public static <T> boolean equals(ArrayList<T> arr1, ArrayList<T> arr2)
    {
        if(arr1.size() != arr2.size())
            return false;


        int correct = 0;

        for(int i = 0; i < arr1.size(); i++)
        {
            if(arr1.get(i) == arr2.get(i))
            {
                correct++;
            }

        }

        return correct == arr1.size();

    }

}

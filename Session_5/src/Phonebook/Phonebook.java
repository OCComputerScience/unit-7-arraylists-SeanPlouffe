package Phonebook;
import ArrayListExtensions.PrintArrayLists;

import java.util.ArrayList;

public class Phonebook
{
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void addContact(Contact newContact)
    {
        contacts.add(newContact);
    }

    public void sortPhonebook()
    {

        for(int i = 0; i < contacts.size()-1; i++)
        {

            int currentMinIndex = i;

            for(int j = i+1; j < contacts.size(); j++)
            {

                if(contacts.get(currentMinIndex).getName().compareTo(contacts.get(j).getName()) > 0)
                {
                    currentMinIndex = j;
                }

            }

            if(contacts.get(i).getName().compareTo(contacts.get(currentMinIndex).getName()) != 0)
            {
                swapElements(contacts, i, currentMinIndex);
            }

        }

    }

    private void swapElements(ArrayList<Contact> arr, int firstIndex, int secondIndex)
    {
        if(arr.isEmpty()) return;

        Contact temp = arr.get(firstIndex);
        arr.add(firstIndex + 1, arr.get(secondIndex));
        arr.remove(firstIndex);
        arr.add(secondIndex + 1, temp);
        arr.remove(secondIndex);
    }

    public void printPhonebook()
    {
        PrintArrayLists.printArrayList(contacts);
    }

    public void miracleSort()
    {
        boolean isSorted = checkIfSorted();

        while(!isSorted)
        {
            isSorted = checkIfSorted();
        }
    }

    private boolean checkIfSorted()
    {
        for(int i = 1; i < contacts.size(); i++)
        {
            if(contacts.get(i-1).getName().compareTo(contacts.get(i).getName()) > 0)
            {
                return false;
            }
        }

        return true;
    }

}

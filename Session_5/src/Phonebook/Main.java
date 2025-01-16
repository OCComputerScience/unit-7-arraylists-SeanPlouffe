package Phonebook;

public class Main
{
    public static void main(String[] args)
    {
        Phonebook test = new Phonebook();

        // UNCOMMENT TO TEST
        test.addContact(new Contact("Kaysen", "Facebook", "sherrygold"));
        test.addContact(new Contact("Sean", "Snap", "@d_oaktree"));
        test.addContact(new Contact("Audrey", "phone", "12312312"));
        test.addContact(new Contact("Maxx", "phone", "12312312"));
        test.addContact(new Contact("Will", "Tweeeter", "@alexxx"));
        test.printPhonebook();

        test.sortPhonebook();

        test.printPhonebook();

    }

}

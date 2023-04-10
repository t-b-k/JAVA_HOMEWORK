package homework5;

import homework5.tasks.PhoneBookViaHashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main (String[] args) {
        String[] personPhones = new String[]{ "+7(915)055-05-73", "+7(915)055-05-69" };
        ArrayList<String> listOfNumbers = new ArrayList<>();
        for (String item: personPhones) {
            listOfNumbers.add(item);
        }
        PhoneBookViaHashMap phoneBook = new PhoneBookViaHashMap();
        phoneBook.addNewEntryOrPhoneNumber("Калашникова Татьяна Борисовна", listOfNumbers);
        phoneBook.printPhoneBook();
    }
}


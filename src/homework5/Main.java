package homework5;

import homework5.tasks.PhoneBookViaHashMap;

import java.util.LinkedList;

public class Main {
    public static void main () {
        String[] personPhones = new String[]{ "+7(915)055-05-73", "+7(915)055-05-69" };
        LinkedList<String> listOfNumbers = new LinkedList<>();
        for (String item: personPhones) {
            listOfNumbers.add(item);
        }
        PhoneBookViaHashMap phoneBook = new PhoneBookViaHashMap();
        phoneBook.addNewEntryOrPhoneNumber("Калашникова Татьяна Борисовна", listOfNumbers);
    }
}


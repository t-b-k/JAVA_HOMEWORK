package homework5.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class PhoneBookViaHashMap {
    private static HashMap <String, ArrayList<String>> ourPhoneBook;

    public PhoneBookViaHashMap() {
        ourPhoneBook = new HashMap<>();
    }
    // Метод enqueue помещает строку в конец очереди
    public PhoneBookViaHashMap addNewEntryOrPhoneNumber (String fio, ArrayList<String> listOfPhoneNumbers) {
        ArrayList<String> existingPhonesList = ourPhoneBook.get(fio);
        if (existingPhonesList == null) {
            ourPhoneBook.put(fio, listOfPhoneNumbers);
            // Метод возвращает
            return this;
        } else {
            for (String item: listOfPhoneNumbers) {
                if (!existingPhonesList.contains(item)) {
                    existingPhonesList.add(item);
                }
            }
            ourPhoneBook.put(fio, existingPhonesList);
            return this;
        }
    }

    public void printPhoneBook () {
        Set<String> setOfKeys = ourPhoneBook.keySet();
        ArrayList<String> phoneNumbers;
        for (String key : setOfKeys) {
            System.out.print(key + ":");
            phoneNumbers = ourPhoneBook.get(key);
            int i;
            for (i = 0; i < phoneNumbers.size() - 1; i++) {
                System.out.print(phoneNumbers.get(i) + "; ");
            }
            System.out.print(phoneNumbers.get(i) + "\n");
        }
    }

    public void printEntryByFIO (String fio) {
//        Set<String> setOfKeys = ourPhoneBook.keySet();
        ArrayList<String> phoneNumbers;
//        for (String key : setOfKeys) {
        System.out.print(fio + ":");
        phoneNumbers = ourPhoneBook.get(fio);
        int i;
        for (i = 0; i < phoneNumbers.size() - 1; i++) {
            System.out.print(phoneNumbers.get(i) + "; ");
        }
        System.out.print(phoneNumbers.get(i) + "\n");
        }
    }
}

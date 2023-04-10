package homework5.tasks;

import java.util.HashMap;
import java.util.LinkedList;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
public class PhoneBookViaHashMap {
    private static HashMap <String, LinkedList<String>> ourPhoneBook;

    public PhoneBookViaHashMap() {
        ourPhoneBook = new HashMap<>();
    }
    // Метод enqueue помещает строку в конец очереди
    public PhoneBookViaHashMap addNewEntryOrPhoneNumber (String fio, LinkedList<String> listOfPhoneNumbers) {
        LinkedList<String> existingPhonesList = ourPhoneBook.get(listOfPhoneNumbers);
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
}

package homework5;

import homework5.tasks.PhoneBookViaHashMap;

import java.util.*;

import static homework5.tasks.SortEmployeesByNumOfRepetitions.comparator;

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

        // 2-я задача
        Map<String, Integer> map =
                Map.of("Анна", 3, "Борис", 2, "Вова", 2, "Гена", 5, "Дима", 1);
        Map<String, Integer> result = new LinkedHashMap<>();

        List<Map.Entry<String, Integer>> entries = new LinkedList<>(map.entrySet());
        entries.sort(comparator); // Comparator.comparing(o -> (o.getValue())) OR Map.Entry.comparingByValue()


        for (Map.Entry<String, Integer> entry: entries) {
            result.put(entry.getKey(), entry.getValue());
        }

        System.out.println(result);
    }
}


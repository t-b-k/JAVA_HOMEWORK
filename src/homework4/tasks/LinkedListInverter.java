package homework4.tasks;

import java.util.LinkedList;

public class LinkedListInverter {

    public static LinkedList<String> invertLinkedListOfStrings (LinkedList<String> arg) {
        LinkedList<String> resultLinkedList = new LinkedList<>();
        if (!arg.isEmpty()) {
            for (String item: arg) {
                resultLinkedList.addFirst(item);
            }
        }
        return resultLinkedList;
    }
}

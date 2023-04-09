package homework4.tasks;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCreator {

    public static LinkedList<String> StringsLinkedListCreatorFromConsole () {

        Scanner scan = new Scanner(System.in);
        String nextString;
        LinkedList<String> resultList = new LinkedList<>();
        System.out.println("Вводите строки для формирования списка строк (по одной, через Enter).");
        System.out.println("Для завершения введите 'Q' в любом регистре.\n");
        System.out.print("====> ");
        nextString = scan.toString();

        while (nextString.toLowerCase() != "q\n") {
            resultList.add(nextString);
            }
        scan.close();
        return resultList;
    }

}


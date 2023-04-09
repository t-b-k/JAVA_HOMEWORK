package homework4.tasks;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListCreator {

    public static LinkedList<String> StringsLinkedListCreatorFromConsole () {

        Scanner scan = new Scanner(System.in);
        String nextString;
        LinkedList<String> resultList = new LinkedList<>();
        System.out.println("Вводите строки для формирования списка строк (по одной, через Enter).");
        System.out.println("Для завершения введите 'Q' в любом регистре.");
        System.out.print("====> ");
        nextString = scan.nextLine();
        Boolean goOn = true;

        while (goOn) {
            if ("q".equals(nextString.toLowerCase()) | "".equals(nextString.toLowerCase())) {
                goOn = false;
            } else {
                resultList.add(nextString);
                System.out.print("====> ");
                nextString = scan.nextLine();
            }
        }
        scan.close();
        return resultList;
    }

}


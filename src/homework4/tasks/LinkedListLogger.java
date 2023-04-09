package homework4.tasks;

import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.logging.Level;
import java.util.logging.Logger;

import homework4.tasks.MyLogInHMW4;

public class LinkedListLogger {
    private static final Logger LOG = MyLogInHMW4.myLog(homework2.Main.class.getName());
    public static void printLinkedListToLog (LinkedList<String> listToLog) {
        StringJoiner joiner = new StringJoiner(", ");
        for (String item : listToLog) {
            joiner.add(item.toString());
        }
        String stringToLog = joiner.toString();
        if (stringToLog.isEmpty()) {
            LOG.log(Level.INFO, "Пустая строка");
        } else {
            LOG.log(Level.INFO, stringToLog);
        }
    }
}

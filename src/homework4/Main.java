package homework4;

import homework4.tasks.MyLogInHMW4;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.StringJoiner;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import static homework4.tasks.LinkedListCreator.StringsLinkedListCreatorFromConsole;
import static homework4.tasks.LinkedListInverter.invertLinkedListOfStrings;
import static homework4.tasks.LinkedListLogger.printLinkedListToLog;

public class Main {
    // Создадим логгер для записи результатов работы методов из домашнего задания
    private static final Logger LOG = MyLogInHMW4.myLog(homework2.Main.class.getName());

    public static void main(String[] args) {

        LOG.log(Level.INFO, "1-я задача. Вывести в обратном порядке заданный пользователем список строк. ");
        LinkedList<String> userListOfStrings = StringsLinkedListCreatorFromConsole();
        LOG.log(Level.INFO, "Пользователь ввел следующую последовательность строк: ");
        printLinkedListToLog(userListOfStrings);
        LinkedList<String> invertedUserListOfStrings = invertLinkedListOfStrings (userListOfStrings);
        LOG.log(Level.INFO, "ПЕРЕВЕРНУТАЯ ПОСЛЕДОВАТЕЛЬНОСТЬ СТРОК : ");
        printLinkedListToLog(invertedUserListOfStrings);
    }

}

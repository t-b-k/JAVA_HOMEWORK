package homework4;

import homework2.tasks.MyLog;
import homework4.tasks.MyLogInHMW4;
import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;

import static homework4.tasks.LinkedListCreator.StringsLinkedListCreatorFromConsole;

public class Main {
    // Создадим логгер для записи результатов работы методов из домашнего задания
    private static final Logger LOG = MyLogInHMW4.myLog(homework2.Main.class.getName());

    // Формат записи результатов в лог-файл:
    // LOG.log(Level.INFO, "<КОММЕНТАРИЙ>"+<РЕЗУЛЬТАТ>);
    public static void main(String[] args) {

        LOG.log(Level.INFO, "1-я задача. Вывести в обратном порядке заданный пользователем список строк. ");
        LOG.log(Level.INFO, "Пользователь ввел следующую последовательность строк: ");
        LinkedList<String> userListOfStrings = StringsLinkedListCreatorFromConsole();
        LOG.log(Level.INFO, (Supplier<String>) userListOfStrings);

    }

}

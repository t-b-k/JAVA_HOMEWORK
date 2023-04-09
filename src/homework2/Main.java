package homework2;

import homework2.tasks.BubbleSorterByIncrease;
import homework2.tasks.MyLog;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import static homework2.tasks.BubbleSorterByIncrease.*;
import static homework2.tasks.JsonToReadableTextWriter.convertJsonToStringArray;

public class Main {

    private static final Logger LOG = MyLog.myLog(Main.class.getName());
    public static final int LENGTH = 10;
    public static final String JSONSTRING = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    public static final String KEY1 = "фамилия";
    public static final String KEY2 = "оценка";
    public static final String KEY3 = "предмет";

    public static void main(String[] args) {

// ПЕРВАЯ ЗАДАЧА
        int[] sortedArray = inputArrayOfIntegersByOne(LENGTH);
//        System.out.println("ИСХОДНЫЙ МАССИВ: ");
//        outputArrayOfIntToConsole(sortedArray);
        LOG.log(Level.INFO, "ИСХОДНЫЙ МАССИВ: "+ Arrays.toString(sortedArray));
        bubbleSortByIncrease(sortedArray);
//        System.out.println("\nРЕЗУЛЬТАТ СОРТИРОВКИ: ");
//        outputArrayOfIntToConsole(sortedArray);
        LOG.log(Level.INFO, "Результат сортировки: "+ Arrays.toString(sortedArray));

// ВТОРАЯ ЗАДАЧА:
        String[] gotFromJasonString = convertJsonToStringArray(JSONSTRING);
        for (String item: gotFromJasonString) {
            System.out.println(item);
        }
    }
}

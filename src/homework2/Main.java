package homework2;

import static homework2.tasks.BubbleSorterByIncrease.*;
import static homework2.tasks.JsonToReadableTextWriter.convertJsonToStringArray;

public class Main {
    public static final int LENGTH = 10;
    public static final String JSONSTRING = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, " +
                                            "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, " +
                                            "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
    public static final String KEY1 = "фамилия";
    public static final String KEY2 = "оценка";
    public static final String KEY3 = "предмет";

    public static void main(String[] args) {
//        int[] sortedArray = inputArrayOfIntegersByOne(LENGTH);
//        System.out.println("ИСХОДНЫЙ МАССИВ: ");
//        outputArrayOfIntToConsole(sortedArray);
//        bubbleSortByIncrease(sortedArray);
//        System.out.println("\nРЕЗУЛЬТАТ СОРТИРОВКИ: ");
//        outputArrayOfIntToConsole(sortedArray);

        String[] gotFromJasonString = convertJsonToStringArray(JSONSTRING);
        for (String item: gotFromJasonString) {
            System.out.println(item);
        }
    }


}

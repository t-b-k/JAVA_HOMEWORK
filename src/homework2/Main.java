package homework2;

import static homework2.tasks.BubbleSorterByIncrease.*;

public class Main {
    public static final int LENGTH = 10;
    public static void main(String[] args) {
        int[] sortedArray = inputArrayOfIntegersByOne(LENGTH);
        System.out.println("ИСХОДНЫЙ МАССИВ: ");
        outputArrayOfIntToConsole(sortedArray);
        bubbleSortByIncrease(sortedArray);
        System.out.println("\nРЕЗУЛЬТАТ СОРТИРОВКИ: ");
        outputArrayOfIntToConsole(sortedArray);
    }


}

package homework3;

import java.util.ArrayList;
import java.util.Arrays;

import static homework3.Tasks.AllEvensRemover.printListOfIntegers;
import static homework3.Tasks.AllEvensRemover.removeEvensFromIntsList;
import static homework3.Tasks.ArrayGenerator.getArrayListOfInt;
import static homework3.Tasks.MergeSorter.*;
import static homework3.Tasks.MinMaxAverageCounterInArray.*;
import static homework3.Tasks.TwoArraysDifference.getTwoArraysDifference;
import static homework3.Tasks.TwoArraysDifference.getTwoArraysSymmetricDifference;

public class Main {
    public static final int[] TEST_ARRAY = new int[]{134, 4, -15, 7, -67, 84, -15};
    public static final int MAX_ARRAY_LENGTH = 20;
    public static final int MIN_ARRAY_VALUE = 0;
    public static final int MAX_ARRAY_VALUE = 100;
    public static int[] firstArray = new int[]{-7, 1, 19, 34, 7, -14, 28};
    public static int[] secondArray = new int[]{-13, 0, 15, 25, -7, -14, 1};

    public static void main(String[] args) {

//      Задача 1
        System.out.println("\n1-я задача. ");
        System.out.println("Сортировка по возрастанию слиянием массива целых чисел: \n");
        System.out.println("Исходный массив: ");
        printArrayOfInt(TEST_ARRAY);
        int[] resultArray = incrementalSortOfIntegersByMerge(TEST_ARRAY);
        System.out.println("\nРезультат: ");
        printArrayOfInt(resultArray);

//      Задача 2
        System.out.println("\n\n2-я задача. ");
        System.out.println("Удалим из случайным образом сформированного списка целых чисел все четные элементы: \n");
        ArrayList<Integer> arrayToRemoveEvens = getArrayListOfInt(MAX_ARRAY_LENGTH, MIN_ARRAY_VALUE, MAX_ARRAY_VALUE);
        System.out.println("Исходный список: ");
        printListOfIntegers(arrayToRemoveEvens);
        removeEvensFromIntsList(arrayToRemoveEvens);
        System.out.println("\nРезультирующий список: ");
        printListOfIntegers(arrayToRemoveEvens);

//      Задача 3
//      Cформируем массив случайный целых чисел [0; 100] случайной длины [0;20]
//      и вернем его максимум, минимум и среднее.
        System.out.println("\n\n3-я задача. ");
        System.out.println("Найдем min, max и среднее арифметическое списка целых чисел: \n");
        ArrayList<Integer> arrayToAnalyze = getArrayListOfInt(MAX_ARRAY_LENGTH, MIN_ARRAY_VALUE, MAX_ARRAY_VALUE);
        System.out.println("Сгенерирован список целых чисел: ");
        printListOfIntegers(arrayToAnalyze);
        System.out.println("\nМинимальный элемент массива равен "+ getMinInArrayOfInts(arrayToAnalyze));
        System.out.println("Максимальный элемент массива равен "+ getMaxInArrayOfInts(arrayToAnalyze));
        System.out.println("Среднее значение -  "+ getAverageInArrayOfInts(arrayToAnalyze));

        //      Задача 4
//      Найти разность двух массивов - firstArray и secondArray
        System.out.println("\n\n4-я задача. ");
        System.out.println("Разность двух массивов: все элементы первого массива, отсутствующие во втором.");
        System.out.println("Оба массива состоят из неповторяющихся элементов (эмулируют множества).\n");
        System.out.println("Первый массив: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Второй массив: ");
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Разность: все элементы 1-го массива, отсутствующие во втором");
        System.out.println(Arrays.toString(getTwoArraysDifference (firstArray, secondArray)));

//      Найти симметрическую разность двух массивов - firstArray и secondArray
        System.out.println("\n\n5-я задача. ");
        System.out.println("Симметрическая разность двух массивов: все элементы каждого из множеств,");
        System.out.println("не являющиеся одновременно элементами другого множества.");
        System.out.println("Оба массива состоят из неповторяющихся элементов (эмулируют множества). \n");
        System.out.println("Первый массив: ");
        System.out.println(Arrays.toString(firstArray));
        System.out.println("Второй массив: ");
        System.out.println(Arrays.toString(secondArray));
        System.out.println("Симметрическая разность firstArray\\secondArray + secondArray\\firstArray: ");
        System.out.println(Arrays.toString(getTwoArraysSymmetricDifference(firstArray, secondArray)));
    }


}

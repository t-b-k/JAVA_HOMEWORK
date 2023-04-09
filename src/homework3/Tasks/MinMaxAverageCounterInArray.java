package homework3.Tasks;

import java.util.ArrayList;
import java.util.List;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое этого списка.
public class MinMaxAverageCounterInArray {
    public static int getMinInArrayOfInts (ArrayList<Integer> sourceList) {
        int min = sourceList.get(0);
        for (int i = 1; i < sourceList.size(); i++) {
            if (sourceList.get(i) < min) min = sourceList.get(i);
        }
        return min;
    }
    public static int getMaxInArrayOfInts (ArrayList<Integer> sourceList) {
        int max = sourceList.get(0);
        for (int i = 1; i < sourceList.size(); i++) {
            if (sourceList.get(i) > max) max = sourceList.get(i);
        }
        return max;
    }
    public static double getAverageInArrayOfInts (ArrayList<Integer> sourceList) {
        int sumOfElements = 0;
        for (int item: sourceList) {
            sumOfElements += item;
        }
        return sumOfElements/sourceList.size();
    }
}

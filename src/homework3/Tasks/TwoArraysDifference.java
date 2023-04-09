package homework3.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

// Реализовать разность массивов и симметрическую разность массивов
public class TwoArraysDifference {

    public static int[] getTwoArraysDifference (int[] firstArray, int[] secondArray) {
        ArrayList<Integer> resultArrayList = new ArrayList<>(0);
        ArrayList<Integer> secondArrayList = new ArrayList<>(secondArray.length);
        for (int item: secondArray) secondArrayList.add(item);
        for (int i = 0; i < firstArray.length; i++) {
            int firstIndexInSecondArrayList = secondArrayList.indexOf(firstArray[i]);
            if (firstIndexInSecondArrayList == -1) {
                resultArrayList.add(firstArray[i]);
            } else {
               secondArrayList.remove(firstIndexInSecondArrayList);
            }
        }

        int[] resultArray = new int[resultArrayList.size()];
        int i = 0;
        for (int item: resultArrayList) {
            resultArray[i++] = item;
        }
//      Arrays.stream(resultArrayList.toArray()).mapToInt().toArray();
        return resultArray;
    }

    public static int[] getTwoArraysSymmetricDifference (int[] firstArray, int[] secondArray) {

        ArrayList<Integer> firstArrayList = new ArrayList<>(firstArray.length);
        ArrayList<Integer> secondArrayList = new ArrayList<>(secondArray.length);
        ArrayList<Integer> resultArrayList = new ArrayList<>(0);
        for (int item: firstArray) {
            firstArrayList.add(item);
        }
        for (int item: secondArray) {
            secondArrayList.add(item);
        }
        for (int i = 0; i < firstArray.length; i++) {
            int firstIndexInSecondArrayList = secondArrayList.indexOf(firstArray[i]);

            if (firstIndexInSecondArrayList != -1) {
                secondArrayList.remove(firstIndexInSecondArrayList);
            } else {
                resultArrayList.add(firstArray[i]);
            }
        }
        for (int i = 0; i < secondArray.length; i++) {
            int firstIndexInFirstArrayList = firstArrayList.indexOf(secondArray[i]);

            if (firstIndexInFirstArrayList != -1) {
                firstArrayList.remove(firstIndexInFirstArrayList);
            } else {
                resultArrayList.add(secondArray[i]);
            }
        }
        int[] resultArray = new int[resultArrayList.size()];
        int i = 0;
        for (int item: resultArrayList) {
            resultArray[i++] = item;
        }
//                Arrays.stream(resultArrayList.toArray()).mapToInt().toArray();
        return resultArray;
    }
}

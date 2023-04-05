package homework3;

import static homework3.Tasks.MergeSorter.*;

public class Main {
    public static final int[] TEST_ARRAY = new int[]{134, 4, -15, 7, -67};
    public static int[] array = new int[]{-7, 1, 19, 34, 7, -14};
    public static int[] leftArray = new int[]{-13, 0, 15, 25};
    public static int[] rightArray = new int[]{-90, 5, 12};


    public static void main(String[] args) {
//        System.out.println("left Array: ");
//        printArrayOfInt(leftArray);
//        System.out.println("\nRight Array: ");
//        printArrayOfInt(rightArray);
        int[] resultArray = incrementalSortOfIntegersByMerge(TEST_ARRAY);
        System.out.println("\nresultArray: ");
        printArrayOfInt(resultArray);
    }
}

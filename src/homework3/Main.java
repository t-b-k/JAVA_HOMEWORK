package homework3;

import static homework3.Tasks.MergeSorter.*;

public class Main {
    public static final int[] TEST_ARRAY = new int[]{1, 34, 3};
    public static int[] leftPart = new int[]{-7, 1, 3, 20, 34};
    public static int[] rightPart = new int[]{-13, 0, 15, 25, 69, 900};

    public static void main(String[] args) {
        System.out.println("Initial Array: ");
        printArrayOfInt(TEST_ARRAY);
        int[] testMergedArray = incrementalSortOfIntegersByMerge(TEST_ARRAY);
        System.out.println("Result Array: ");
        printArrayOfInt(testMergedArray);
    }
}

package homework3.Tasks;
// Реализовать алгоритм сортировки слиянием
public class MergeSorter {

    public static void main(String[] args) {

    }
    public static int[] incrementalSortOfIntegersByMerge(int[] sourceArray) {
        int numOfElements = sourceArray.length;
        int[] resultArray = new int [numOfElements];

        if (numOfElements == 1) {
                resultArray[0] = sourceArray[0];
                printArrayOfInt(resultArray);
                return resultArray;
            } else {
                int equator = (int) (numOfElements-1) / 2;
                System.out.println(equator);
                int[] leftArray = copyFromArray(sourceArray, 0, equator-1);
                int[] rightArray = copyFromArray(sourceArray, equator, numOfElements-1);
                System.out.print("Left array = ");
                printArrayOfInt(leftArray);
                System.out.print("Right array = ");
                printArrayOfInt(rightArray);
                System.out.print("Result array = ");
                printArrayOfInt(resultArray);
                    resultArray = incrementalMerge(incrementalSortOfIntegersByMerge(leftArray), incrementalSortOfIntegersByMerge(rightArray));
                    return resultArray;
        }
    }


    public static int[] incrementalMerge (int[] leftArray, int[] rightArray) {
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;
        int resultLength = leftLength + rightLength;
        int[] resultArray = new int[resultLength];
        int resultInd = 0;
        int leftInd = 0;
        int rightInd = 0;
        System.out.println("Left Length = "+leftLength+"; Right Length = "+rightLength+"; Result Length = "+resultLength);
        while (leftInd < leftLength && rightInd < rightLength) {
            if (leftArray[leftInd] < rightArray[rightInd]) {
                resultArray[resultInd] = leftArray[leftInd];
                leftInd++;
                System.out.println("resultArray["+resultInd+"] = "+resultArray[resultInd]+"; leftInd = "+leftInd+"; rightInd = "+ rightInd);
            } else {
                resultArray[resultInd] = rightArray[rightInd];
                rightInd++;
                System.out.println("resultArray["+resultInd+"] = "+resultArray[resultInd]+"; rightInd = "+ rightInd +"; leftInd = "+leftInd);
            }
            resultInd++;

        }
        if (leftInd == leftLength) {
            for (; rightInd < rightLength; rightInd++, resultInd++) {
                resultArray[resultInd] = rightArray[rightInd];
            }
        }
        return resultArray;
    }

    public static int[] copyFromArray (int[] sourceArray, int startInd, int endInd) {
        int numOfElements = endInd-startInd+1;
        int[] resultArray = new int[numOfElements];
        int j = startInd;

        for (int i = 0; i < numOfElements ; i++) {
            resultArray[i] = sourceArray[j];
            j++;
        }
        return resultArray;
    }

    public static void printArrayOfInt (int[] sourceArray) {
        int numOfElements = sourceArray.length;
        System.out.print("[");
        int i;
        if (numOfElements > 1) {
            for (i = 0; i < numOfElements-1; i++) {
            System.out.print(sourceArray[i] +", ");
            }
            System.out.print(sourceArray[i] +"]");
        } else {
            System.out.print("]");
        }
    }
}


package homework2.tasks;
import java.util.Scanner;

import static jdk.internal.org.objectweb.asm.Opcodes.NULL;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class BubbleSorterByIncrease {

    public static int[] inputArrayOfIntegersByOne (int arrayLength) {
        int[] array = new int[arrayLength];
        Scanner scan = new Scanner(System.in);
        System.out.printf("Введите %d целых чисел", arrayLength);
        System.out.println();
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("Введите %d-е число == > ", i+1);
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }

//    public static void
    public static void bubbleSortByIncrease (int[] array) {
        int length = array.length;
//        Logger logger = Logger.getLogger();
        if (length != 0) {
            for (int i = length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        } else {
            System.out.println("Массив пуст.");
        }
    }

    public static void outputArrayOfIntToConsole (int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.print("]");
    }
}

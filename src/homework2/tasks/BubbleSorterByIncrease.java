package homework2.tasks;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import static jdk.internal.org.objectweb.asm.Opcodes.NULL;

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
public class BubbleSorterByIncrease {

    private static final Logger LOG = MyLog.myLog(BubbleSorterByIncrease.class.getName());

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
//        Logger logger = Logger.getLogger(BubbleSorterByIncrease.class.getName());
        FileHandler fh = null;
        try {
            fh = new FileHandler("myLogFile.txt");
        } catch (IOException e) {
            LOG.log(Level.INFO, "ERROR: Couldn't create log file");
            throw new RuntimeException(e);
        }
        LOG.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        if (length != 0) {
            for (int i = length - 1; i > 0; i--) {
                StringBuilder stringToOutput = new StringBuilder("[");
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                for (int elem: array) {
                    stringToOutput.append(elem + " ");
                }
                stringToOutput.deleteCharAt(stringToOutput.length()-1);
                stringToOutput.append("]");
                LOG.log(Level.INFO, stringToOutput.toString());
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

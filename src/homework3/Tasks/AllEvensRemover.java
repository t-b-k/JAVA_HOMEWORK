package homework3.Tasks;

import java.util.ArrayList;
import java.util.List;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class AllEvensRemover {
    public static void removeEvensFromIntsList (ArrayList<Integer> sourceList) {
        for (int i = 0; i < sourceList.size(); i++) {
            if (0 == sourceList.get(i) % 2) {
                sourceList.remove(i);
                i--;
            }
        }

    }

    public static void printListOfIntegers(ArrayList<Integer> listOfInts) {
        for (int i = 0; i < listOfInts.size(); i++) {
            System.out.printf("%3d ", listOfInts.get(i));
        }
    }
}

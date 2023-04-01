package homework1.tasks;

// Вывести все простые числа от 1 до 1000
public class Task2 {
    public static void simpleNumbersUpToN(int n) {
        int i = 5;
        int j = 6;
        int numbersInLine = 10;
        int qtyOfSimples = 0 ;
        for (i = 2; i <= n; i++) {
            boolean simple = true;
            for (j = 2; j < i && simple; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if (simple) {
                qtyOfSimples++;
                System.out.print(i);
                System.out.print(' ');
                if (qtyOfSimples % numbersInLine == 0) System.out.print('\n');
            }
        }
    }
}

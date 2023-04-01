package homework1.tasks;
import java.util.Scanner;
import java.util.Objects;
public class Task3 {
//    public static int getInteger () {
//        System.out.print("Введите любое целое число ==> ");
//
//        int number = scan.nextInt();
//        System.out.println ("Вы ввели число " + number);
////        scan.close();
//        return number;
//    }
//    public static String getOperation () {
//
//        Scanner scan = new Scanner(System.in);
//        String operationString = scan.next();
//        System.out.println ("Вы ввели операцию: " + operationString);
//        scan.close();
//        return operationString;
//    }

    public static double calculate () {
        double result = -1;
        System.out.println();
        System.out.print("Введите первое число ==> ");
        Scanner scan = new Scanner(System.in);
        Double op1 = scan.nextDouble();
//        scan.next();
        System.out.println ("Вы ввели число " + op1);
        System.out.print("Введите символ операции: +, -, * или / ==> ");
        String op = scan.next();
//        scan.next();
        System.out.println ("Вы ввели операцию: " + op);
        System.out.print("Введите второе число ==> ");
        Double op2 = scan.nextDouble();
//        scan.next();
        System.out.println ("Вы ввели число " + op2);
        scan.close();
        System.out.println("Результат: ");
        if (Objects.equals(op, "+")) {
            result = op1 + op2;
            System.out.println(result);
        }
        else if (Objects.equals(op, "-")) {
            result = op1 - op2;
            System.out.println(result);
        }
        else if (Objects.equals(op, "*")) {
            result = op1 * op2;
            System.out.println(result);
        } else if (Objects.equals(op, "/")) {
            result = op1 / op2;
            System.out.println(result);
        } else {
            System.out.println("Введен неверный символ операции!!!");
        }
        return result;
    }




}

package homework1.tasks;
// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static int triangleNumber (int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++) {
            sum += i;
        }
        return sum;
    }
    public static int factorialN (int n) {
        int fact = 1;
        for (int i = 1; i <= n ; i++) {
            fact *= i;
        }
        return fact;
    }

}



package hw3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        int count = taskScanner.nextInt();
        int summ = 0;
        while (count > 0) {
            int digit = count % 10;
            count /= 10;
            summ = summ + digit;
        }
        System.out.println("Cумма цифр числа равна " + summ);
    }
}

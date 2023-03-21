package hw3;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        int a = (int) (1 + Math.random() * 10);
        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 9");
        int count = taskScanner.nextInt();
        while (count != 0) {
        if (count == a) {
            System.out.println("Вы угадали");
            break;}
          else  if (count > a) {System.out.println("загаданное число меньше");
            System.out.println("Введите число от 1 до 9");
            count = taskScanner.nextInt();
          }
          else {System.out.println("загаданное число больше");
            System.out.println("Введите число от 1 до 9");
            count = taskScanner.nextInt();
          }
        }
        System.out.println("Выход из программы");

    }
}

package hw3;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {

        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Придумайте число от 2 до 100");
        int a = (int) (2 + Math.random() * 101), b = 101, c = 1;
        System.out.println("Загаданное число равно " + a + "?");
        System.out.println("Введите ответ, 0 - НЕТ, 1 - ДА");
        int answer1 = taskScanner.nextInt();

        while (answer1 == 0) {
            System.out.println("Загаданное число больше " + a + "?");
            System.out.println("Введите ответ, 0 - НЕТ, 1 - ДА");
            int answer2 = taskScanner.nextInt();
          if (answer2 == 1) {c = a;
              a = a + (b - a) / 2;
              System.out.println("Загаданное число равно " + a + "?");
          }
          else {b = a;
              a = a - (a - c) / 2;
              System.out.println("Загаданное число равно " + a + "?");}

            System.out.println("Введите ответ, 0 - НЕТ, 1 - ДА");
            answer1 = taskScanner.nextInt();
            }
        System.out.println("Загаданное число " + a);
        }


    }

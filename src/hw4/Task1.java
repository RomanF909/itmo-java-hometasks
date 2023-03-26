package hw4;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String count = taskScanner. nextLine();
                   while (true) {
                       if (count.equals("Exit")) {
                           break;}
                       else {
                           System.out.println("Введите строку");
                           count = taskScanner.nextLine();
                           count = count.strip();
                           count = count.substring(0, 1).toUpperCase() + count.substring(1).toLowerCase();
                           System.out.println(count);
                       }
                }

        }

    }


package hw4;
import java.util.Arrays;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        int n = 3;
        String[] mass = new String[n];
        Scanner taskScanner = new Scanner(System.in);
        String count = "";

        for (int i = 0; i < n; i++) {

            System.out.println("Введите слово");
            count = taskScanner. nextLine();

            if ("exit".equals(count)) break;
            boolean inArray = false;
            for (int j = 0; j < n; j++) {

                if (mass[j] != null && mass[j].equals(count)) {
                    System.out.println("Слово содержится в массиве");
                    i--;
                    inArray = true;
                    break;        }
            }
            if (!inArray) {
                mass[i] = count;    }
        }
        System.out.print(Arrays.toString(mass));

        }

    }

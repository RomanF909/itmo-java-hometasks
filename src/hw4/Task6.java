package hw4;
import java.util.Arrays;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {

        int n = 3;

        String[] mass = new String[n];

        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Введите слово");
        String count = taskScanner. nextLine();


        for (int i = 1; i < n; i++) {

                    if (mass[i-1].equals("exit")) break;
            else {
                System.out.println("Введите слово");
                count = taskScanner. nextLine();
                if (mass.equals(count)) i--;
                else mass[i] = count;

            }

        }
        System.out.print(Arrays.toString(mass));

        }

    }

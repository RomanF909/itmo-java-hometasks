package hw4;

import java.util.Scanner;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        Scanner taskScanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int a = taskScanner. nextInt();
        int[] mass;
        mass = new int[a];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 200);
            System.out.println(mass[i]);
        }
        Arrays.sort(mass);

        System.out.println("Минимальный элемент " + mass[0]);
        System.out.println("Максимальный элемент " + mass[mass.length - 1]);
        System.out.println("Среднее арифметическое " + (mass[0] + mass[mass.length - 1])/2);

    }
}

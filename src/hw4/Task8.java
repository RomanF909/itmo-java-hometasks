package hw4;
//Создать массив, наполнить его целыми числами (отрицательными и положительными).
// Отрицательные элементы массива скопировать в новый массив.
//Размер массива должен быть равен количеству отрицательных элементов.

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] mass = {-10, 5, 103, 26, -89};
        int count = 0;

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) count++;
        }
        int[] otrMass = new int[count];
        int j = 0;
        for (int num : mass) {
            if (num < 0) {
                otrMass[j] = num;
                j++;
            }
        }
        System.out.print(Arrays.toString(otrMass));

    }
}

package hw4;

import java.util.Arrays;
import java.util.Collections;

public class Task5 {
    public static void main(String[] args) {

        Integer[] mass = new Integer[5];
                for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (1 + Math.random() * 11) * 2;
                 }
        Arrays.sort(mass, Collections.reverseOrder());
        System.out.print(Arrays.toString(mass));

    }
}

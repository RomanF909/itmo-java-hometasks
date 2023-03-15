package hw1;

public class Task4 {
    public static void main(String[] args) {
        short digit = 45;
        int one = digit % 10;
        int two = (digit - one) / 10;
        int sum = one + two;
        System.out.println(sum);
    }
}

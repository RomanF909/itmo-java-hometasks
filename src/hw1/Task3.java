package hw1;

public class Task3 {
    public static void main(String[] args) {
        double time = 2.5, dist = 10.3;
        time *= 360;
        dist *= 1000;
        double speed = dist / time;
        System.out.println(speed);
    }
}

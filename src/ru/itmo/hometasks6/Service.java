package ru.itmo.hometasks6;

public class Service {
    public static void main(String[] args) {


        Train train01 = new Train(52, 10, "green", 23);
        Train train02 = new Train(16, 15, "green", 34);

        Bus bus01 = new Bus(26, 25, "red", "no");
        Bus bus02 = new Bus(31, 46, "blue", "yes");

        Car car01 = new Car(76, 5, "yellow");
        Car car02 = new Car(65, 12, "red");

        Transport[] trts = {train01, train02, bus01, bus02, car01, car02};
        String[] colors = {"red", "blue", "yellow", "green"};

        for (Transport transport : trts) {

            if (transport instanceof Train && ((Train) transport).level > 0) {

                ((Train) transport).level--;
                ((Train) transport).volume++;

            }
            if (transport instanceof Bus && ((Bus) transport).level > 0) {

                ((Bus) transport).level--;
                ((Bus) transport).wifi = "yes";

            }
            if (transport instanceof Car && ((Car) transport).level > 0) {

                ((Car) transport).level--;
                int a = (int) (0 + Math.random() * 5);
                ((Car) transport).color = colors[a];

            }


        }
    }
}

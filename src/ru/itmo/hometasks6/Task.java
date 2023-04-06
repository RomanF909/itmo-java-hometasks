package ru.itmo.hometasks6;
public class Task {
    public static void main(String[] args) {
        Train train01 = new Train("train01", 5);
        Train train02 = new Train("train02", 7);
        Train train03 = new Train("train03", 9);

        Bus bus01 = new Bus("bus01", "blue");
        Bus bus02 = new Bus("bus02", "green");
        Bus bus03 = new Bus("bus03", "red");

        Car car01 = new Car("car01", "white");
        Car car02 = new Car("car02", "black");
        Car car03 = new Car("car03", "red");

        Service service = new Service();
        service.addTransport(train01);
        service.addTransport(train02);
        service.addTransport(bus01);
        service.addTransport(bus02);

        service.startRepair();

        service.addTransport(car01);
        service.addTransport(train03);
        service.addTransport(car02);
        service.addTransport(car03);

        service.startRepair();
    }
}

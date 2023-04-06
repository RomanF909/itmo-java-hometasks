package ru.itmo.hometasks6;
public class Service {
    private Transport[] transports;
    private int transportIndex;
    private String[] colors = {"blue", "green", "red", "yellow", "black", "white"};

    public Service() {
        transports = new Transport[3];
    }

    public void addTransport(Transport transport){ // добавление транспорта в мастерскую
        // необходима проверка входящих данных (transport)
        if (transportIndex == transports.length) {
            System.out.println("В мастерской нет места для транспортного средства " + transport.getNumber());
            return;
        }
        transports[transportIndex] = transport; // добавили транспорт в массив
        transportIndex++;
        System.out.println("Транспортное средство " + transport.getNumber() + " добавлено");
    }

    public void startRepair(){
        for (int i = 0; i < transports.length; i++) {
            if (transports[i] == null) continue;

            transports[i].repair(); // ремонт транспортного средства
            System.out.println("Транспортное средство " + transports[i].getNumber() + " отремонтировано");

            if (transports[i] instanceof RePaintAble) { // если транспортное средство можно перекрасить
                int colorIndex = (int) (Math.random() *  colors.length); // случайный индекс
                ((RePaintAble) transports[i]).changeColor(colors[colorIndex]); // приводим к нужному типу, вызываем метод
                System.out.println("Транспортное средство " + transports[i].getNumber() + " перекрашено");
            }

            System.out.println("Транспортное средство " + transports[i].getNumber() + " покидает сервис");
            transports[i] = null;
            transportIndex--;
        }
    }

}

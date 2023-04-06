package ru.itmo.hometasks6;
public class Transport {
    private int wearLevel; // уровень износа
    private String number; // номер

    public Transport(String number) {
        // необходима проверка входящих данных (number)
        this.number = number;
    }

    public void upWearLevel() {
        wearLevel++;
    }

    public int getWearLevel() {
        return wearLevel;
    }

    public String getNumber() {
        return number;
    }

    public void repair() { // ремонт транспортного средства
        if (wearLevel > 0) wearLevel--; // снижает уровень износа
    }
}

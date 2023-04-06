package ru.itmo.hometasks6;

public class Bus extends Transport{
    private final String color; // значение нельзя изменить
    private boolean wifi;

    public Bus(String number, String color) { // все автобусы разного цвета
        super(number);
        // необходима проверка входящих данных (color)
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public boolean isWifi() {
        return wifi;
    }

    @Override
    public void repair() {
        super.repair(); // снижает уровень износа
        if (!wifi) wifi = true; // добавляет wifi, если его не было
    }
}

package ru.itmo.hometasks6;

public class Car extends Transport implements RePaintAble{
    private String color;

    public Car(String number, String color) { // все машины разного цвета
        super(number);
        // необходима проверка входящих данных (color)
        if (color == null) {
            throw new IllegalArgumentException("Exception: color = null");
        }
        this.color = color;
    }

    @Override
    public void changeColor(String newColor) {
        if (color == null) {
            throw new IllegalArgumentException("Exception: color = null");
        }
        // необходима проверка входящих данных (newColor)
        this.color = newColor; // машина будет перекрашена
    }
}

package ru.itmo.hometasks6;
public class Train extends Transport{

    private final String color = "Blue"; // все поезда одинакового цвета,
    // значение нельзя изменить

    private int carCount; // количество вагонов

    public Train(String number, int carCount) {
        super(number);
        if (carCount <= 0) {
            throw new IllegalArgumentException("Exception: carCount <= 0");
        }
        // необходима проверка входящих данных (carCount)
        this.carCount = carCount;
    }

    public String getColor() {
        return color;
    }

    public int getCarCount() {
        return carCount;
    }

    @Override
    public void repair() {
        super.repair(); // снижает уровень износа
        if (Math.random() < 0.5) { // иногда
            carCount++; // увеличивает количество вагонов
        }
    }
}

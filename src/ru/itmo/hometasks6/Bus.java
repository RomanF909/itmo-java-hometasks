package ru.itmo.hometasks6;

public final class Bus extends Transport{


    public Bus(int number, int level, String color, String wifi) {
        setNumber(number);
        setLevel(level);
        setColor(color);
        if (wifi != "yes" || wifi != "no") {
            throw new IllegalArgumentException("Exception: wifi - yes or no");
        }
        this.wifi = wifi;
    }
    @Override
    public final void setColor (String colorBus) {
        this.color = colorBus;
    }


}




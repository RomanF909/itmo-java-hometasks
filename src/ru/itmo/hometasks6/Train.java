package ru.itmo.hometasks6;

public final class Train extends Transport{



    public Train(int number, int level, String color, int volume) {
        setNumber(number);
        setLevel(level);
        setColor(color);
        setVolume(volume);

    }
    @Override
    public final void setColor (String colorTr) {
        if (colorTr != "green") {
            throw new IllegalArgumentException("Exception: color train - green");
        }
        this.color = colorTr;
    }
    public  void setVolume (int volume) {
        this.volume = volume;
    }


}




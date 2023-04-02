package ru.itmo.hometasks6;

public abstract class Transport {

protected int level;
protected int number;
protected int volume;
protected String color;
protected String wifi;

    public final void setNumber(int number) {
        if (number == 0) {
            throw new IllegalArgumentException("Exception: number = 0");
        }
        this.number = number;
    }

    public int getNumber(){
        return level;
    }

    public void setLevel(int level) {
        if (level < 0) {
            throw new IllegalArgumentException("Exception: level < 0");
        }
        this.level = level;
    }

    public int getLevel(){
        return level;
    }

    public void setColor(String color) {
        if (color == null) {
            throw new IllegalArgumentException("Exception: color = null");
        }
        this.color = color;
    }

    public String getColor(){
        return color;
    }


}

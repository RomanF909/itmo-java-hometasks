package ru.itmo.hometasks5.task1;

public class Mount {
    public String title;
    private String country;
    private int high;

    public Mount(String title, String country, int high) {
        if (title.length() < 4) throw new IllegalArgumentException("Exception: title < 4");
        if (country.length() < 4) throw new IllegalArgumentException("Exception: country < 4");
        if (high < 100) throw new IllegalArgumentException("Exception: high < 100");
        this.title = title;
        this.country = country;
        this.high = high;

    }
}

package ru.itmo.hometasks5.task1;

public class Alpin {
    public String name;
    private String adres;

    public Alpin(String name, String adres) {
        if (name.length() < 3) {throw new IllegalArgumentException("Exception: name < 3");}
        if (adres.length() < 5) {throw new IllegalArgumentException("Exception: address < 5");}
        this.name = name;
        this.adres = adres;

    }

}

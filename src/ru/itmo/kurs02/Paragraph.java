package ru.itmo.kurs02;

import ru.itmo.kurs01.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Paragraph {
    private int number;
    private String name;
    private String text;
    private String changer;


    public Paragraph(int number, String name, String text, String changer) {
        this.number = number;
        this.name = name;
        this.text = text;
        this.changer = changer;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public String getChanger() {
        return changer;
    }


}






    

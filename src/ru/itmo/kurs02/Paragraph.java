package ru.itmo.kurs02;

import ru.itmo.kurs01.Person;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Paragraph {
    private String name;
    private String text;
    private String changer;


    public Paragraph(String name, String text, String changer) {
        this.name = name;
        this.text = text;
        this.changer = changer;
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






    

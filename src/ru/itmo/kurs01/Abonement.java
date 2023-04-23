package ru.itmo.kurs01;

import java.time.LocalDate;

public class Abonement {
    private int number;
    private LocalDate dateEnd;
    private LocalDate dateReg = LocalDate.now();
    private String type;
    private Person person;


    public Abonement(int number,LocalDate dateEnd, String type, Person person){
        if (number < 1) throw new IllegalArgumentException("Exception: number < 1");
        if (dateEnd.isBefore(LocalDate.now())) throw new IllegalArgumentException("Exception: указана прошедшая дата");
        if (type.length()< 6) throw new IllegalArgumentException("Exception: type ошибочный");
        this.number = number;
        this.dateReg = dateReg;
        this.dateEnd = dateEnd;
        this.type = type;
        this.person = person;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public String getType() {
        return type;
    }

    public Person getPerson() {
        return person;
    }
}

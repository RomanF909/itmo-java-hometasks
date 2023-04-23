package ru.itmo.kurs01;

public class Person {
    private String name;
    private String surname;
    private int year;


    public Person(String name, String surname, int year){
        if (name.length() < 1) throw new IllegalArgumentException("Exception: имя указано ошибочное");
        if (surname.length() < 1) throw new IllegalArgumentException("Exception: фамилия указана ошибочная");
        if (year < 1900 || year > 2023) throw new IllegalArgumentException("Exception: год рождения ошибочный");
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


}

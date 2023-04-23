package ru.itmo.kurs01;
import java.time.LocalDate;
import java.time.Month;

public class Application {
    public static void main(String[] args) {
        Person owner = new Person("Александр", "Дмитриев", 1989);
        Person person01 = new Person("Петр", "Иванов", 1976);
        Person person02 = new Person("Анна", "Блинова", 1989);
        Person person03 = new Person("Елена", "Василина", 1968);
        Person person04 = new Person("Иван", "Петров", 1995);
        Person person05 = new Person("Сергей", "Сергеев", 2001);


        Abonement abonement01 = new Abonement(15, LocalDate.of(2025, Month.JULY, 15), "Разовый", person01);
        Abonement abonement02 = new Abonement(23, LocalDate.of(2023, Month.APRIL, 6), "Дневной", person02);
        Abonement abonement03 = new Abonement(54, LocalDate.of(2024, Month.SEPTEMBER, 21), "Полный", person03);
        Abonement abonement04 = new Abonement(61, LocalDate.of(2028, Month.MAY, 19), "Полный", person04);
        Abonement abonement05 = new Abonement(86, LocalDate.of(2023, Month.NOVEMBER, 26), "Дневной", person05);


    }
}

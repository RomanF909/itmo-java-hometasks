package ru.itmo.hometasks12.task01;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import java.util.Objects;


import static java.lang.Math.min;

public class Task01 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student(1, "Женя", Student.Gender.MALE, LocalDate.now().minusYears(10)),
                new Student(2, "Олег", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(3, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(6)),
                new Student(4, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(12)),
                new Student(5, "Алексей", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(6, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(9)),
                new Student(7, "Иван", Student.Gender.MALE, LocalDate.now().minusYears(17)),
                new Student(8, "Петр", Student.Gender.MALE, LocalDate.now().minusYears(5)),
                new Student(9, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(8)),
                new Student(10, "Алена", Student.Gender.FEMALE, LocalDate.now().minusYears(10)),
                new Student(11, "Григорий", Student.Gender.MALE, LocalDate.now().minusYears(7)),
                new Student(12, "Ирина", Student.Gender.FEMALE, LocalDate.now().minusYears(6))
        ));

        // TODO: Используя методы Stream API:
        //  1. Разделить учеников на две группы: мальчиков и девочек. Результат: Map<Student.Gender, ArrayList<Student>>
        //  2. Найти средний возраст учеников // Stream -> collect(Collectors.averagingInt())
        //  3. Найти самого младшего ученика Stream -> min(Comparator.comparing(Student::getAge))
        //.Stream -> min(Comparator<Student>): int compare(T o1, T o2)
        //  4. Найти самого старшего ученика
        //  5. Собрать учеников в группы по году рождения
        // Map<>// получить год из даты LocalDate -> getYear
        // - Stream -> .collect(Collectors.groupingBy())
        //  6. Отсортировать по полу, потом по дате рождения, потом по имени (в обратном порядке), собрать в список (ArrayList) //sort(Comparator)
        //students.sort(Comparator) или Stream -> sorted(Comparator) + .collect(Collectors.toCollection(ArrayList::new))
        //  7. Вывести в консоль всех учеников в возрасте от N до M лет // foreach + if либо filter+foreach
        //  8. Собрать в список всех учеников с именем=someName
        //  9. Собрать Map<Student.Gender, Integer>, где Student.Gender - пол, Integer - суммарный возраст учеников данного пола
        //     см. метод Collectors.summingInt

       //1
        Map<Student.Gender, List<Student>> map01 = students.stream()
                .collect(Collectors.groupingBy(student -> student.getGender(),
                        Collectors.toCollection(ArrayList::new)));
        //2
        students.stream().collect(Collectors.averagingInt(Student::getBirth));
        //3

        students.stream().min(Comparator.comparing(Student::getBirth));
        // тоже самое
       // students.stream().min((s1, s2) -> s2.getBirth().compareTo(s1.getBirth()));

        //4
        students.stream().max(Comparator.comparing(Student::getBirth));
        //5
        Map<Integer, List<Student>> map02 = students.stream()
        .collect(Collectors.groupingBy(student -> student.getBirth(LocalDate -> getYear)),
                Collectors.toCollection(ArrayList::new)));
        //6-9 не понимаю как сделать












    }
}
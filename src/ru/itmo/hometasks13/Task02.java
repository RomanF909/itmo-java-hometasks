package ru.itmo.hometasks13;

import ru.itmo.hometasks12.task01.Student;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Task02 {
    public static void main(String[] args) {

        List<Course> courses = new ArrayList<>(Arrays.asList(
                new Course("Java", 10, 50),
                new Course("Phyton", 11, 52));

        // Задания по классу Course из пакета package ru.itmo.lessons.lesson18.task

        // TODO 1: Создать map,
        //  где ключи - названия курсов,
        //  значения - списки курсов с указанным в ключе названием
        Map<String, List<Course>> map01 = courses.stream()
                .collect(Collectors.groupingBy(course -> course.getName(),
                        Collectors.toCollection(ArrayList::new)));

        // TODO 2: Создать map,
        //  где ключи - продолжительность курсов,
        //  значения - списки курсов с указанной в ключе продолжительностью
        Map<Integer, List<Course>> map02 = courses.stream()
                .collect(Collectors.groupingBy(course -> course.getDuration(),
                        Collectors.toCollection(ArrayList::new)));

        // TODO 3: Создать map, где ключи - названия курсов,
        //  значения - количество курсов с указанным в ключе названием
        Map<String, Integer> map03 = courses.stream()
                .collect(Collectors.summingInt(course -> course.getName(),
                        Collectors.toCollection(ArrayList::new)));

        // TODO 4: Создать map, где ключи - названия курсов,
        //  значения - map,
        //  в которой  ключи - продолжительность курса,
        //  а значения - списки курсов с указанной в ключе продолжительностью
        Map<String, Map<Integer,List<Course>>> map04 = courses.stream()
                .collect(Collectors.groupingBy(course -> course.getDuration(),
                        Collectors.toCollection(ArrayList::new)));

    }
}
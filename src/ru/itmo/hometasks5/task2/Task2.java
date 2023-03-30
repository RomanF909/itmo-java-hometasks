package ru.itmo.hometasks5.task2;

import ru.itmo.hometasks5.task1.Group;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {

        Product pr01 = new Product("стейк", 300, 50, 10);
        Product pr02 = new Product("бутерброд", 100, 80, 200);
        Product pr03 = new Product("овощи", 50, 20, 60);
        Product pr04 = new Product("торт", 70, 100, 500);

        Allow allowed = new Allow();

        allowed.loadProd(pr01);
        allowed.loadProd(pr02);
        allowed.loadProd(pr03);
        allowed.loadProd(pr04);

        allowed.printRazr();

    }
}

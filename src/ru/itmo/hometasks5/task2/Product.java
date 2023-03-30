package ru.itmo.hometasks5.task2;

public class Product {
public String name;
public int protein;
public int fat;
public int carb;

    public Product(String name, int protein, int fat, int carb) {
        if (name.length() < 3) {throw new IllegalArgumentException("Exception: name < 3");}
        if (protein < 0) {throw new IllegalArgumentException("Exception: protein < 0");}
        if (fat < 0) {throw new IllegalArgumentException("Exception: fat < 0");}
        if (carb < 0) {throw new IllegalArgumentException("Exception: carb < 0");}
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carb = carb;

    }


}

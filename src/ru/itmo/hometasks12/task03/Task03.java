package ru.itmo.hometasks12.task03;

import ru.itmo.hometasks9.Task1.Fruit;

import java.util.Optional;

public class Task03 {
    public  static  boolean isFruitValid(Fruit fruit) {

        //1
        return  Optional.ofNullable(fruit)
                .filter(a -> !(a.getType() == null))
                  .filter(a -> a.getCount() > 1)
                .filter(a -> a.getPrice() > 1)
                .isPresent();



        //2
        return  Optional.ofNullable(fruit)
                //.filter(f -> f.getCount() > 5 && f.getPrice() <= 100)
                .filter(f -> f.getCount() > 5)
                .filter(f -> f.getPrice() <= 100)
                .isPresent();


        //3
        return  Optional.ofNullable(fruit)

                .filter(b -> !(b.getType() == null))
                .isPresent();
    }

    public static void main(String[] args) {
        // Задания на методы Optional:
        // 1. написать метод, который принимает на вход тип фрукта, стоимость и количество
        // и возвращает Optional контейнер с экземпляром типа Fruit
        // или Optional контейнер с null ссылкой, если тип фрукта == null, а стоимость или количество меньше 1



        // 2. написать метод, который принимает на вход экземпляр типа Fruit
        // и возвращает true, если его передан не null, количество фруктов (getCount) больше 5,
        // а стоимость не больше 100 (getPrice)
        // Вместо обычных проверок использовать тип Optional и подходящие методы



        // 3. написать метод, который принимает на вход экземпляр типа Fruit
        // и возвращает
        // название фрукта (FruitType.getName()) в Optional контейнере, если тип фрукта определен,
        // и Optional контейнер с null ссылкой, если тип фрукта == null
        // Вместо обычных проверок использовать тип Optional и подходящие методы


    }


}
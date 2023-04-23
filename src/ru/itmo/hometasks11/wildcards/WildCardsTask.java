package ru.itmo.hometasks11.wildcards;

import ru.itmo.hometasks11.bounded.Repaintable;
import ru.itmo.hometasks11.bounded.Vehicle;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;


    // 1 метод:
    public class WildCardsTask {
    public static void blackColor (List<? extends Repaintable> repaintableList){
        for (Repaintable repaintable : repaintableList) {
            repaintable.changeColor(Repaintable.Color.BLACK);
        }
    }
    // 2 метод:
    public static List<? extends Repaintable> getByColor(Map<Repaintable.Color, ? extends List<? extends Repaintable>> map, Repaintable.Color color){
        if (color == null) return null;
        return  map.get(color);
    }





    public static void main(String[] args) {
        // Ответить на вопросы:
        // 1. generic в java инвариантны. как достичь их ко- и контрвариантности?
        // 2. Чем метод sendRequest(List<? extends Resources> list) от метода sendRequest(List<Resources> list)

        // Написать следующие static методы (для типов из пакета bounded):
        // 1 метод:
        // написать метод, в который можно передать список объектов любого типа, реализующего Repaintable интерфейс
        // (например, список машин или список велосипедов)
        // в методе всем объектам из списка должен устанавливаться Repaintable.Color.BLACK цвет

        List<Car> cars = new ArrayList<>();
        List<MiniCar> miniCars = new ArrayList<>();
        List<Repaintable> repaintables = new ArrayList<>();
        blackColor(cars);
        blackColor(miniCars);
        blackColor(repaintables);



        // 2 метод:
        // написать метод, в который можно передать два аргумента:
        // 1 аргумент - map, где ключи - Repaintable.Color,
        // а значения - списки (List, ArrayList или LinkedList) объектов любого типа,
        // реализующего Repaintable интерфейс (например, список машин или список велосипедов)
        // 2 аргумент - цвет (Repaintable.Color color)
        // метод возвращает список объектов любого типа, реализующего Repaintable интерфейс
        // (например, список машин или список велосипедов) цвета color
        HashMap<Repaintable.Color, ArrayList<Car>> colorCars = new HashMap<>();
        List<Repaintable> list = new ArrayList<>(getByColor(colorCars, Repaintable.Color.BLUE));
        // 3 метод:
        // написать метод, принимающий на вход 3 аргумента:
        // 2 мапы, где ключи - номера транспортных средств, значения - транспортные средства (например машины или автобусы)
        // и уровень износа (wearLevel)
        // в методе переместить транспортные средства из первой map во вторую, если уровень износа транспортного средства больше wearLevel
    }
    public static void copyByWearLevel(Map<String, ? extends Vehicle> from, Map<String, ? super Vehicle> to, int wearLevel){
        for (Map.Entry<String, ? extends Vehicle> entry : from.entrySet()) {
            if (entry.getValue(), getWearLevel() > wearLevel) {
                to.put(entry.getKey(), entry.getValue());
            }
        }
        
    }
}


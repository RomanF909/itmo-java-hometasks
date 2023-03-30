package ru.itmo.hometasks5.task2;

import ru.itmo.hometasks5.task1.Alpin;

import java.util.Arrays;

public class Allow {

    public String title;
    private int proteinMax = 500;
    private int fatMax = 50;
    private int carbMax = 100;
    private int indexA;
    public Product[] razr = new Product[4];

    public Allow() {
    }

    public void loadProd(Product prod) {
        if (prod.name == null) {
            System.out.println("В группу добавляются продукты");
            return;
        }

        if (razr.length == indexA) {
            System.out.println("В массиве нет места");
            return;
        }

        if (proteinMax < prod.protein) {
            System.out.println(prod.name + " слишком много белка");
            return;
        }
        if (fatMax < prod.fat) {
            System.out.println(prod.name + " слишком много жира");
            return;
        }

        if (carbMax < prod.carb) {
            System.out.println(prod.name + " слишком много углеводов");
            return;
        }

        razr[indexA] = prod;
        indexA++;
        System.out.println(prod.name + " в списке разрешенных продуктов");

    }

   public void printRazr() {

        System.out.print(Arrays.toString(razr));
    }


}

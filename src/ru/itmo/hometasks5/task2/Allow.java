package ru.itmo.hometasks5.task2;

import ru.itmo.hometasks5.task1.Alpin;

import java.util.Arrays;

public class Allow {

    public String title;
    private int proteinMax = 500;
    private int fatMax = 50;
    private int carbMax = 100;
    private int indexA;
    private Product[] razr = new Product[4];

    public Allow() {
    }

    public void loadProd(Product prod) {
        if (prod.getName() == null) {
            System.out.println("В группу добавляются продукты");
            return;
        }

        if (razr.length == indexA) {
            System.out.println("В массиве нет места");
            return;
        }

        if (proteinMax < prod.protein) {
            System.out.println(prod.getName() + " слишком много белка");
            return;
        }
        if (fatMax < prod.fat) {
            System.out.println(prod.getName() + " слишком много жира");
            return;
        }

        if (carbMax < prod.carb) {
            System.out.println(prod.getName() + " слишком много углеводов");
            return;
        }

        razr[indexA] = prod;
        indexA++;
        System.out.println(prod.getName() + " в списке разрешенных продуктов");

    }

   public void printRazr() {
       System.out.println("Список разрешенных продуктов:");
       for (int i = 0; i < 4; i++) {
           if (razr[i] != null)
           System.out.println(razr[i].getName());
       }

    }


}

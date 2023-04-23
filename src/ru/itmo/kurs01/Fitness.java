package ru.itmo.kurs01;


import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;

public class Fitness {
    private Abonement[] pool = new Abonement[20];
    private Abonement[] gym = new Abonement[20];
    private Abonement[] group = new Abonement[20];

    private LocalTime timeNow = LocalTime.now();

    public void setPlace(Abonement abonement, String zone) {
        if (zone == "pool") {
            if (abonement.getDateEnd().isBefore(LocalDate.now())) throw new IllegalArgumentException("Exception: абонемент просрочен");
            if (abonement.getType().equals("Дневной")) throw new IllegalArgumentException("Exception: попытка пройти в зону, которая не разрешена по абонементу");
            if (pool[19] == null) throw new IllegalArgumentException("Exception: в зоне нет свободных мест");
            for (int i = 0; i < 19; i++) {
                if (pool[i] == null) {
                    pool[i] = abonement;
                    System.out.println("Фамилия: " + abonement.getPerson().getSurname() + ", Имя: " + abonement.getPerson().getName() + ", Посещаемая зона: " + zone);
                    System.out.println("Дата посещения: " + LocalDate.now() + ", время: " + LocalTime.now());
                    break;
                }
              }
            }
        if (zone == "gym") {
            if (abonement.getDateEnd().isBefore(LocalDate.now())) throw new IllegalArgumentException("Exception: абонемент просрочен");
            if (abonement.getType().equals("Дневной") & LocalTime.now().isAfter(LocalTime.of(16, 00, 00))) throw new IllegalArgumentException("Exception: попытка пройти в зону по времени, которое не разрешено по абонементу");
            if (gym[19] == null) throw new IllegalArgumentException("Exception: в зоне нет свободных мест");
            for (int i = 0; i < 19; i++) {
                if (gym[i] == null) {
                    gym[i] = abonement;
                    System.out.println("Фамилия: " + abonement.getPerson().getSurname() + ", Имя: " + abonement.getPerson().getName() + ", Посещаемая зона: " + zone);
                    System.out.println("Дата посещения: " + LocalDate.now() + ", время: " + LocalTime.now());
                    break;
                }
            }
        }

        if (zone == "group") {
            if (abonement.getDateEnd().isBefore(LocalDate.now())) throw new IllegalArgumentException("Exception: абонемент просрочен");
            if ((abonement.getType().equals("Дневной") & LocalTime.now().isAfter(LocalTime.of(16, 00, 00))) || (abonement.getType().equals("Разовый"))) throw new IllegalArgumentException("Exception: попытка пройти в зону, которая не разрешена по абонементу");
            if (group[19] == null) throw new IllegalArgumentException("Exception: в зоне нет свободных мест");
            for (int i = 0; i < 19; i++) {
                if (group[i] == null) {
                    group[i] = abonement;
                    System.out.println("Фамилия: " + abonement.getPerson().getSurname() + ", Имя: " + abonement.getPerson().getName() + ", Посещаемая зона: " + zone);
                    System.out.println("Дата посещения: " + LocalDate.now() + ", время: " + LocalTime.now());
                    break;
                }
            }
        }
    }


    public void closeFitness(LocalTime timeNow) {
        if (timeNow.isAfter(LocalTime.of(22, 00, 00))) {
            for (int i = 0; i < 19; i++) {
                pool[i] = null;
                gym[i] = null;
                group[i] = null;
            }
        }
    }


    public void printMass (Abonement[] pool, Abonement[] gym,Abonement[] group) {
        System.out.println(Arrays.toString(pool));
        System.out.println(Arrays.toString(gym));
        System.out.println(Arrays.toString(group));
    }

}


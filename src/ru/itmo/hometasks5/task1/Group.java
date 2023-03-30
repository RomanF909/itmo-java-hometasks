package ru.itmo.hometasks5.task1;

public class Group {
    private int number;
    private String hills;
    private Alpin[] person;
    private int index;

    public Group(int number, String hills) {
        if (number < 1) throw new IllegalArgumentException("Exception: number < 1");
        if (hills == null) throw new IllegalArgumentException("Exception: hills != 0");
        this.number = number;

        this.hills = hills;
        person = new Alpin[3];

    }
    public void loadAlp(Alpin alp) {
        if (alp == null) {
            System.out.println("В группу добавляются альпинисты");
            return;
        }

        if (person.length == index) {
            System.out.println("В группе нет места");
            return;

        }

        person[index] = alp;
        index++;

    }











}

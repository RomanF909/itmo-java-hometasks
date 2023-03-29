package ru.itmo.hometasks5.task1;

public class Task {
    public static void main(String[] args) {
        String[] gr1 = new String[3];
        String[] gr2 = new String[2];
        String[] gr3 = new String[2];

        Group group01 = new Group();
        group01.name = "Петр Петров";
        group01.address = "ул.Центральная, 1564";
        group01.Namehill = "Эльбрус";
        group01.CountryHill = "РФ";
        group01.HighHill = 5642;

        Group group02 = new Group();
        group02.name = "Иван Иванов";
        group02.address = "ул.Центральная, 15";
        group02.Namehill = "Чегет";
        group02.CountryHill = "РФ";
        group02.HighHill = 3769;

        Group group03 = new Group();
        group03.name = "Сергей Сергеев";
        group03.address = "ул.Центральная, 64";
        group03.Namehill = "Пшиш";
        group03.CountryHill = "РФ";
        group03.HighHill = 3790;

    }
}

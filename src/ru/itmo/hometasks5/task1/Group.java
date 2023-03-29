package ru.itmo.hometasks5.task1;

public class Group {

    public String name;
    public String Namehill;
    public String address;
    public int HighHill;
    public String CountryHill;

    public void setName(String name) {
        // проверка входящих данных
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("name не менее 3 символов");
        }
        name = name;
    }
        public void setAddress(String address) {
            // проверка входящих данных
            if (address == null || address.length() < 5) {
                throw new IllegalArgumentException("address не менее 5 символов");
            }
            address = address;
        }
    public void setNamehill(String Namehill) {
        // проверка входящих данных
        if (Namehill == null || Namehill.length() < 5) {
            throw new IllegalArgumentException("Namehill не менее 4 символов");
        }
        Namehill = Namehill;
    }
    public void setCountryHill(String CountryHill) {
        // проверка входящих данных
        if (CountryHill == null || CountryHill.length() < 5) {
            throw new IllegalArgumentException("Namehill не менее 4 символов");
        }
        CountryHill = CountryHill;
    }
    public void setHighHill(int HighHill) {
        // проверка входящих данных
        if (HighHill < 100) {
            throw new IllegalArgumentException("HighHill не менее 100 метров");
        }
        CountryHill = CountryHill;
    }


}

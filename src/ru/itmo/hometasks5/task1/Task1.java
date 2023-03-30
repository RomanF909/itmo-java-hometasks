package ru.itmo.hometasks5.task1;

/*Описать объектную модель Альпинист, Гора, Группа для восхождения на гору.

Альпинист создаётся с именем (не менее 3 символов) и адресом проживания (не менее 5 символов).
Гора создаётся с названием (не менее 4 символов), страной (не менее 4 символов) и высотой (не менее 100 метров)
Группа для восхождения на гору создаётся со следующими характеристиками и возможностями:
идёт набор в группу или нет;
массив альпинистов;
гора;
должна быть возможность добавить альпиниста в группу (в массив), если набор ещё идёт
В методе main (отдельного класса) создать:
3 группы для восхождений на 3 различных горы.
В первой группе 3 альпиниста (набор закрыт)
Во второй и третьей группах по 2 альпиниста (набор в эти группы открыт)*/

public class Task1 {
    public static void main(String[] args) {


    Alpin alp01 = new Alpin("Petr", "Lenina 56");
    Alpin alp02 = new Alpin("Ivan", "Nabereznaa 12");
    Alpin alp03 = new Alpin("Anna", "Solnechnaya 10");
    Alpin alp04 = new Alpin("Elena", "Nabereznaa 26");
    Alpin alp05 = new Alpin("Dima", "Solnechnaya 13");
    Alpin alp06 = new Alpin("Alex", "Lenina 24");
    Alpin alp07 = new Alpin("Katya", "Pushkina 116");

    Mount m01 = new Mount("Elbrus", "RF", 5642);
    Mount m02 = new Mount("Donguz", "RF", 3769);
    Mount m03 = new Mount("Dihtay", "RF", 5204);

    Group gr01 = new Group(1, m03.title);
    Group gr02 = new Group(2, m02.title);
    Group gr03 = new Group(3, m01.title);


   gr01.loadAlp(alp01);
   gr01.loadAlp(alp02);
   gr01.loadAlp(alp03);

   gr02.loadAlp(alp04);
   gr02.loadAlp(alp05);

   gr03.loadAlp(alp06);
   gr03.loadAlp(alp07);



    }


}

package ru.itmo.hometasks8;

public class Task8 {
    public static void main(String[] args) {
        //1
        PairContainer<Integer, String> container01 = new PairContainer<>();
        container01.setKey(5);
        container01.setValue("dfsdfgsd");

        //2
        PairContainer<String, User> container02 = new PairContainer<>();
        container02.setKey("hbjhbhb");
        User<Integer> oneUser = new User<>();
        oneUser.setId(6);
        container02.setValue(oneUser);

        //3
        PairContainer<String, PairContainer> container03 = new PairContainer<>();
        container03.setKey("hjghhgdh");
        PairContainer<Integer, User<String>> cont = new PairContainer<>();
        User<String> twoUser = new User<>();
        twoUser.setId("yndjf03");
        cont.setValue(twoUser);
        cont.setKey(46);
        container03.setKey("uennkjnkj");
        container03.setValue(cont);

    }
}

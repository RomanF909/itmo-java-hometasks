package ru.itmo.hometasks10;

import java.util.*;

public class Task02 {

    // TODO (2.1) написать статический метод, который принимает на вход map (например, firstTaskMap) и город (например, city),
    //  формирует и возвращает список (List) логинов, которые соответствуют переданному городу

    public  static  List<String> getLogins(HashMap<String, String> map, String city) {
        ArrayList<String> loginArrayList = new ArrayList<>();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (pair.getValue().equals(city)) {
                    loginArrayList.add(pair.getKey());
            }
        }
        return loginArrayList;
    }



    // TODO (2.2) дан список слов (например, words).
    //  Написать статический метод, который будет возвращать количество одинаковых слов в списке
    //  в map вида Map<String, Integer>, где String - слово и Integer - количество повторений

    public static Map<String, Integer> getWords(List<String> words){
        HashMap<String, Integer> taskWord = new HashMap<>();
               for (String word : words) {
            if (!taskWord.containsKey(word)){
                taskWord.put(word, 1);
            } else {
                taskWord.replace(word, taskWord.get(word) + 1);
            }
        }
        return taskWord;

    }

// TODO (2.3) Задания по тексту (например, text). На каждый пункт - минимум один метод (можно статический):
    //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
    //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
    // FIXME: реализация похожа на метод task02
    //  1. Создать пустую map, для хранения строк и количества повторений (HashMap<String, Long>)
    //  2. Создать массив строк из строки text (нужный метод найти самостоятельно)
    //  3. Перебрать массив строк, полученный в п.2 и на каждой итерации цикла:
    //      3.1. проверять, содержится ли ключ (элемент перебираемой коллекции) в мапе, объявленной в п.1
    //      3.2. если ключ содержится (значит информация о строке из списка уже есть в мапе), получать значение по данному ключу,
    //      увеличивать его на 1, записывать в мапу ключ и новое значение (обновляем количество повторений данной строки)
    //      3.3. если ключ не содержится, записывать в мапу ключ и 1 (строка из списка встретилась первый раз)
    //   4. Мапу, объявленную в п.1, вернуть из метода

    public Map<String, Integer> getsWords(String[] text01){

        HashMap<String, Integer> tasksWord = new HashMap<>();
        for (String word : text01) {
            if (!tasksWord.containsKey(word)){
                tasksWord.put(word, 1);
            } else {
                tasksWord.replace(word, tasksWord.get(word) + 1);
            }
        }
        return tasksWord;

    }

    //  2. написать метод, который собирает все слова в группы по количеству букв:
    //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
    //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)

    public HashMap<Integer, ArrayList<String>> getGroups(String[] text01){

        HashMap<Integer, ArrayList<String>> taskGroup = new HashMap<>();
         for (String word : text01) {
                if (!taskGroup.containsKey(word.length())){
                taskGroup.put(word.length(), (ArrayList<String>) new ArrayList<> (Arrays.asList(word)));
        }
                else taskGroup.put(word.length(), (ArrayList<String>) Arrays.asList(word));
        }
        return taskGroup;

    }

    //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)











    public static void main(String[] args) {
        // FIXME:: В решениях не использовать lambda выражения и stream API


        HashMap<String, String> firstTaskMap = new HashMap<>();
        firstTaskMap.put("qwe", "Тверь");
        firstTaskMap.put("asd", "Тверь");
        firstTaskMap.put("zxc", "Москва");
        firstTaskMap.put("rty", "Тверь");
        firstTaskMap.put("fgh", "Магадан");

        String city = "Тверь";





        List<String> words = new ArrayList<>();
        words.add("may");
        words.add("august");
        words.add("june");
        words.add("may");
        words.add("may");
        words.add("july");
        words.add("may");
        words.add("august");
        words.add("august");


        // TODO (2.3) Задания по тексту (например, text). На каждый пункт - минимум один метод (можно статический):
        //  1. написать метод, принимающий на вход слово и возвращающий частоту встречаемости данного слова в тексте
        //  (Map<String, Long>, где - ключи (String) - слово, значения (Long) - частота встречаемости)
        //  2. написать метод, который собирает все слова в группы по количеству букв:
        //  например, в одну группу попадут слова: 3 - [the, war, jar, get, met...], в другую 2 - [on, up, no, of...]
        //  (Map<Integer, ArrayList<String>>, где - ключи (Integer) - количество букв, значения (ArrayList<String>) - слова)
        //  3. написать метод, который выводит в консоль топ 10 самых часто встречаемых в тексте слов (артикли и предлоги тоже считаем за слова)

        // в тексте содержатся только буквы и пробельные символы
        String text = "It is a uncover long established fact that a reader will be distracted uncover by the readable content of a page " +
                "when looking at its layout The point of using uncover Lorem Ipsum is that sites it has a more-or-less normal distribution of letters" +
                "as uncover opposed to still using Content here humour uncover content here making it look like readable English Many desktop publishing " +
                "packages and web page editors now use Lorem Ipsum as their default model text and a search for lorem ipsum will " +
                "uncover many web sites still uncover in their infancy Various versions uncover have evolved over the years uncover sometimes by accident" +
                " sometimes on purpose injected humour and the like";
        String[] text01 = text.split("\\W+");








    }
}
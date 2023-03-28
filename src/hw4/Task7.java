package hw4;

//Найдите самое длинное слово в предложении, при условии,
// что в предложении все слова разной длины.
//Предложение для поиска длинного слова: "в предложении все слова разной длины"
// (самостоятельно найти метод преобразования строки в массив строк).

public class Task7 {
    public static void main(String[] args) {
        String pred = "в предложении все слова разной длины";
        String[] word = pred.split(" ");
        String longW = "";
        for (int i = 0; i < word.length; i++)
                if (word[i].length() >= longW.length())
                    longW = word[i];

        System.out.println(longW + " - это самое длиное слово, содержащее " + longW.length() + " символов.");

    }
}

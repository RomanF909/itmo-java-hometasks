package ru.itmo.kurs02;
// Reciver

import java.util.Scanner;
public class GameApp {
    int i;
    Paragraph paragraph0 = new Paragraph("Лисенок", "Каждое утро Лисёнок просыпался, завтракал и шёл увидеться с Бельчонком. Это утро не было исключением. Лисёнок пришёл на их обычное место встречи, но Бельчонка там не было. Лисёнок ждал, ждал, но так и не смог дождаться своего друга. Бельчонок не пропустил еще ни одной встречи, вдруг он попал в беду. - подумал Лисёнок. Как поступить Лисенку?", "1. Вернуться домой, 2. Отправиться на поиски");
    Paragraph paragraph1 = new Paragraph("Вернуться домой", "Вернувшись домой, Лисёнок нашёл там Бельчонка. Оказалось, что Бельчонок пришёл на место встречи раньше и увидел там рой злобных пчел. Он поспешил предупредить об этом Лисёнка, но они разминулись. Наконец-то друзья нашли друг друга! Игра завершилась успехом", null);
    Paragraph paragraph2 = new Paragraph("Отправиться на поиски", "Все лесные жители были заняты своими делами и не обращали внимания на Лисёнка и его проблему. Но вдруг кто нибудь видел Бельчонка... Лисёнок не знал, что ему делать. Помогите ему.", "1. Попытаться разузнать о Бельчонке у лесных жителей, 2. Искать Бельчонка в одиночку");
    Paragraph paragraph3 = new Paragraph("Попытаться разузнать о Бельчонке у лесных жителей", "Пока Лисёнок принимал решение, лесные жители разошлись кто куда. Остались только Сова и Волк. Но у Совы бывают проблемы с памятью, а Волк может сильно разозлиться из-за расспросов. Кого выбрать?", "1. Расспросить Сову, 2. Расспросить Волка");
    Paragraph paragraph4 = new Paragraph("Искать Бельчонка в одиночку", "Лисёнок слишком долго плутал по лесу в поисках друга и сам не заметил, как заблудился. Теперь его самого нужно искать. Игра завершилась неудачей", null);
    Paragraph paragraph5 = new Paragraph("Расспросить Сову", "Сова долго не хотела говорить, но в итоге сказала, что видела испуганного Бельчонка, бежавшего вглубь леса. Все лесные жители знают, что в глубине леса опасно, если Бельчонок там, ему срочно нужна помощь.", "1. Поверить Сове и отправиться вглубь леса, 2. Сове не стоит верить -> Искать Бельчонка в одиночку");
    Paragraph paragraph6 = new Paragraph("Расспросить Волка", "Волк оказался вполне дружелюбным, но помочь не смог. Лишь сказал, что маленькому лисенку не стоит бродить по лесу одному. И как теперь поступить?", "1. Волк прав -> Вернуться домой, 2. -> Искать Бельчонка в одиночку");
    Paragraph paragraph7 = new Paragraph("Поверить Сове и отправиться вглубь леса", "В глубине леса Лисёнок встретил Медвежонка. Ленивый Медвежонок был готов рассказать все, что знает, если Лисёнок принесёт ему мёда.", "1. Нет, потрачено слишком много времени, нужно идти дальше -> Искать Бельчонка в одиночку, 2. Нужно воспользоваться шансом и раздобыть мёд");
    Paragraph paragraph8 = new Paragraph("Нужно воспользоваться шансом и раздобыть мёд", "Лисёнок быстро нашёл мёд, но вокруг летал рой злобных пчел. Лисёнок всегда боялся пчёл, но и не найти друга он тоже боялся.", "1. Подождать, вдруг пчёлы улетят, 2. Нужно попытаться выкрасть мёд немедленно");
    Paragraph paragraph9 = new Paragraph("Подождать, вдруг пчёлы улетят", "Лисёнок подождал немного, и пчёлы разлетелись. Лисёнок без проблем набрал мёда. Вдруг он понял, что очень голоден. Что же делать?", "1. Поесть немного и передохнуть, 2. Скорее отнести мёд Медвежонку");
    Paragraph paragraph10 = new Paragraph("Нужно попытаться выкрасть мёд немедленно", "Это была не лучшая идея. Пчёлы покусали Лисёнка, теперь ему самому нужна помощь. Игра завершилась неудачей", null);
    Paragraph paragraph11 = new Paragraph("Поесть немного и передохнуть", "Пока Лисёнок ел, злобные пчёлы вернулись и покусали его. Лисёнку нужна помощь, он не сможет продолжить поиски. Игра завершилась неудачей", null);
    Paragraph paragraph12 = new Paragraph("Скорее отнести мёд Медвежонку", "Довольный Медвежонок рассказал Лисёнку, что очень хорошо знает семью Белок и уверен, что Бельчонок никогда не пошёл бы в глубь леса. Он заверял Лисёнка, что Белки не попадают в неприятности, и что Совам нельзя верить, он также уговаривал Лисёнка вернуться домой.", "1. Медвежонок ничего не знает, нужно продолжить поиски -> Искать Бельчонка в одиночку, 2. Может быть он прав и Лисёнок просто паникует -> Вернуться домой");
    Paragraph[] paragraph = new Paragraph[] {paragraph0, paragraph1, paragraph2, paragraph3, paragraph4, paragraph5, paragraph6, paragraph7, paragraph8, paragraph9, paragraph10, paragraph11, paragraph12};

    void menu() {
        System.out.println("Меню игры");
        System.out.println("1 - Старт");
        System.out.println("2 - Загрузка");
        System.out.println("3 - Сохранение");
        System.out.println("4 - Выход");
        System.out.println("Введите номер меню, целое число" + " (1, 2, 3 или 4)");
    };

    void start(){
        System.out.println("Игра началась");
        i = 0;
                while (true){
            System.out.println(paragraph[i].getText());
                   if (paragraph[i].getChanger() == null) break;
            System.out.println(paragraph[i].getChanger());
            System.out.println("Сделайте выбор, введите целое число" + " (1 или 2)");
            Scanner taskScanner = new Scanner(System.in);
            int change = taskScanner.nextInt();
            if (!(change == 1 || change == 2) ) {System.out.println("Ошибка ввода");
                        break;}
            if ((change == 1 && i == 0) || (change == 1 && i == 6) || (change == 2 && i == 12))  i = 1;
            else if (change == 2 && i == 0)  i = 2;
            else if (change == 1 && i == 2)  i = 3;
            else if ((change == 2 && i == 2) || (change == 2 && i == 5) ||  (change == 2 && i == 6) || (change == 1 && i == 7) || (change == 1 && i == 12))  i = 4;
            else if (change == 1 && i == 3)  i = 5;
            else if (change == 2 && i == 3)  i = 6;
            else if (change == 1 && i == 5)  i = 7;
            else if (change == 2 && i == 7)  i = 8;
            else if (change == 1 && i == 8)  i = 9;
            else if (change == 2 && i == 8)  i = 10;
            else if (change == 1 && i == 9)  i = 11;
            else if (change == 2 && i == 9)  i = 12;
                    System.out.println("1 - продолжить игру, 2 - выйти в меню");
                    System.out.println("Сделайте выбор, введите целое число" + " (1 или 2)");
                    Scanner taskScanner2 = new Scanner(System.in);
                    int change2 = taskScanner.nextInt();
                    if (!(change2 == 1 || change == 2) ) {System.out.println("Ошибка ввода");
                        break;}
                    if (change2 == 2) break;
                }
    };

    void load(){
        System.out.println("Игра загружена");
        while (true){
            System.out.println(paragraph[i].getText());
            if (paragraph[i].getChanger() == null) break;
            System.out.println(paragraph[i].getChanger());
            System.out.println("Сделайте выбор, введите целое число" + " (1 или 2)");
            Scanner taskScanner = new Scanner(System.in);
            int change = taskScanner.nextInt();
            if (!(change == 1 || change == 2) ) {System.out.println("Ошибка ввода");
                break;}
            if ((change == 1 && i == 0) || (change == 1 && i == 6) || (change == 2 && i == 12))  i = 1;
            else if (change == 2 && i == 0)  i = 2;
            else if (change == 1 && i == 2)  i = 3;
            else if ((change == 2 && i == 2) || (change == 2 && i == 5) ||  (change == 2 && i == 6) || (change == 1 && i == 7) || (change == 1 && i == 12))  i = 4;
            else if (change == 1 && i == 3)  i = 5;
            else if (change == 2 && i == 3)  i = 6;
            else if (change == 1 && i == 5)  i = 7;
            else if (change == 2 && i == 7)  i = 8;
            else if (change == 1 && i == 8)  i = 9;
            else if (change == 2 && i == 8)  i = 10;
            else if (change == 1 && i == 9)  i = 11;
            else if (change == 2 && i == 9)  i = 12;
            System.out.println("1 - продолжить игру, 2 - выйти в меню");
            System.out.println("Сделайте выбор, введите целое число" + " (1 или 2)");
            Scanner taskScanner2 = new Scanner(System.in);
            int change2 = taskScanner.nextInt();
            if (!(change2 == 1 || change == 2) ) {System.out.println("Ошибка ввода");
                break;}
            if (change2 == 2) break;
        }
    };

    void save(){System.out.println("Игра сохранена");};

    void exit(){System.out.println("Выход из игры");};

    public int getI() {return i;}
    public void setI(int i) {this.i = i;}
}

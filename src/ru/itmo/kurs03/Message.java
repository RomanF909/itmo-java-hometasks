package ru.itmo.kurs03;

import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;

public class Message implements Serializable {
    private String text;
    private LocalDateTime sent;

    public static String sendFiles (String path) {
        String rec = "Файл не загружен";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String name = scanner.nextLine();
        if (name.length() < 3 || name.length() > 10 || name == null) {
            System.out.println("Название не может быть null, менее 3 и более 10 знаков");
        } else {File file = new File(path + name + ".txt");
            System.out.println("Введите описание файла");
            String comm = scanner.nextLine();
            if (comm.length() < 3 || comm.length() > 50 || comm == null) {
                System.out.println("Описание файла не может быть null, менее 3 и более 50 знаков");
            } else if (file.length() > 500) {System.out.println("Разрешенный размер файла ограничен 500 байт");
            } else {try (FileReader readF = new FileReader(file)) {
                    char[] chars = new char[(int) file.length()];
                    readF.read(chars);
                    String content = new String(chars);
                    StringBuffer bufF = new StringBuffer();
                    bufF.append(name).append("//").append(comm).append("//").append(content).append("//");
                    rec = bufF.toString();
                } catch (IOException e) { System.out.println("Не удалось прочитать файл");
                }}}return rec;
    }
    public Message(String text) {this.text = text;}
    public void setSent(LocalDateTime sent) {this.sent = sent;}
    public String getText() {return text;}
    public LocalDateTime getSent() {return sent;}
}

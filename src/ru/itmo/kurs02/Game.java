package ru.itmo.kurs02;

import java.util.Scanner;
import java.io.*;

public class Game {

    public static void main(String[] args) throws IOException{
        GameApp gameNew = new GameApp();
        User userNew = new User(new StartCommand(gameNew), new LoadCommand(gameNew), new SaveCommand(gameNew), new ExitCommand(gameNew));
        File file = new File("D:\\PROJECT\\newsave\\saver.txt");

        gameNew.menu();
        while (true) {
            Scanner taskScanner = new Scanner(System.in);
            int count = taskScanner.nextInt();
            switch (count) {
                case (1):
                    userNew.startGame();
                    gameNew.menu();
                    break;
                case (2):
                    FileInputStream fileInputStream = new FileInputStream(file);
                    int save=fileInputStream.read();
                    fileInputStream.close();
                    gameNew.setI(save);
                    userNew.loadGame();
                    gameNew.menu();
                    break;
                case (3):
                    userNew.saveGame();
                    gameNew.menu();
                    save = gameNew.getI();
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(save);
                    fileOutputStream.close();
                    break;
                case (4):
                    userNew.exitGame();
                    break;
                default:
                    System.out.println("Введено ошибочное значение");
                    break;
            }
        }

    }
}

package ru.itmo.kurs03;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientApp {

    private InetSocketAddress remote;
    private String path = "C:\\folder\\";
    private ReadWrite connection;

    public ClientApp(InetSocketAddress remote) {
        this.remote = remote;
    }
    public void run() {
        try {GetServ read = new GetServ();
            LoadServ record = new LoadServ();
            Socket socket = new Socket(remote.getHostString(), remote.getPort());
            connection = new ReadWrite(socket);
            read.start();
            record.start();
        } catch (IOException e) {System.out.println("Сервер не отвечает");}
    }
    private class GetServ extends Thread {
        @Override
        public void run() {
            while (true){
                try {Message fromServ = connection.readMessage();
                    if (fromServ.getText().startsWith("Загрузка")){
                        String fs = fromServ.getText().substring(10);
                        String name = fs.split("/")[0];
                        String ffs = fs.substring(fs.indexOf("/"));
                        PrintWriter writer = new PrintWriter(path+name+".txt", "UTF-8");
                        writer.println(ffs);
                        writer.close();
                        System.out.println("Файл загружен");
                    } else {System.out.println(fromServ.getText());}
                } catch (IOException e) {
                    System.out.println("Сервер не отвечает");
                    System.out.println("Сообщение не принято");
                    System.out.println("Выход");
                    System.exit(0);
                }
            }
        }
    }
    private class LoadServ extends Thread {
        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите текст или /exit для выхода");
            System.out.println("/cat для просмотра файлов");
            System.out.println("/load для загрузки файла");
            while (true){Message message = null;
                String text = scanner.nextLine();
                if ("/load".equalsIgnoreCase(text)) {
                    try {message = new Message(Message.sendFiles(path));
                        connection.writeMessage(message);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } else if ("/exit".equalsIgnoreCase(text)) {
                    System.out.println("Выход");
                    System.exit(0);
                }
                try {message = new Message(text);
                    connection.writeMessage(message);
                } catch (IOException e) {
                    System.out.println("Сервер не отвечает");
                    System.out.println("Сообщение не отправлено");
                    System.out.println("Выход");
                    System.exit(0);
                }
            }
        }
    }

    public static void main(String[] args) {
        String ip = "127.0.0.1";
        int port = 2085;
        InetSocketAddress remote = new InetSocketAddress(ip, port);
        ClientApp clientApp = new ClientApp(remote);
        clientApp.run();
    }
}
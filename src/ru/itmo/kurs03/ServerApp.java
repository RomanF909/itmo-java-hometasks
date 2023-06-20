package ru.itmo.kurs03;

import java.io.IOException;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ServerApp {
    private int port;
    public static CopyOnWriteArrayList<String[]> records;
    private CopyOnWriteArraySet<ReadWrite> connections;

    public ServerApp(int port) {
        this.port = port;
        records = new CopyOnWriteArrayList<String[]>();
        connections = new CopyOnWriteArraySet<>();
    }
    public static String getCat(){
        StringBuffer buf = new StringBuffer();
        for ( String[] rec: records) {buf.append(rec[0]).append(" ; ");}
        return buf.toString();
    }
    public static String getComm(String name){
        String com = null;
        for ( String[] rec: records) {
            if (rec[0].equalsIgnoreCase(name)){com= rec[1];
            } else {com= "Отсутствует файл";}
        } return com;
    }

    public static String getRec(String name){
        String com = null;
        for ( String[] rec: records) {
            if (rec[0].equalsIgnoreCase(name)){com= rec[2];
            } else {com= "Отсутствует файл";
            }} return com;
    }
    public void startServer() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Запуск сервера");
            int count = 0;
            while (true) {Socket socket = null;
                count++;
                socket = serverSocket.accept();
                System.out.println("Клиент " + count + " подключился");
                ReadWrite connection = new ReadWrite(socket);
                connections.add(connection);
                ThreadConnect thread = new ThreadConnect (connection, connections, count);
                thread.start();}
        } catch (IOException e) {System.out.println("Ошибка сервера");
      }
    }
    public static void main(String[] args) throws IOException {
        ServerApp server = new ServerApp(2085);
        server.startServer();
    }
}

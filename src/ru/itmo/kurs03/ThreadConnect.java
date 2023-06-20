package ru.itmo.kurs03;

import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

public class ThreadConnect extends Thread {
    private int count;
    private final ReadWrite connection;
    private final CopyOnWriteArraySet<ReadWrite> connections;

    ThreadConnect(ReadWrite connection, CopyOnWriteArraySet<ReadWrite> connections, int count) {
        this.count = count;
        this.connection = connection;
        this.connections = connections;
    }
    public int getCount() {
        return count;
    }
    @Override
    public void run() {
        while (true) {Message message = null;
            try {message = connection.readMessage();
            } catch (IOException e) {System.out.println("Разрыв соединения");
                connections.remove(connection);
                return;
            }
            if (message.getText().contains("//")) {String[] area = message.getText().split("//");
                ServerApp.records.add(area);
                for (ReadWrite client : connections) {
                    try {client.writeMessage(new Message("Файл: "+ area[0] + " - " + area[1] + " добавлен"));
                    } catch (IOException e) {System.out.println("Ошибка передачи сообщения");
                        connections.remove(client);
                    }
                }
            }
            else if (message.getText().equalsIgnoreCase("/cat")) {
                try {connection.writeMessage(new Message(ServerApp.getCat()));
                    connection.writeMessage(new Message("Введите название файла для загрузки"));
                } catch (IOException e) {System.out.println("Ошибка передачи сообщения");
                    connections.remove(connection);
                }
            }

            else { for (String[] rec : ServerApp.records) {
                    if (message.getText().equalsIgnoreCase(rec[0])) {
                        try { if (ServerApp.getComm(rec[0]).equalsIgnoreCase("Файл отсутствует")){
                                connection.writeMessage(new Message("Файл отсутствует"));
                            } else {connection.writeMessage(new Message(ServerApp.getComm(rec[0])));
                                connection.writeMessage(new Message("Загрузка" + rec[0] + "/" + ServerApp.getRec(rec[0])));
                            }
                        }catch (IOException e) {System.out.println("Ошибка передачи сообщения");
                            connections.remove(connection);
                        }
                    }
                }
                if (message.equals(null)) {System.out.println("Разрыв соединения");
                    connections.remove(connection);
                    return;
                } else {for (ReadWrite client : connections) {
                        try { if (!(message.getText().equalsIgnoreCase("/add"))&& !(message.getText().equalsIgnoreCase("Загружен файл"))&& !(message.getText().equalsIgnoreCase("Файл не загружен"))&& !(message.getText().equalsIgnoreCase("/catalog"))){
                            client.writeMessage(new Message("Клиент " + getCount() + "  : " + message.getText()));}
                        } catch (IOException e) {System.out.println("Ошибка передачи сообщения");
                            connections.remove(client);
                        }
                    }
                }
            }
        }
    }
}

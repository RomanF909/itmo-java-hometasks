package ru.itmo.hometasks9.Task2;

import ru.itmo.hometasks9.Task1.Fruit;

import java.util.ArrayList;
import java.util.List;


public class Task02 {

    private ArrayList<Message> messages;


    public static void countEachPriority(List<Message> messageList) {
        // TODO:  Подсчитать количество сообщений для каждого приоритета
        //  Ответ в консоль

        int countLow = 0, countMedium = 0, countHigh = 0, countUrgent = 0;
        for (Message message : messageList) {
            if (message.getPriority() == Message.MessagePriority.LOW) {
                countLow =  countLow + 1;
            }
            if (message.getPriority() == Message.MessagePriority.MEDIUM) {
                countMedium = countMedium + 1;
            }
            if (message.getPriority() == Message.MessagePriority.HIGH) {
                countHigh = countHigh + 1;
            }
            else  countUrgent = countUrgent + 1;
        }
        System.out.println(countLow);
        System.out.println(countMedium);
        System.out.println(countHigh);
        System.out.println(countUrgent);
        return;
    }


    public static void countEachCode(List<Message> messageList) {
        // TODO: Подсчитать количество сообщений для каждого кода сообщения
        //  Ответ в консоль
        int messageCode = 5, count = 0;
        for (Message message : messageList) {
            if (message.getCode() == messageCode) {
                count =  count + 1;
            }
          }
        System.out.println(count);
    }

    public static void uniqueMessageCount(List<Message> messageList) {
        // TODO: Подсчитать количество уникальных сообщений
        //  Ответ в консоль


      // НЕ ЗНАЮ КАК СДЕЛАТЬ
    }

    public static List<Message> uniqueMessagesInOriginalOrder(List<Message> messageList) {
        // TODO: вернуть только неповторяющиеся сообщения и в том порядке,
        //  в котором они встретились в первоначальном списке
        //  Например, было: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}, {HIGH, 9}]
        //  на выходе: [{URGENT, 4}, {HIGH, 9}, {LOW, 3}]
        return null;
        // НЕ ЗНАЮ КАК СДЕЛАТЬ
    }

    public static void removeEach(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции каждое сообщение с заданным приоритетом
        //  вывод в консоль до удаления и после удаления
        for (Message message : messageList) {
            if (message.getPriority() == priority) {
                messageList.remove(message);
            }
        }
    }

    public static void removeOther(List<Message> messageList, Message.MessagePriority priority) {
        // TODO: удалить из коллекции все сообщения, кроме тех, которые имеют заданный приоритет
        //  вывод в консоль до удаления и после удаления
        for (Message message : messageList) {
            if (message.getPriority() == priority) {
            } else messageList.remove(message);
        }
    }

    public static void main(String[] args) {
        List<Message> messages = Message.generate(34);
        countEachPriority(messages);
        countEachCode(messages);
        uniqueMessageCount(messages);
        System.out.println(uniqueMessagesInOriginalOrder(messages));
        removeEach(messages, Message.MessagePriority.HIGH);
        removeOther(messages, Message.MessagePriority.LOW);
    }
}
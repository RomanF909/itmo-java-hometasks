package ru.itmo.kurs02;
//Invoker

public class User {

Command start;
Command load;
Command save;
Command exit;

    public User(Command start, Command load, Command save, Command exit) {
        this.start = start;
        this.load = load;
        this.save = save;
        this.exit = exit;
    }

    void startGame() {
        start.execute();
    };
    void loadGame() {
        load.execute();
    };
    void saveGame() {
        save.execute();
    };
    void exitGame() {
        exit.execute();
    };
}

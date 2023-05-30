package ru.itmo.kurs02;
//ConcreteCommand
public class StartCommand implements Command {
    GameApp game;

    public StartCommand(GameApp game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }
}

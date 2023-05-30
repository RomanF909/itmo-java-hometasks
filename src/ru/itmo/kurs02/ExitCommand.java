package ru.itmo.kurs02;
//ConcreteCommand

public class ExitCommand implements Command{
    GameApp game;

    public ExitCommand(GameApp game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.exit();
    }
}

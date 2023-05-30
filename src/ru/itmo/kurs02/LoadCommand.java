package ru.itmo.kurs02;
//ConcreteCommand
public class LoadCommand implements Command{
    GameApp game;

    public LoadCommand(GameApp game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.load();
    }
}

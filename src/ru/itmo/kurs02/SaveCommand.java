package ru.itmo.kurs02;
//ConcreteCommand
public class SaveCommand implements Command{
    GameApp game;

    public SaveCommand(GameApp game) {
        this.game = game;
    }

    @Override
    public void execute() {
game.save();
    }
}

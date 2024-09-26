package controller;

import contants.DuckType;
import factory.DuckFactory;
import model.Ducks;
import model.duck.Duck;
import view.OutputView;

public class MiniDuckSimulator {
    private final Ducks ducks;

    public MiniDuckSimulator() {
        ducks = new Ducks();
    }

    public void run() {
        createDucks();
        printDucks();
    }

    private void createDucks() {
        for (DuckType duckType : DuckType.values()) {
            Duck duck = DuckFactory.create(duckType.getDuckClass(), duckType.getFlyBehavior(), duckType.getQuackBehavior());
            ducks.addDuck(duck);
        }
    }

    private void printDucks() {
        for (final Duck duck : ducks.getDucks()) {
            OutputView.printDuckDisplay(duck);
            OutputView.printDuckQuack(duck);
            OutputView.printDuckFly(duck);
            OutputView.printDuckSwim(duck);
            OutputView.printNewLine();
        }
    }
}

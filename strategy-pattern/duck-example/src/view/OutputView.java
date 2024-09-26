package view;

import model.duck.Duck;

public class OutputView {
    public static void printDuckDisplay(final Duck duck) {
        System.out.println(duck.display());
    }

    public static void printDuckQuack(final Duck duck) {
        System.out.println(duck.quack());
    }

    public static void printDuckFly(final Duck duck) {
        System.out.println(duck.fly());
    }

    public static void printDuckSwim(final Duck duck) {
        System.out.println(duck.swim());
    }

    public static void printNewLine() {
        System.out.println();
    }
}

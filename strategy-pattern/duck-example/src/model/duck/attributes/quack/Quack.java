package model.duck.attributes.quack;

import static contants.ViewMessage.QUACK;

public class Quack implements QuackBehavior{
    @Override
    public String quack() {
        return QUACK;
    }
}

package model.duck.attributes.quack;

import static contants.ViewMessage.SQUEAK;

public class Squeak implements QuackBehavior{
    @Override
    public String quack() {
        return SQUEAK;
    }
}

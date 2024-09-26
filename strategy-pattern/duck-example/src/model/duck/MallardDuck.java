package model.duck;

import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.quack.QuackBehavior;

import static contants.ViewMessage.MALLARD_DUCK_DISPLAY;

public class MallardDuck extends Duck {
    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    @Override
    public String display() {
        return MALLARD_DUCK_DISPLAY;
    }
}

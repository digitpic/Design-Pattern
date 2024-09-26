package model.duck;

import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.quack.QuackBehavior;

import static contants.ViewMessage.RED_HEAD_DUCK_DISPLAY;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public static RedHeadDuck of(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        return new RedHeadDuck(flyBehavior, quackBehavior);
    }

    @Override
    public String display() {
        return RED_HEAD_DUCK_DISPLAY;
    }
}

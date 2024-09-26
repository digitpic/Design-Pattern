package model.duck;

import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.quack.QuackBehavior;

import static contants.ViewMessage.RUBBER_DUCK_DISPLAY;

public class RubberDuck extends Duck {
    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public static RubberDuck of(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        return new RubberDuck(flyBehavior, quackBehavior);
    }

    @Override
    public String display() {
        return RUBBER_DUCK_DISPLAY;
    }
}

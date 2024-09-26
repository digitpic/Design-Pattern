package model.duck;

import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.fly.FlyNoway;
import model.duck.attributes.quack.Quack;
import model.duck.attributes.quack.QuackBehavior;

import static contants.ViewMessage.SICK_DUCK_DISPLAY;

public class SickDuck extends Duck {
    public SickDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public static SickDuck of(FlyNoway flyNoway, Quack quack) {
        return new SickDuck(flyNoway, quack);
    }

    @Override
    public String display() {
        return SICK_DUCK_DISPLAY;
    }
}

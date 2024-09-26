package model.duck;

import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.fly.FlyNoway;
import model.duck.attributes.quack.MuteQuack;
import model.duck.attributes.quack.QuackBehavior;

import static contants.ViewMessage.DECOY_DUCK_DISPLAY;

public class DecoyDuck extends Duck {
    public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        super(flyBehavior, quackBehavior);
    }

    public static Duck of(FlyNoway flyNoway, MuteQuack muteQuack) {
        return new DecoyDuck(flyNoway, muteQuack);
    }

    @Override
    public String display() {
        return DECOY_DUCK_DISPLAY;
    }
}

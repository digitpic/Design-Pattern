package model.duck;

import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.quack.QuackBehavior;

import static contants.ViewMessage.DUCK_SWIM;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public abstract String display();

    public String fly() {
        return flyBehavior.fly();
    }

    public String quack() {
        return quackBehavior.quack();
    }

    public String swim() {
        return DUCK_SWIM;
    }
}

package contants;

import model.duck.DecoyDuck;
import model.duck.Duck;
import model.duck.MallardDuck;
import model.duck.RedHeadDuck;
import model.duck.RubberDuck;
import model.duck.SickDuck;
import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.fly.FlyNoway;
import model.duck.attributes.fly.FlyWithWings;
import model.duck.attributes.quack.MuteQuack;
import model.duck.attributes.quack.Quack;
import model.duck.attributes.quack.QuackBehavior;
import model.duck.attributes.quack.Squeak;

public enum DuckType {
    MALLARD_DUCK(MallardDuck.class, new FlyWithWings(), new Quack()),
    RED_HEAD_DUCK(RedHeadDuck .class, new FlyWithWings(), new Quack()),
    RUBBER_DUCK(RubberDuck.class, new FlyNoway(), new Squeak()),
    DECOY_DUCK(DecoyDuck.class, new FlyNoway(), new MuteQuack()),
    SICK_DUCK(SickDuck.class, new FlyNoway(), new Quack());

    private final Class<? extends Duck> duckClass;
    private final FlyBehavior flyBehavior;
    private final QuackBehavior quackBehavior;

    DuckType(Class<? extends Duck> duckClass, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.duckClass = duckClass;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public Class<? extends Duck> getDuckClass() {
        return duckClass;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }
}

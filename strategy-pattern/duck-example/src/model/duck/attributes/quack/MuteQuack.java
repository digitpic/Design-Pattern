package model.duck.attributes.quack;

import static contants.ViewMessage.MUTE;

public class MuteQuack implements QuackBehavior{
    @Override
    public String quack() {
        return MUTE;
    }
}

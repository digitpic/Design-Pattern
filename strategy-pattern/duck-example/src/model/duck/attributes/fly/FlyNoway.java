package model.duck.attributes.fly;

import static contants.ViewMessage.CAN_NOT_FLY;

public class FlyNoway implements FlyBehavior{
    @Override
    public String fly() {
        return CAN_NOT_FLY;
    }
}

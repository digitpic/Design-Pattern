package model.duck.attributes.fly;

import static contants.ViewMessage.CAN_FLY;

public class FlyWithWings implements FlyBehavior{
    @Override
    public String fly() {
        return CAN_FLY;
    }
}

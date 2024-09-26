package factory;

import model.duck.Duck;
import model.duck.attributes.fly.FlyBehavior;
import model.duck.attributes.quack.QuackBehavior;

public class DuckFactory {
    public static <T extends Duck> T create(Class<T> duckClass, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        try {
            return duckClass.getDeclaredConstructor(FlyBehavior.class, QuackBehavior.class)
                    .newInstance(flyBehavior, quackBehavior);
        } catch (Exception e) {
            throw new RuntimeException("Duck 인스턴스 생성 실패", e);
        }
    }
}

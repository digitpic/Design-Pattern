package model;

import model.duck.Duck;

import java.util.ArrayList;
import java.util.List;

public class Ducks {
    private final List<Duck> ducks;

    public Ducks() {
        ducks = new ArrayList<>();
    }

    public void addDuck(final Duck duck) {
        ducks.add(duck);
    }

    public List<Duck> getDucks() {
        return ducks;
    }
}

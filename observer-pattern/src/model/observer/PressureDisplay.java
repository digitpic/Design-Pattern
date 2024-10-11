package model.observer;

import model.subject.Subject;

public class PressureDisplay implements Observer, DisplayElement {
    private float pressure;

    public PressureDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("[Pressure Display] received " + pressure + " hPa");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }
}

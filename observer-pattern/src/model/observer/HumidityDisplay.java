package model.observer;

import model.subject.Subject;

public class HumidityDisplay implements Observer, DisplayElement {
    private float humidity;

    public HumidityDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("[Humidity Display] received " + humidity + "% humidity");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.humidity = humidity;
        display();
    }
}

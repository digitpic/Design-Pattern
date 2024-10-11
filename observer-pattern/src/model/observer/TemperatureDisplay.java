package model.observer;

import model.subject.Subject;

public class TemperatureDisplay implements Observer, DisplayElement {
    private float temperature;

    public TemperatureDisplay(Subject weatherData) {
        weatherData.registerObserver(this); // subscribe
    }

    @Override
    public void display() {
        System.out.println("[Temperature Display] received " + temperature + "F degrees");
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        display();
    }
}

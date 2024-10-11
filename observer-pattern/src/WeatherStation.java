import model.observer.HumidityDisplay;
import model.observer.PressureDisplay;
import model.observer.TemperatureDisplay;
import model.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        // make subject(=observable)
        WeatherData weatherData = new WeatherData();

        // make observers & subscribe subject(=observable)
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay(weatherData);
        HumidityDisplay humidityDisplay = new HumidityDisplay(weatherData);
        PressureDisplay pressureDisplay = new PressureDisplay(weatherData);

        // initial value
        weatherData.setMeasurements(100, 100, 100f);

        // `temperature observer` unsubscribe subject(=observable)
        weatherData.removeObserver(temperatureDisplay);

        printNewLine();

        // change value
        weatherData.setMeasurements(200, 200, 200f);
    }

    private static void printNewLine() {
        System.out.println();
    }
}

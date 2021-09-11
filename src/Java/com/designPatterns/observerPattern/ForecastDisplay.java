package Java.com.designPatterns.observerPattern;


import Java.com.designPatterns.observerPattern.Display;
import Java.com.designPatterns.observerPattern.Observer;

public class ForecastDisplay implements Observer, Display {
private WeatherData weatherData;
    private float humidity;
    private float pressure;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.add(this);
    }

    @Override
    public void update() {
        setHumidity(weatherData.getHumidity());
        setPressure(weatherData.getPressure());
        display();
    }

    @Override
    public void display() {
        System.out.println("Relative humidity " + getHumidity() + getPressure());
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}

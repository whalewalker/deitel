package Java.com.designPatterns.observerPattern;


public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.add(this);
    }

    @Override
    public void update() {
        setHumidity(weatherData.getHumidity());
        setTemperature(weatherData.getTemperature());
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "
                + getTemperature() + " F degree and "
                + getHumidity() + "% humidity");
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}

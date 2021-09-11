package Java.com.designPatterns.observerPattern;


public class StatisticsDisplay implements Observer, Display {
    private WeatherData weatherData;
    private float temperature;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.add(this);
    }

    @Override
    public void update() {
        setTemperature(weatherData.getTemperature());
        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Min/Max " + temperature);
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }


}

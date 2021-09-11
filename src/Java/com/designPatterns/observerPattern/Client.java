package Java.com.designPatterns.observerPattern;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurementsChanged(80, 65, 30.4f);
        weatherData.setMeasurementsChanged(82, 70, 29.2f);
        weatherData.setMeasurementsChanged(78, 90, 29.2f);
    }
}

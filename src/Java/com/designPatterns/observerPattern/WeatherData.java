package Java.com.designPatterns.observerPattern;


import Java.com.designPatterns.observerPattern.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    List<Observer> observers = new ArrayList<>();

    public void measurementsChanged(){
        notity();
    }

    public void setMeasurementsChanged(float temperature, float humidity, float pressure){
        setTemperature(temperature);
        setHumidity(humidity);
        setPressure(pressure);
        measurementsChanged();
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

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notity() {
        for (Observer observer: observers) {
            observer.update();
        }
    }


}

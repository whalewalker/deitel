package Java.com.designPatterns.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements Observable{
    private final List<Observer> observers = new ArrayList<>();
    private int temperature;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notification() {
        observers.forEach(Observer::update);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}

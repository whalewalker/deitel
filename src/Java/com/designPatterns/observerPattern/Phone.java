package Java.com.designPatterns.observerPattern;

public class Phone implements Observer, Displayble{
    private WheatherStation station;

    public Phone(WheatherStation station) {
        this.station = station;
    }

    @Override
    public int update() {
        return station.getTemperature();
    }

    @Override
    public void display() {

    }
}

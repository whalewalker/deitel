package Java.com.designPatterns.observerPattern;

public class LCD implements Observer, Displayble{
    Observable observable;

    public LCD(Observable observable) {
        this.observable = observable;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public void display() {

    }
}

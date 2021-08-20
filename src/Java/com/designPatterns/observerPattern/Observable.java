package Java.com.designPatterns.observerPattern;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notification();
}

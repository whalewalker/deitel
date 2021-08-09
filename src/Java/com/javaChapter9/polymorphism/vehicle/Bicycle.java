package Java.com.javaChapter9.polymorphism.vehicle;

public class Bicycle extends Vehicle{
    private final int number;
    public Bicycle(int number) {
        super(number);
        this.number = number;
    }

    @Override
    public int wheels() {
        return 2 + number;
    }
}

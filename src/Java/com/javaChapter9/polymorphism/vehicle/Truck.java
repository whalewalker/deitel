package Java.com.javaChapter9.polymorphism.vehicle;

public class Truck extends Vehicle{
    private int number;
    public Truck(int number) {
        super(number);
        this.number = number;
    }


    @Override
    public int wheels() {
        return 18 + number;
    }
}

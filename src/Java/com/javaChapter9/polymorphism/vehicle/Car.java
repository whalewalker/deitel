package Java.com.javaChapter9.polymorphism.vehicle;

public class Car extends Vehicle{
    private int number;
    public Car(int number) {
        super(number);
        this.number = number;
    }


    @Override
    public int wheels() {
        return 4 + number;
    }
}

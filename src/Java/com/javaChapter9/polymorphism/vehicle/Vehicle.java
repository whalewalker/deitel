package Java.com.javaChapter9.polymorphism.vehicle;

public abstract class Vehicle {

    public Vehicle(int number) {
        this.number = number;
    }

    private int number = 4;
    public abstract int wheels();

    public void updateWheel(int wheels){
        number = wheels + number;
    }
    public int getNumber() {
        return number;
    }
}

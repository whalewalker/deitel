package Java.com.javaChapter9.polymorphism.vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleClient {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Bicycle(2));
        vehicles.add(new Car(3));
        vehicles.add(new Truck(2));

        vehicles.forEach(vehicle -> {
            vehicle.updateWheel(2);
            if (vehicle instanceof Car || vehicle instanceof Bicycle || vehicle instanceof Truck){
                System.out.println("This is a 'Is-a relationship'");
            }
            System.out.printf("A %s has %d wheels%n", vehicle.getClass().getName().substring(43), vehicle.wheels());
        });


//        Vehicle vehicle = new Bicycle();
//
//        System.out.println(vehicle.wheels());

    }
}

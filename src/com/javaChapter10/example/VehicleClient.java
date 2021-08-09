package com.javaChapter10.example;

import java.util.function.Function;
import java.util.function.Supplier;

public class VehicleClient {
    public static void main(String[] args) {
        Vehicle vehicle = new Bicycle();

        System.out.println(vehicle.accelerate());
        System.out.println(vehicle.wheel());
        System.out.println(vehicle.color("grey"));

        Animal animal = new Bird();
        System.out.printf("%s can %s", animal.name("parrot"), animal.move());


        Function<Long, Long> adder = (value)-> value + 5;

        Long lambdaResult = adder.apply(8L);
        System.out.println("Lambda result --> " + lambdaResult);

        Supplier<Integer> supplier = () -> (int) (Math.random() * 1000D);
        System.out.println( supplier.get().intValue());
    }
}

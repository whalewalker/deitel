package com.javaChapter10.example;

public interface Vehicle {
    int wheel();
    String color(String colorType);

    default int accelerate (){
        return 1;
    }
}
package com.javaChapter10.example;

public class Car implements Vehicle{
    @Override
    public int wheel() {
        return 4;
    }

    @Override
    public String color(String colorType) {
        return colorType;
    }
}

package com.javaChapter10.example;

public class Bicycle implements Vehicle{
    @Override
    public int wheel() {
        return 2;
    }

    @Override
    public String color(String colorType) {
        return colorType;
    }

}

package Java.com.javaChapter6;

public class CircleArea {
    public static double calculateArea(int radius) {
        return Math.floor((Math.PI * Math.pow(radius, 2)) * 100 + 0.5) / 100;
    }
}

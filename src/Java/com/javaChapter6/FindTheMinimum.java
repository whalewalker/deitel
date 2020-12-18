package Java.com.javaChapter6;

public class FindTheMinimum {
    public static float getMinimum(float value1, float value2, float value3) {
        return  Math.min(Math.min(value1, value2), value3);
    }
}

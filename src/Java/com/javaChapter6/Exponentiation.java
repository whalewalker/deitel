package Java.com.javaChapter6;

public class Exponentiation {
    public static int generateExponential(int base, int exponent) {
        int indices = 1;
        for(int count = exponent; count >= 1; count--){
            indices  *= base;
        }
        return indices;
    }
}

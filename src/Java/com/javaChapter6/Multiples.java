package Java.com.javaChapter6;

public class Multiples {

    public static boolean isItMultiple(int value, int multiple) {
        boolean isMultiple = false;
        if(value % multiple == 0){
            isMultiple = true;
        }
        return isMultiple;
    }
}

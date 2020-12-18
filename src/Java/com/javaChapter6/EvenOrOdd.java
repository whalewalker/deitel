package Java.com.javaChapter6;

public class EvenOrOdd {
    public static boolean checkForEvenOrOdd(int integer) {
       boolean isEvenOrOdd = false;
        if(integer % 2 == 0){
            isEvenOrOdd = true;
        }
        return isEvenOrOdd;
    }
}

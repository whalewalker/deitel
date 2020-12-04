package Java.com.javaChapter5;

public class PrintInteger {
    public static void main(String[] args) {
        int counter = 0;
        while (counter < 20) {
            if (counter % 5 == 0) {
                System.out.println();
            } else {
                System.out.println("\t");
                System.out.print(counter);
            }

            counter++;
        }
    }
}

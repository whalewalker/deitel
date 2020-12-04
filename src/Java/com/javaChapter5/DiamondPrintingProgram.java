package Java.com.javaChapter5;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for(int counter = 0; counter < 8; counter++){
            for (int innerCounter = 0; innerCounter < counter; innerCounter++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}

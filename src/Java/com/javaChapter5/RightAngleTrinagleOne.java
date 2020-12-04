package Java.com.javaChapter5;

public class RightAngleTrinagleOne {

    public void  printAsteriskOne(int input) {
        int counter;
        int innerCounter;
        String asterisk = "*";
        for(counter = 1; counter <= input; counter++){
            for (innerCounter = 1; innerCounter <= counter; innerCounter++){
                System.out.print(asterisk);
            }
            System.out.println();
        }
    }

    public void printAsteriskTwo(int value){
        int counter;
        int innerCounter;
        String asterisk = "*";
        for(counter = value; counter >= 1; counter--){
            for (innerCounter = 1; innerCounter <= counter; innerCounter++){
                System.out.print(asterisk);
            }
            System.out.println();
        }

    }

            public void printAsteriskThree(int value) {
                int counter;
                int innerCounter;
                int space;
                String asterisk = "*";
                for (counter = 1; counter <= value; counter++) {
                    for (space = value - 1; space >= counter; space--) {
                        System.out.print(" ");
                    }
                    for (innerCounter = 1; innerCounter <= counter; innerCounter++) {
                        System.out.print(asterisk);
                    }
                    System.out.println();
                }
            }


    public void printAsteriskFour(int value)  {

        int counter;
        int innerCounter;
        int space;
        String asterisk = "*";
        for(counter = value; counter >= 1 ; counter--){
            for (space = value - 1; space >= counter; space--){
                System.out.print(" ");
            }
            for (innerCounter = 1; innerCounter <= counter; innerCounter++){
                System.out.print(asterisk);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        RightAngleTrinagleOne myAngle = new RightAngleTrinagleOne();
        myAngle.printAsteriskOne(10);
        myAngle.printAsteriskTwo(10);
        myAngle.printAsteriskThree(10);
        myAngle.printAsteriskFour(10);
    }

}

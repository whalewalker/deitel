package Java.com.crap;

import Java.com.javaChapter7.dice_rolling.DiceRolling;

import java.security.SecureRandom;

public class Crap {

    private static int winCount;
    private static int lostCount;
    private static int continueCount;


    private int firstDice;
    private int secondDice;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


    public static int getWinCount() {
        return winCount;
    }

    public static int getLostCount() {
        return lostCount;
    }

    public static int getContinueCount() {
        return continueCount;
    }

    public int getFirstDice() {
        return firstDice;
    }

    public int getSecondDice() {
        return secondDice;
    }


    public int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        return 1 + random.nextInt(6);
    }

    public boolean checkRandomNumber(int random) {
        if(random > 0 && random < 7){
            return true;
        }
        return false;
    }


    public int getSum() {
        firstDice = generateRandomNumber();
        secondDice = generateRandomNumber();

        int sum = firstDice + secondDice;

        System.out.printf("Player rolled %d + %d = %d%n",
                firstDice, secondDice, sum);
       return sum;
    }

    public boolean checkSum(int sum) {
        if(sum > 1 && sum < 13){
            return true;
        }
        return false;
    }

    public void checkGameStatus() {
        Status gameStatue;
        int sumOfDice = getSum();
        int myPoint = 0;

        switch (sumOfDice) {
            case SEVEN, YO_LEVEN -> {
                gameStatue = Status.WIN;
            }
            case SNAKE_EYES, TREY, BOX_CARS -> {
                gameStatue = Status.LOSE;
            }
            default -> {
                gameStatue = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
            }
        }
        continueGame(gameStatue, myPoint);
        checkIfWonOrLose(gameStatue);
    }

    public boolean checkIfWonOrLose(Status gameStatus){
        if(gameStatus == Status.WIN){
            System.out.println("Player wins");
            winCount++;
            return true;
        }else {
            System.out.println("Player loses");
            lostCount++;
            return false;
        }
    }

    public void continueGame(Status gameStatus, int currentPoint){
        while (gameStatus == Status.CONTINUE){

            int sum = getSum();
            if(sum == currentPoint){
                gameStatus = Status.WIN;
            }
            if(sum == SEVEN)
                gameStatus = Status.LOSE;
        }
    }


    public static void main(String[] args) {
        Crap myCrap = new Crap();
        myCrap.checkGameStatus();
//        System.out.println(myCrap.getFirstDice());
        System.out.println(getLostCount() + " Lost");
        System.out.println(getWinCount() + " Win");
    }

}

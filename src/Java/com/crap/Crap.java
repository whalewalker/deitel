package Java.com.crap;

import Java.com.javaChapter7.dice_rolling.DiceRolling;

import java.security.SecureRandom;

public class Crap {

    private int firstDice;
    private int secondDice;

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;


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

        return firstDice + secondDice;
    }

    public boolean checkSum(int sum) {
        if(sum > 1 && sum < 13){
            return true;
        }
        return false;
    }

    public Status checkGameStatus() {
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
                return continueGame(gameStatue, myPoint);
            }
        }

        return checkIfWonOrLose(gameStatue);
    }

    public Status checkIfWonOrLose(Status gameStatus){
        if(gameStatus == Status.WIN){
            return gameStatus;
        }else
            return gameStatus;
    }

    public Status continueGame(Status gameStatus, int currentPoint) {
        while (gameStatus == Status.CONTINUE) {

            int sum = getSum();
            if (sum == currentPoint) {
                return Status.WIN;
            }
            if (sum == SEVEN)
                return Status.LOSE;
        }
        return null;
    }

    public static void main(String[] args) {
        Crap myCrap = new Crap();
        int win = 0;
        int lose = 0;
        for(int count = 0; count < 10000; count++){
            if(myCrap.checkGameStatus() == Status.WIN){
             win++;
            }else {
                lose++;
            }
        }
        System.out.println("The time you won in 10000 rows of dice " + win);
        System.out.println("The time you lose in 10000 rows of dice " + lose);

    }

}

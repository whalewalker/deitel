package Java.com.javaChapter7.dice_rolling;


import java.security.SecureRandom;

public class DiceRolling {
   private int firstDice;
   private int secondDice;

    public DiceRolling() {
        this.firstDice = generateRandomValue();
        this.secondDice = generateRandomValue();
    }

    public int generateRandomValue() {
        SecureRandom randomValue = new SecureRandom();
        return 1 + randomValue.nextInt(6);
    }

    public boolean RandomNumberIsBetweenOneToSix(int randomValue) {
        if(randomValue > 0 && randomValue < 7){
            return true;
        }
        return false;
    }

    public int getFirstDice() {
        return firstDice;
    }

    public int getSecondDice() {
        return secondDice;
    }

    public int getColumnNumber(int firstDice) {
        if(firstDice == 1){
            return 0;
        } else
            return ((firstDice - 1) * 6);
    }

    public boolean RandomNumberIsBetweenZeroToSixtyFive(int column) {
        if(column > -1 && column < 36){
            return true;
        }
        return false;
    }

    public boolean RandomNumberIsBetweenZeroToSixtyFive(int[] column) {
        if(column.length == 36){
            return true;
        }
        return false;
    }

    public int[] CombinationOfRollingDice() {
        int[] diceArr = new int[36];
        for(int count = 0; count < 360000; count++){
            firstDice = generateRandomValue();
            secondDice = generateRandomValue();

            int position = getColumnNumber(firstDice) + (secondDice - 1);
            ++diceArr[position];
        }
        return diceArr;
    }

}


package Java.com.javaChapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class Craps {
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;
    private static CrapsStatus Status;
    private static int myPoint = 0;

    public void setBankBalance(int bankBalance) {
        if(bankBalance <= 1000){
            this.bankBalance = bankBalance;
        }else {
            userOption(bankBalance);
        }
    }

    private int bankBalance = 1000;
    Scanner scanner = new Scanner(System.in);

    public int getBankBalance() {
        return bankBalance;
    }


    int rollDice;
    public int setRollDice() {
        SecureRandom randomNumber = new SecureRandom();
        int dice1 = 1 + randomNumber.nextInt(6);
        int dice2 = 1 + randomNumber.nextInt(6);
        rollDice = dice1 + dice2;
        System.out.printf("Player rolled %d + %d = %d%n",
                dice1, dice2, this.rollDice);
        return rollDice;
    }

    public CrapsStatus checkStatus(int rollDice){
        switch (rollDice){
            case SEVEN:
            case YO_LEVEN:
                Status = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                Status  = Status.LOST;
                break;
            default:
                myPoint = rollDice;
                System.out.printf("Point is %d%n", myPoint);
                Status  = Status.CONTINUE;
        }
        return Status;
    }

    public CrapsStatus continuePlay(CrapsStatus gameStatus) {
        int sumDice = 0;
        while (gameStatus == Status.CONTINUE) {
            sumDice = setRollDice();
            if(sumDice == myPoint){
                gameStatus = Status.WON;
            }else{
                if(sumDice == SEVEN){
                    gameStatus = Status.LOST;
                }
            }
        }
        return gameStatus;
    }

    public void statusComment(CrapsStatus gameStatus, int amount){
        if ( gameStatus == Status.WON ){
            System.out.println("Player wins");
            addWager(amount);
        }
        else{
            System.out.println("Player loses");
            subsWager(amount);
        }
    }

    public void addWager(int amount){
       this.bankBalance += amount;
        System.out.printf("Wow, you're making progress your account balance is %d%n%n", this.bankBalance);
    }
    public void subsWager(int amount){
        this.bankBalance -= amount;
        System.out.printf("Aw c'mon, take a chance! your account balance is %d%n%n", this.bankBalance);
    }

    public int userInput(){
        System.out.print("Enter wager(amount to bet) : ");
        return scanner.nextInt();
    }

    public void playGame(){
        int option = 0;
        while (option != 2 || option != 1){
            int betAmount = userInput();
            if(betAmount <= bankBalance){
                statusComment(continuePlay(checkStatus(setRollDice())), betAmount);
            }else if(betAmount  > bankBalance){
                System.out.printf("Insufficient fund, your bank account is %d%n", getBankBalance());
                userInput();
            }else if(getBankBalance() == 0){
                System.out.println("Sorry. You're busted!\nWould you like to borrow some cash from your bank?\n1. Borrow money from bank.\n2. End game.\nEnter option : ");
                option = scanner.nextInt();
                userOption(option);
            }

        }

    }

    public void userOption(int value){
        if(value == 1 ){
            System.out.print("Enter amount to borrow (You can only borrow 1000 max) : ");
            int amount = scanner.nextInt();
            setBankBalance(amount);
            System.out.println("Account has been updated!\nYou have %d in your account now, play wisely this time.");
            playGame();
        }else {
            System.out.println("Thanks for playing.........");
        }
    }

    public static void main(String[] args) {
        Craps myDice = new Craps();
        System.out.println("Hi wimp!\nWe are happy to have you around, we hope you know what we do. Enjoy your game.");
        myDice.playGame();
    }
}
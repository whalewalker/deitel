package Java.com.javaChapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public static CoinEnum status;
    public int randomNumber() {
        int max = 2;
        int min = 1;
        return  (int) (Math.random() * max - min + 1) + min;
    }

    public CoinEnum flip(){
        int flip = randomNumber();
        if(flip == 1){
            status = status.HEADS;
        }else {
            status = status.TAILS;
        }
        return status;
    }

    public void countNumber(int value){
        int heads = 0;
        int tails= 0;
        for(int count = 0; count < value; count++){
            flip();
            if(flip() == status.HEADS){
                heads += 1;
            }else {
               tails += 1;
            }
        }
        System.out.printf("Coin Tossing display score : \nHEADS = %d\nTAILS = %d%n", heads, tails);
    }

    public static void main(String[] args) {
        CoinTossing coin = new CoinTossing();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi dear, this is a coin tossing game. \nWould like you have some fun with it. Good luck");

        System.out.print("Here are the options\n1. Toss Coin\n2. Exit Game.\n================\n");
        System.out.print("Enter option : ");
        int loop = scan.nextInt();
        System.out.println("\n=====================\n");
        if(loop == 1){
            while (loop != 2) {
                    System.out.print("Enter number of time you want to toss the coin : ");
                    int counter = scan.nextInt();
                    System.out.println("=====================\n");
                    coin.countNumber(counter);
                    System.out.print("Here are the options\n1. Toss Coin\n2. Exit Game.\n================\n");
                    System.out.print("Enter option : ");
                    loop = scan.nextInt();
                }
        }else {
            System.out.println("Thanks.\nExiting................");

        }

    }

}

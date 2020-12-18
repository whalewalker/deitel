package Java.com.javaChapter5;

import java.util.Scanner;

public class TheTwelveDaysOfChristmas {
    private int ChristMasNumber;

    public int getChristMasNumber() {
        return ChristMasNumber;
    }

    public void setChristMasNumber(int christMasNumber) {
        ChristMasNumber = christMasNumber;
    }
    public static void main(String[] args) {
        TheTwelveDaysOfChristmas christmas = new TheTwelveDaysOfChristmas();
        christmas.printChristMaxSong();
    }

    public void displaySong(int value){
        String days;
        int number;
        switch (value){
            case 12:
                days = "twelfth";
                number = 12;
                checkInputValue(value, number, days);
                System.out.println("12 Drummers Drumming");
            case 11:
              days = "eleventh";
                number = 11;
                checkInputValue(value, number, days);
                System.out.println("Eleven Pipers Piping");
            case 10:
                days = "tenth";
                number = 10;
                checkInputValue(value, number, days);
                System.out.println("Ten Lords a Leaping");
            case 9:
                days = "ninth";
                number = 9;
                checkInputValue(value, number, days);
                System.out.println( "Nine Ladies Dancing");
            case 8:
                days = "eighth";
                number = 8;
                checkInputValue(value, number, days);
                System.out.println("Eight Maids a Milking");
            case 7:
                days = "seventh";
                number = 7;
                checkInputValue(value, number, days);
                System.out.println( "Seven Swans a Swimming");
            case 6:
                days = "sixth";
                number = 6;
                checkInputValue(value, number, days);
                System.out.println("Six Geese a Laying");
            case 5:
                days = "fifth";
                number = 5;
                checkInputValue(value, number, days);
                System.out.println("Five Golden Rings");
            case 4:
                days = "fourth";
                number = 4;
                checkInputValue(value, number, days);
                System.out.println("Four Calling Birds");
            case 3:
                days = "third";
                number = 3;
                checkInputValue(value, number, days);
                System.out.println("Three French Hens");
            case 2:
                days = "second";
                number = 2;
                checkInputValue(value, number, days);
                System.out.println("Two Turtle Doves");
            case 1:
                days = "first";
                number = 1;
                checkInputValue(value, number, days);
                System.out.println("A Partridge in a Pear Tree\n");
        }
    }

    public void checkInputValue(int value, int userInput, String input){
        if(value == userInput){
            printDays(input);
            System.out.println("my true love sent to me:");
        }
    }

    public void printDays(String input){
        System.out.println("On the " + input +  " day of Christmas");
    }

    public void printAll(int value){
        int counter = value;
        while (counter <= 12){
            displaySong(counter);
            counter++;
        }
    }

    public void printChristMaxSong(){
        while (true){
            Scanner scan = new Scanner(System.in);
            System.out.print("Do you want to print all christMas song \n1. Enter 1 to print all\n2. Enter 2 to print one stanza\n3. Enter -1 to exit\n Enter values : ");
            int input = scan.nextInt();
            if(input == 1){
                System.out.print("Enter number of days you want to print : ");
                int stanza = scan.nextInt();
                setChristMasNumber(stanza);
                System.out.println("==========================\n");
                displaySong(getChristMasNumber());

            }else if(input == 2){
                System.out.print("Enter number of days you want to print from : ");
                int stanza = scan.nextInt();
                setChristMasNumber(stanza);
                System.out.println("==========================\n");
                printAll(getChristMasNumber());

            }else if(input == -1){
                System.out.println("Happy christmas............\nExiting......");
                System.out.println("==========================\n");

            }else {
                System.out.println("Invalid user input, pls read instruction!");
                System.out.println("==========================\n");
            }


        }
    }
}

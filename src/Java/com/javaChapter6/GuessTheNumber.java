package Java.com.javaChapter6;

import java.util.Scanner;

public class GuessTheNumber {
    Scanner userInput = new Scanner(System.in);
    private int userGuessValue;

    public int getRandomValue() {
        return randomValue;
    }

    private int randomValue;


    public int getUserGuessValue() {
        return userGuessValue;
    }
    public void validateGuessNumber() {
        System.out.print("Enter guess number between 1 to 50 : ");
        userGuessValue = userInput.nextInt();
    }


    public void setUserInput(){
        System.out.print("Enter guess number between 1 to 10 : ");
        userGuessValue = userInput.nextInt();
        if(userGuessValue > 10){
            System.out.println("Enter guess number between 1 to 50!\n");
            validateGuessNumber();
        }
    }

    public void randomNumber() {
        int max = 10;
        int min = 1;
        randomValue =  (int) (Math.random() * max - min + 1) + min;
    }




    public void updateComment(String outcome){
        String outputComment = "";
        switch (outcome) {
            case "correct" -> outputComment = "Congratulations. You\n" + "guessed the number!";
            case "Too high" -> outputComment = "Too\n" + "high. Try again";
            case "Too low" -> outputComment = "Too \n" + "low. Try again";
        }
        System.out.println(outputComment);
        if(!outputComment.equals("Congratulations. You\n" + "guessed the number!")){
            runGuessGame();
        }
    }



    public String userGuessOutcome(int value) {
        String guessOutputComment;
        if (randomValue == value) {
            guessOutputComment = "correct";
        } else if (randomValue > value) {
                guessOutputComment = "Too low";
            } else {
                guessOutputComment = "Too high";
            }
        return guessOutputComment;
    }

    public void runGuessGame(){
        randomNumber();
        setUserInput();
        String outcome =  userGuessOutcome(getUserGuessValue());
        updateComment(outcome);
    }

}










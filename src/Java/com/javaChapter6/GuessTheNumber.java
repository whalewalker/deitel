package Java.com.javaChapter6;

import java.util.Scanner;

public class GuessTheNumber {
    Scanner userInput = new Scanner(System.in);
    private int userGuessValue;
    private int counter;

    private int rightGuess;

    public int getCounter() {
        return counter;
    }

    public int getUserGuessValue() {
        return userGuessValue;
    }
    public void validateGuessNumber() {
        setUserInput();
    }

    public void setUserInput(){
        System.out.print("Enter guess number between 1 to 10 : ");
        userGuessValue = userInput.nextInt();
        if(userGuessValue > 10){
            System.out.println("Enter guess number between 1 to 10!\n");
            validateGuessNumber();
        }
    }

    public int randomNumber() {
        int max = 10;
        int min = 1;
        return (int) (Math.random() * max - min + 1) + min;
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
            updateScore();
            runGuessGame();
        }else {
            updateScore();
            playAgainOrExit(userOption());
        }
    }



    public String userGuessOutcome(int value) {
        String guessOutputComment;
        if (randomNumber() == value) {
            guessOutputComment = "correct";
            rightGuess++;
        } else if (randomNumber() > value) {
                guessOutputComment = "Too low";
            } else {
                guessOutputComment = "Too high";
            }
        counter++;
        return guessOutputComment;
    }

    public void updateScore(){
        if(rightGuess > 5 && rightGuess < 10){
            System.out.println("Either you know the secret\n" +
                    "or you got lucky!\n");
        }else if(rightGuess == 10){
            System.out.println("Aha! You know the secret!\n");
        }else if(counter > 10) {
            System.out.println("You should be able to do better! Why should it\n" +
                    "take no more than 10 guesses? Well, with each “good guess\n");
        }
    }


    public void runGuessGame(){
        randomNumber();
        setUserInput();
        String outcome =  userGuessOutcome(getUserGuessValue());
        updateComment(outcome);

    }


    public int userOption(){
        System.out.print("Do you want play again\nEnter 1 to continue and 2 to exit game : ");
        return userInput.nextInt();
    }

    public void playAgainOrExit(int value){
        if(value == 1){
            runGuessGame();
        }else if(value == 2){
            System.out.println("thanks for playing.\nExiting..............");
        }else {
            System.out.println("Invalid input!");
            userOption();
        }
    }

    public static void main(String[] args) {
        GuessTheNumber myNumber = new GuessTheNumber();
            myNumber.runGuessGame();
    }

}










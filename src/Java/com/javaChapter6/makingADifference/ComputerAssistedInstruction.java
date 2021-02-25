package Java.com.javaChapter6.makingADifference;

import javax.swing.*;
import java.security.SecureRandom;

public class ComputerAssistedInstruction {
    private static int firstRandomNumber;
    private static int secondRandomNumber;


    public static int generateRandomNumber() {
        SecureRandom random = new SecureRandom();
        int randomNumber = 1 + random.nextInt(9);
        return randomNumber;
    }

    public String generateRandomQuestion() {
        firstRandomNumber = generateRandomNumber();
        secondRandomNumber = generateRandomNumber();
        String question = String.format("How much is %d times %d, Enter -1 to exit quiz.", firstRandomNumber, secondRandomNumber);
        return question;
    }

    public String checkAnswer(int answer) {
        int result = firstRandomNumber * secondRandomNumber;
        String status = "";

        if(result == answer){
            status = "pass";
        }
        if(result != answer){
            status = "fail";
        }
        if(answer == -1){
            status = "exit";
        }
        return status;
    }


    public int displayQuestion(String question) {
        return Integer.parseInt(JOptionPane.showInputDialog(null, question));
    }

}

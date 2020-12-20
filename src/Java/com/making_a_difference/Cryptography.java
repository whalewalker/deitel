package Java.com.making_a_difference;

import java.util.Arrays;
import java.util.Scanner;

public class Cryptography {
    private static int pin;
    //================ Encryption ===============
    public static boolean checkPin(int pin) {
        String length = Integer.toString(pin);
        if(length.length() != 4) {
            return false;
        }
        return true;
    }
    public static String performOperation(int pin) {
        int reminder;
        int divisor;
        String  reverse = "";
            while (pin != 0){
                reminder = pin % 10;
                reminder += 7;
                divisor = reminder % 10;
                reverse += divisor;
                pin /= 10;
            }
        return reverse;
    }

    public static String firstSwap(String pinOutput, int first, int third) {
        char[] stringToCharArray = pinOutput.toCharArray();
        char temp = stringToCharArray[first];
        stringToCharArray[first] = stringToCharArray[third];
        stringToCharArray[third] = temp;
        return new String(stringToCharArray);
    }

    public static String secondSwap(String pinOutput, int second, int fourth) {
        char[] stringToCharArray = pinOutput.toCharArray();
        char temp = stringToCharArray[second];
        stringToCharArray[second] = stringToCharArray[fourth];
        stringToCharArray[fourth] = temp;
        return new String(stringToCharArray);
    }

    //================ Encryption ===============

    //****************** Decryption ****************
    public static boolean checkStringLength(String pin) {
        if(pin.length() != 4){
            return false;
        }
        return true;
    }

    public static String thirdSwap(String pin, int fourth, int second) {
        char[] stringToCharArray = pin.toCharArray();
        char temp = stringToCharArray[fourth];
        stringToCharArray[fourth] = stringToCharArray[second];
        stringToCharArray[second] = temp;
        return new String(stringToCharArray);
    }

    public static String fourthSwap(String thirdSwap, int third, int first) {
        char[] stringToCharArray = thirdSwap.toCharArray();
        char temp = stringToCharArray[third];
        stringToCharArray[third] = stringToCharArray[first];
        stringToCharArray[first] = temp;
        return new String(stringToCharArray);
    }

    public static int convertToInt(String pin) {
        return Integer.parseInt(pin);
    }

    public static String decrypt(int newPin) {
        int reminder;
        int operation;
       String decryptPin = "";
        while (newPin != 0){
            reminder = newPin % 10;
            if(reminder >= 0 && reminder <= 6){
                operation = (10 + reminder) - 7;
            }else {
                operation = (10 + reminder)/2;
                if(operation == 9){
                    operation = 2;
                }else if(operation == 8){
                    operation = 1;
                }else if(operation == 7){
                    operation = 0;
                }
            }
            decryptPin += operation;
            newPin /= 10;
        }
        if(checkStringLength(decryptPin)){
            return decryptPin;
        }else {
            decryptPin = decryptPin + "3";
        }
        return decryptPin;
    }


    //****************** Decryption ****************
}

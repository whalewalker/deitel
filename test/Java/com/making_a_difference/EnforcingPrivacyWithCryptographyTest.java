package Java.com.making_a_difference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnforcingPrivacyWithCryptographyTest {
    //================ EncryptionTest ===============
    @Test
    void testIfPinHasFourDigit(){
        int pin = 2375;
        boolean isPin = Cryptography.checkPin(pin);
        assertTrue(isPin);
    }

    @Test
    void testIfSevenCanBeAddedToEachIntegerAndGetTheReminderAfterDividingEachIntegerByTen(){
        int pin= 3267;
        String pinOutput = Cryptography.performOperation(pin);
        assertEquals("4390", pinOutput);
    }

    @Test
    void testIfFirstDigitCanBeSwapWithThirdDigit(){
        int pin= 3267;
        String pinOutput = Cryptography.performOperation(pin);
        String firstSwap = Cryptography.firstSwap(pinOutput, 0, 2);
        assertEquals("9340", firstSwap);
    }


    @Test
    void testIfFourthDigitCanBeSwapWithSecondDigit(){
        int pin= 3267;
        String pinOutput = Cryptography.performOperation(pin);
        String firstSwap = Cryptography.firstSwap(pinOutput, 0, 2);
        String secondSwap = Cryptography.secondSwap(firstSwap, 1, 3);
        assertEquals("9043", secondSwap);
    }

    //================ EncryptionTest ===============

    //**************** DecryptionTest ***************
    @Test
    void checkIfTheLengthOfAStringIsFour() {
        String pin = "9043";
        boolean isStringLength = Cryptography.checkStringLength(pin);
        assertTrue(isStringLength);
    }

    @Test
    void testIfAStringCanBeConvertedToAnInt(){
        String pin = "9043";
        int actual = Cryptography.convertToInt(pin);
        assertEquals(2345, actual);
    }

    @Test
    void testIfSecondDigitCanBeSwapWithFourthDigit(){
        String  pin= "9043";
        String thirdSwap = Cryptography.thirdSwap(pin, 3, 1);
        assertEquals("3762", thirdSwap);
    }

    @Test
    void testIfThirdDigitCanBeSwapWithFirstDigit(){
        String  pin= "9043";
        String thirdSwap = Cryptography.thirdSwap(pin, 3, 1);
        String fourthSwap = Cryptography.fourthSwap(thirdSwap, 2, 0);
        assertEquals("6732", fourthSwap);
    }

    @Test
    void testIfMathOperationCanBeDoneOnEncryptedPin(){
        String  pin= "9043";
        String thirdSwap = Cryptography.thirdSwap(pin, 3, 1);
        String fourthSwap = Cryptography.fourthSwap(thirdSwap, 2, 0);
        int newPin = Cryptography.convertToInt(fourthSwap);
        String decryptedPin = Cryptography.decrypt(newPin);
        assertEquals("5689", decryptedPin);
    }


    //**************** DecryptionTest ***************

}
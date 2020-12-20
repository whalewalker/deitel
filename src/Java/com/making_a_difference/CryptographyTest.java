package Java.com.making_a_difference;

import java.util.Scanner;

public class CryptographyTest {
    Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter your pin : ");
        int pin = userInput.nextInt();
        String encryptPin = Cryptography.secondSwap(Cryptography.firstSwap(Cryptography.performOperation(pin), 0, 2), 1, 3);
        System.out.printf("Encrypted Pin = %s%n", encryptPin);

        String decryptPin = Cryptography.decrypt(Cryptography.convertToInt(Cryptography.fourthSwap(Cryptography.thirdSwap(encryptPin, 3, 1), 2, 0)));
        System.out.printf("Decrypted Pin = %s%n", decryptPin);;
        userInput.close();
    }
}

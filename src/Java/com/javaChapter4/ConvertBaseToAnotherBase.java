package Java.com.javaChapter4;

import java.util.Scanner;

public class ConvertBaseToAnotherBase {
    Scanner userInput = new Scanner(System.in);
    long anyNumber;
    int base;
    int baseToConvertTo;
    int decimalValue = 0;
    long originValue;
    int originalBase;



    public static void main(String[] args) {
        ConvertBaseToAnotherBase myConversion = new ConvertBaseToAnotherBase();
        myConversion.setBaseToConvertTo( myConversion.convertAnyBinaryToBaseTen());
    }


    public boolean checkAnyNumber(){
        System.out.print("Enter base you currently want to convert : ");
        base = userInput.nextInt();
        originalBase = base;


        System.out.print("Enter a values of base : ");
        anyNumber = userInput.nextLong();
        originValue = anyNumber;


        System.out.print("Enter base you want to convert to: ");
        baseToConvertTo = userInput.nextInt();


        long number = anyNumber;
        while (number > 0){
            if(number % 10 > base - 1){
                return false;
            }
            number = number / 10;
        }
        return true;
    }

    public int convertAnyBinaryToBaseTen(){
        if(checkAnyNumber() && base <= 10){
            int reminder;
            int power = 0;
            decimalValue = 0;
            int rev;
            while (anyNumber != 0){
                reminder = (int)(anyNumber % 10);
                rev= (int)(Math.pow(base, power++)) * reminder + decimalValue;
                decimalValue = rev;
                anyNumber = anyNumber / 10;
            }
        }
        return decimalValue;
    }

    public void setBaseToConvertTo(int value) {


        if(base <= 10){
            int base = 1;
            int reminder;
            String reverse = "";
            String mainConversion = "";

            while (base != 0) {
                base = value / baseToConvertTo;

                reminder = value % baseToConvertTo;

                reverse += reminder;

                value = base;
            }
            for(int i = reverse.length()-1; i >= 0; i--){
                mainConversion = mainConversion + reverse.charAt(i);
            }

        System.out.printf("%n%d in base %d is %s in base %d", originValue, originalBase, mainConversion, baseToConvertTo);

        }else{
            System.out.println("Invalid user input, enter base from two to ten");
        }


    }

}

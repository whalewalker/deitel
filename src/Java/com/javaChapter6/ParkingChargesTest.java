package Java.com.javaChapter6;

import java.util.Scanner;

public class ParkingChargesTest {
    public static void main(String[] args) {
        ParkingCharges myCar = new ParkingCharges(3);

        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter allocated space for your car: ");
        int userSpace  = userInput.nextInt();

        int maximumSpace = 20;
        if(userSpace <= maximumSpace){
            double totalCharge = 0.0;
            for (int count = 1; count <= userSpace; count++){
                System.out.print("Enter hour for car park (Note: hour must be equal to 3 or more: ");
                int hour = userInput.nextInt();
                myCar.setHour(hour);
                totalCharge += myCar.calculateCharge(myCar.getHour());
            }
            System.out.printf("Your total charge for each car is $%.2f", totalCharge);
        }else {
                System.out.printf("Sorry, we have limited space of %d.\nPls input value lesser!", maximumSpace);
            }
        }
    }


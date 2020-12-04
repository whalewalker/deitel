package Java.com.javaChapter5;

import java.util.Scanner;

public class CalculatingSales {
    Scanner input = new Scanner(System.in);

    public int productNumber;

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }
    

    public double productName(){
        double myValue = 0.0;

        for(int counter = 0; counter < 5; counter++){

            System.out.print("Enter the product number : ");
            productNumber = input.nextInt();
            myValue += calSale();
        }
        return myValue;
    }

    public double calSale() {
        return switch (getProductNumber()) {
            case 1 -> 2.98;
            case 2 -> 4.50;
            case 3 -> 9.98;
            case 4 -> 4.49;
            case 5 -> 6.89;
            default -> 0;
        };
    }


    public static void main(String[] args) {
        CalculatingSales mySale = new CalculatingSales();
        double totalSale = mySale.productName();
        System.out.println(totalSale);
    }

}

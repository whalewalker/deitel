package Java.com.javaChapter7.exercise.sales_commission;

import Java.com.javaChapter6.RoundingNumbers;

public class SalesCommissions {

    private double[] grossPay;

    public void setGrossPay(double[] grossPay) {
            this.grossPay = grossPay;
    }

    public double[] getGrossPay() {
        return grossPay;
    }

    public double[] calculateEarn() {
        double[] earning = new double[grossPay.length];
        for(int count = 0; count < grossPay.length; count++){
            double value = grossPay[count] *  0.09 + 200;
            earning[count] = RoundingNumbers.roundToSpecificDecimal(value, 2);
        }
        return earning;
    }


    public int[] outputBarChar(double[] earnArray) {
        int[] frequency = new int[11];
        for(double sale : earnArray){
            int value  = (int) (sale/100);
            ++frequency[value];
        }
        for(int count = 2; count < frequency.length; count++) {
            if (count == 10) {
                System.out.printf("%3d and more: ", 1000);
            } else {
                System.out.printf("%02d-%02d: ", count * 100, count* 100 + 99);
            }
            for(int stars = 0; stars < frequency[count]; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        return frequency;
    }
}

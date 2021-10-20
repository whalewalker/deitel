package Java.com.javaChapter8;

import java.math.BigDecimal;

public class Account {
    private static int annualInterestRate;
    private double savingsBalance;

    public Account(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public static int getAnnualInterestRate() {
        return annualInterestRate / 100;
    }

    public static void modifyInterestRate(int annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public void calculateMonthlyInterest(){
        savingsBalance  += savingsBalance * (double) annualInterestRate / 12;
    }
}

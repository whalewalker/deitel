package Java.com.javaChapter9.Abstraction;

import java.util.Date;
import java.util.Scanner;

public class Loan implements Loanable{
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan(){
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();

    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    @Override
    public double monthlyPayment() {
        final int RATE = 12;
        double monthlyInterestRate = annualInterestRate / RATE;
        return loanAmount * monthlyInterestRate;
    }

    @Override
    public double totalPayment() {
        return monthlyPayment() * numberOfYears * 12;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        System.out.printf("The loan was created on %s\nThe monthly payment is %.2f\nThe total payment is %.2f\n",
                loan.getLoanDate().toString(), loan.monthlyPayment(),
                loan.totalPayment());
    }
}

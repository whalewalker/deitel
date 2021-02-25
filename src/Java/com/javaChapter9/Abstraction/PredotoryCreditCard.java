package Java.com.javaChapter9.Abstraction;

import Java.com.javaChapter9.creditCard.CreditCard;

public class PredotoryCreditCard extends CreditCard {
    private double apr;


    public double getApr() {
        return apr;
    }

    public void setApr(double apr) {
        this.apr = apr;
    }

    @Override
    public void makePayment() {
        super.makePayment();
        System.out.println("Predotory method called");
    }

    @Override
    public void charge() {
        super.charge();
        System.out.println("Predotory method called");
    }
    public boolean pay(){
        System.out.println("Pay called");
        return false;
    }

    public static void main(String[] args) {
        CreditCard card = new PredotoryCreditCard();
//        System.out.println(card.pay());
//        PredotoryCreditCard creditCard = new CreditCard();
    }
}

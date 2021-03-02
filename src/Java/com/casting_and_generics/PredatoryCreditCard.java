package Java.com.casting_and_generics;

public class PredatoryCreditCard extends CreditCard{
    public PredatoryCreditCard(String name) {
        super(name);
    }


    public static void main(String[] args) {
        CreditCard creditCard = new PredatoryCreditCard("Abdullah"); // Widening casting
        PredatoryCreditCard card = (PredatoryCreditCard) creditCard; // Narrowing casting;
    }
}

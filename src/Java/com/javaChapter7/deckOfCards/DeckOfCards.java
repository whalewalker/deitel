package Java.com.javaChapter7.deckOfCards;

import java.util.Arrays;

import static java.lang.System.arraycopy;

public class DeckOfCards {
    private int[] deck;
    private String[] suits;
    private String[] ranks;

    public DeckOfCards(){
        deck = new int[52];
        suits = new String[]{"Spades", "Hearts", "Diamonds", "Clubs"};
        ranks = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    }

    public void initializeDeck(){
        for(int count = 0; count < deck.length; count++){
            deck[count] = count;
        }
    }

    public void shuffleCard(){
        for(int count = 0; count < deck.length; count++){
            int random = generateRandomNumber();
            int temp = deck[count];
            deck[count] = deck[random];
            deck[random] = temp;
        }
    }
    public int generateRandomNumber(){
        return (int)(Math.random() * deck.length);
    }

    public String displayCardOnDeckAfterShuffle(){
        shuffleCard();
        StringBuilder display = new StringBuilder();
        for(int count = 0; count < deck.length - 1; count++){
            String suit = suits[deck[count] / 13];
            String rank = ranks[deck[count] % 13];

            display.append("Card number ").append(deck[count]).append(": ").append(rank).append(" of ").append(suit).append("\n");
        }
        return display.toString();
    }

    public static void main(String[] args) {
        DeckOfCards newCard = new DeckOfCards();
        newCard.initializeDeck();
        newCard.shuffleCard();
//        System.out.println(newCard.displayCardOnDeckAfterShuffle());

    }
}

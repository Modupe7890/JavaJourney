package Chapter7;
import java.security.SecureRandom;
public class DeckOfCard {
    private Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    private static final  SecureRandom randomNumbers = new SecureRandom();

    // Constructor fills deck of Cards
    public DeckOfCard(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        deck = new Card[NUMBER_OF_CARDS];
        currentCard = 0;

        // populate deck with Card objects
        for (int count = 1; count < deck.length; count++);
        deck[count] = new Card(faces[count % 13], suits[count / 13]);
    }
}

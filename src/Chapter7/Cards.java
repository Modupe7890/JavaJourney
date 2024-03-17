package Chapter7;

public class Cards {
    private final String face;
    private final String suit;

    // initializing constructor
    public class (String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;

        // returning representation of Cards
        public String toString(){
            return face + "of" + suit;
        }
    }
}

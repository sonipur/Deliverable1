package deliverable3;



/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * @author dancye
 */
public class Card {
    
    public enum Suit{
    HEART,DIAMOND,SPADE,CLUBS
    }
    public enum Rank{
        TWO,THREE,FOUR,FIVE,SIX,SEVEN,
        EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE
    }
    
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank)
    {
        this.suit=suit;
        this.rank=rank;
    }
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return the value
     */
    public Rank getRank() {
        return rank;
    }
}
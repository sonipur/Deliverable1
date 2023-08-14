package deliverable3;



/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;
import java.util.List;

public class Player {
    private final String name;
    private final List<Card> cards;

    public Player(String name) {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void addCards(List<Card> newCards) {
        cards.addAll(newCards);
    }

    public List<Card> drawCards(int numCards) {
        List<Card> drawnCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            if (!cards.isEmpty()) {
                drawnCards.add(cards.remove(0));
            }
        }
        return drawnCards;
    }

    public int getNumCards() {
        return cards.size();
    }

    public String getName() {
        return name;
    }
}

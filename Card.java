package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 * 
 * @author dancye
 */
public abstract class Card {

	private Rank rank;
	private Suit suit;

	/**
	 * Students should implement this method for their specific children classes
	 * @return a String representation of a card. Could be an UNO card, a regular playing card etc.
	 */
	@Override
	public abstract String toString();

	public void getRank() {
		// TODO - implement Card.getRank
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param rank
	 */
	public void setRank(int rank) {
		// TODO - implement Card.setRank
		throw new UnsupportedOperationException();
	}

	public void getSuit() {
		// TODO - implement Card.getSuit
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param suit
	 */
	public void setSuit(int suit) {
		// TODO - implement Card.setSuit
		throw new UnsupportedOperationException();
	}


	public enum Rank {
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING,
		ACE
	}


	public enum Suit {
		HEARTS,
		CLUBS,
		DIAMOND,
		SPADE
	}

}
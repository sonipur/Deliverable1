package ca.sheridancollege.project;

import java.util.*;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class GroupOfCards {

	private int size;
	/**
	 * The group of cards, stored in an ArrayList
	 */
	private Collection<Card> cards;

	public int getSize() {
		return this.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Collection<Card> getCards() {
		return this.cards;
	}

	/**
	 * the size of the grouping
	 * @param size
	 */
	public GroupOfCards(int size) {
		// TODO - implement GroupOfCards.GroupOfCards
		throw new UnsupportedOperationException();
	}

	public void shuffle() {
		// TODO - implement GroupOfCards.shuffle
		throw new UnsupportedOperationException();
	}

	public Card deal() {
		// TODO - implement GroupOfCards.deal
		throw new UnsupportedOperationException();
	}

}
package ca.sheridancollege.project;

import java.util.*;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 * 
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.Scanner;
public abstract class Game {

	private final String name = "";
	/**
	 * the title of the game
	 */
	private Collection<Player> players;
	private int numRounds;
	private int player1Score;
	private int player2Score;

	public String getName() {
		return this.name;
	}

	public Collection<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(Collection<Player> players) {
		this.players = players;
	}

	/**
	 * the players of the game
	 * @param name
	 */
	public Game(String name) {
                            Scanner sc = new Scanner(System.in);
	}

	/**
	 * Play the game. This might be one method or many method calls depending on your game.
	 */
	public abstract void play();

	/**
	 * When the game is over, use this method to declare and display a winning player.
	 */
	public abstract void declareWinner();

	public void resolveWar() {
		// TODO - implement Game.resolveWar
		throw new UnsupportedOperationException();
	}

	public void startGame() {
		// TODO - implement Game.startGame
		throw new UnsupportedOperationException();
	}

}
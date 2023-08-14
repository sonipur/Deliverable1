/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable3;
import java.util.List;


/**
 *
 * @author rajab
 */



public class WarGame {
    private final Player player1;
    private final Player player2;
    private final CardComparator cardComparator;
    private final Deck deck;

    public WarGame(CardComparator cardComparator, Player player1, Player player2) {
        this.cardComparator = cardComparator;
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new Deck();
        deck.shuffle();
        dealCards();
    }

    private void dealCards() {
        while (!deck.isEmpty()) {
            player1.addCards(List.of(deck.drawCard()));
            player2.addCards(List.of(deck.drawCard()));
        }
    }

 

    private String determineRoundWinner(List<Card> player1Round, List<Card> player2Round) {
        int comparison = cardComparator.compare(player1Round.get(3), player2Round.get(3));
        if (comparison > 0) {
            player1.addCards(player1Round);
            player1.addCards(player2Round);
            return player1.getName();
        } else if (comparison < 0) {
            player2.addCards(player1Round);
            player2.addCards(player2Round);
            return player2.getName();
        } else {
            return "War!";
        }
    }



    public void play() {
        int round = 1;
        while (player1.getNumCards() >= 4 && player2.getNumCards() >= 4 && round <= 52) {
            List<Card> player1Round = player1.drawCards(4);
            List<Card> player2Round = player2.drawCards(4);

            String roundWinner = determineRoundWinner(player1Round, player2Round);
            System.out.println("Round " + round + " winner: " + roundWinner);

            if (roundWinner.equals("War!")) {
                player1Round.addAll(player1.drawCards(2));
                player2Round.addAll(player2.drawCards(2));
            }

            round++;
            System.out.println(player1.getName() + " cards: " + player1.getNumCards() + " | " +
                               player2.getName() + " cards: " + player2.getNumCards());
            System.out.println();
        }

        handleGameOver();
    }

    private void handleGameOver() {
        String winner = WinnerDeterminer.determineWinner(player1.getNumCards(), player2.getNumCards());
        System.out.println("Game over. " + winner + " wins the game!");
    }

}







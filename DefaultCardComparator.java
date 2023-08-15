/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable3;

/**
 *
 * @author Rajae Barnes
 * @modifier Purvam Soni
 * @modifier Navjot Kaur
 */

    public class DefaultCardComparator implements CardComparator {
    private final Card.Rank[] ranks = Card.Rank.values();

    @Override
    public int compare(Card card1, Card card2) {
        int rank1 = java.util.Arrays.asList(ranks).indexOf(card1.getRank());
        int rank2 = java.util.Arrays.asList(ranks).indexOf(card2.getRank());
        return Integer.compare(rank1, rank2);
    }
}


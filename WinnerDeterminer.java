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
public class WinnerDeterminer {
    public static String determineWinner(String player1Name, String player2Name, int player1NumCards, int player2NumCards) {
        if (player1NumCards > player2NumCards) {
            return player1Name;
        } else if (player2NumCards > player1NumCards) {
            return player2Name;
        } else {
            return "It's a tie!";
        }
    }
}



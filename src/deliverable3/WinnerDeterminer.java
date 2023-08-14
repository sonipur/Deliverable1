/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliverable3;

/**
 *
 * @author rajab
 */
public class WinnerDeterminer {
    public static String determineWinner(int player1NumCards, int player2NumCards) {
        if (player1NumCards > player2NumCards) {
            return "Player 1";
        } else if (player2NumCards > player1NumCards) {
            return "Player 2";
        } else {
            return "It's a tie!";
        }
    }
}



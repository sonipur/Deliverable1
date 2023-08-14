/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliverable3;

/**
 *
 * @author Rajae Barnes
 */
import java.util.Scanner;
public class Deliverable3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to start the game? (Y/N): ");
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            System.out.println("Great! Let's start the game.");
            System.out.println("Enter the name of player one");
            String p1 = sc.nextLine();
            System.out.println("Enter the name of player 2");
            String p2 = sc.nextLine();
            // Add your game initialization and logic here
             CardComparator cardComparator = new DefaultCardComparator();
             WarGame warGame = new WarGame(cardComparator, new Player(p1), new Player(p2));
             warGame.play();
        } else if (input.equalsIgnoreCase("N")) {
            System.out.println("Maybe next time. Have a good day!");
            // You can exit the program or perform any other actions here
        } else {
            System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            // You may want to prompt the player again for a valid response
        }

        sc.close();

    }
   
}
    

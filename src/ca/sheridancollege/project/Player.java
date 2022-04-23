/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {

    private String name; //the unique name for this player
    private int numOfCards;
    
    /**
     * @return the player name
     */
    public String getName() {
        return name;
    }

    /**
     * Ensure that the playerID is unique
     *
     * @param name the player name to set
     */
    public void setName(String name) {
        this.name = name;

    }

    ArrayList<Card> playerHand;
    /**
     * A constructor that allows you to set the player's unique ID
     *
     * @param name the unique ID to assign to this player.
     */
    public Player(String name) {
        this.name = name;
        playerHand = new ArrayList<Card>();
    }

    public void addCard(Card aCard) {

        playerHand.add(aCard);
        this.numOfCards++;
    }

    public int getHandSum() {

        int sum = 0;

        for (Card countSum : playerHand) {

            sum = sum + countSum.getFace();

        }
        return sum;
    }
    
    public void getHand(boolean hideCards) {
    
        System.out.println(this.name + " your current hand.");

        for (int c = 0; c < numOfCards; c++) {
            if (c == 0 && !hideCards) {
                System.out.println("[Hidden Card]");
            }
            else {
                System.out.println(playerHand.get(c).toString());
            }
        }
    
    }
    

    /**
     * The method to be overridden when you subclass the Player class with your specific type of Player and filled in
     * with logic to play your game.
     */
   // public abstract void play();

}

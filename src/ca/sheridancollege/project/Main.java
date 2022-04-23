package ca.sheridancollege.project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean stay = false;

        System.out.println("What NickName would you like to have?");
        String pAnswer = scanner.nextLine();
        Player me = new Player(pAnswer);
        Player dealer = new Player("Dealer ");

        System.out.println("Would you like to start a new game?  'Yes/No' :");
        pAnswer = scanner.nextLine();

        if (pAnswer.equalsIgnoreCase("Yes")) {

            Deck deck1 = new Deck();
            Card card1 = new Card(Face.ACE, Suit.CLUBS);
            deck1.shuffle();

            me.addCard(deck1.dealNext());
            me.addCard(deck1.dealNext());
            me.getHand(true);
            System.out.println(" ");
            dealer.addCard(deck1.dealNext());
            dealer.addCard(deck1.dealNext());
            dealer.getHand(false);

            // PLAYER
            do {
                System.out.println("Would " + me.getName() + " like to hit or stay? 'hit/Stay'");
                pAnswer = scanner.nextLine();
                // BUST
                if (pAnswer.equalsIgnoreCase("Hit")) {
                    me.addCard(deck1.dealNext());
                    System.out.println(me.getHandSum());
                    if (me.getHandSum() > 21) {
                        System.out.println(
                                "You busted and got a total of " + me.getHandSum() + ". Dealer wins this time! ");
                        System.exit(0);
                    }
                }
                // STAY
                if (pAnswer.equalsIgnoreCase("stay")) {
                    System.out.println("You have chosen to stay. Your hand: " + me.getHandSum());
                }

            } while (pAnswer.equalsIgnoreCase("hit"));

            // DEALER
            stay = false;

            do {
                System.out.println("");
                System.out.println("- Dealers turn -");
                // DRAW CARD
                if (dealer.getHandSum() <= 12) {
                    dealer.addCard(deck1.dealNext());
                    if (dealer.getHandSum() == 21) {
                        System.out.println("Blackjack! Dealer won.");
                        System.exit(0);
                    }
                    if (dealer.getHandSum() > 21) {
                        System.out.println("Dealer busted and got a total of " + dealer.getHandSum() + ". "
                                + me.getName() + " wins this time!");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Dealer has chosen to stay!");
                    int totalDealerSum = dealer.getHandSum();
                    int totalPlayerSum = me.getHandSum();

                    if (totalDealerSum > totalPlayerSum) {
                        System.out.println("Both players has decided to stay. The winner is " + dealer.getName()
                                + " with a total of " + totalDealerSum + ".");
                    } else {
                        System.out.println("Both players has decided to stay. The winner is " + me.getName()
                                + " with a total of " + totalPlayerSum + ".");
                    }
                    stay = false;
                }

            } while (stay);
        }
    }
}

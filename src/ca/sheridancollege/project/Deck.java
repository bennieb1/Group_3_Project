package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;

public class Deck {

	private Card[] deck;
	private static final Random random = new Random();

	private int currentCard;
	private static int NUMBER_OF_CARDS = 52;

	public Deck() {

		Face[] faces = { Face.ACE, Face.DEUCE, Face.THREE,
				Face.FOUR, Face.FIVE, Face.SIX, Face.SEVEN,
				Face.EIGHT, Face.NINE, Face.TEN, Face.JACK, Face.QUEEN,
				Face.QUEEN, Face.KING, Face.Ace };

		Suit[] suits = { Suit.HEARTS, Suit.DIAMONDS, Suit.SPADES,
				Suit.CLUBS };

		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;

		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}

	}

	public void shuffle() {

		currentCard = 0;

		for (int first = 0; first < deck.length; first++) {

			int second = random.nextInt(NUMBER_OF_CARDS);

			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;

		}
	}

	public void getCardDeck() {

		int start = 1;
		for (Card k : deck) {
			System.out.println(" " + start + "/52" + k);
			start++;
		}

	}
        
        public boolean checkGetCardDeck(int start) {
            
		for (Card k : deck) {
			System.out.println(" " + start + "/52" + k);
			start++;
		}
		boolean getAllCards=false;

		if(start>=53)
			return getAllCards=true;
		else
			return getAllCards;	

	}

	public Card dealNext() {

		Card topCard = this.deck[0];

		for (int currentCard = 1; currentCard < NUMBER_OF_CARDS; currentCard++) {
			this.deck[currentCard - 1] = this.deck[currentCard];
		}
		this.deck[NUMBER_OF_CARDS - 1] = null;

		this.NUMBER_OF_CARDS--;

		return topCard;

	}
        public boolean checkDealNext(boolean r) {

		Card topCard = this.deck[0];

		for (int currentCard = 1; currentCard < NUMBER_OF_CARDS; currentCard++) {
			this.deck[currentCard - 1] = this.deck[currentCard];
		}
		this.deck[NUMBER_OF_CARDS - 1] = null;

		this.NUMBER_OF_CARDS--;

		return r;

	}

	// /**
	// *
	// * @param num
	// */
	// public Card draw(int num) {

	// }

	// /**
	// *
	// * @param cards
	// */
	// public void addCards(ArrayList<Card> cards) {

	// }

	// /**
	// *
	// * @param cards
	// */
	// public void removeCards(ArrayList<Card> cards) {

	// }

}

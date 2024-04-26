package _5_Draw_Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

import _5_Draw_Poker.Card.Rank;
import _5_Draw_Poker.Card.Suit;

public class Deck {
	
	private Stack<Card> cardDeck;
	
	public Deck() {
		this.cardDeck = new Stack<Card>();
		for(Rank rank : Card.Rank.values()) {
			for (Suit suit : Card.Suit.values()) {
				cardDeck.add(new Card(rank,suit));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cardDeck);
	}
	
	public List<Card> deal(int numberOfCards) {
		List<Card> returnedCards = new ArrayList<>();
		for(int i = 0; i < numberOfCards; i++) {
			returnedCards.add(cardDeck.pop());
		}
		return returnedCards;
	}
	
	public Stack<Card> getCardDeck() {
		return cardDeck;
	}
	
	
	
}

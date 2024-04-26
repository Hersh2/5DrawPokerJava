package _5_Draw_Poker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestDeck {

	private Deck deck;
	
	@BeforeEach
	void setup() {
		deck = new Deck();
	}
	
	@Test
	void testShuffle() {
		String beforeShuffle = deck.getCardDeck().firstElement().toString();
		deck.shuffle();
		String afterShuffle = deck.getCardDeck().firstElement().toString();
		Assertions.assertNotEquals(beforeShuffle, afterShuffle);
	}
	
	@Test
	void testDeal() {
		int oldDeckSize = deck.getCardDeck().size();
		String topCard = deck.getCardDeck().peek().toString();
		String returnedCard = deck.getCardDeck().pop().toString();
		int newDeckSize = deck.getCardDeck().size();
		Assertions.assertEquals(topCard, returnedCard);
		Assertions.assertNotEquals(oldDeckSize, newDeckSize);
	}
}

package _5_Draw_Poker;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestCard {
	
	private Card card;
	
	@BeforeEach
	void setup() {
		card = new Card(Card.Rank.ACE, Card.Suit.DIAMOND);
	}
	
	@Test
	void testToString() {
		String displayString = card.toString();
		Assertions.assertEquals("A♦", displayString);
	}
}

package _5_Draw_Poker;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestHandEvaluator {
	
	HandEvaluator evaluator;
	List<Card> straightFlushHand;
	List<Card> fourOfAKindHand;
	List<Card> fullHouseHand;
	List<Card> flushHand;
	List<Card> straightHand;
	List<Card> threeOfAKindHand;
	List<Card> twoPairHand;
	List<Card> pairHand;
	List<Card> highCardHand;
	
	
	@BeforeEach
	void setup() {
		evaluator = new HandEvaluator();
		//populate the hands
		straightFlushHand = new ArrayList<>();
		straightFlushHand.add(new Card(Card.Rank.ACE,Card.Suit.DIAMOND));
		straightFlushHand.add(new Card(Card.Rank.KING,Card.Suit.DIAMOND));
		straightFlushHand.add(new Card(Card.Rank.QUEEN,Card.Suit.DIAMOND));
		straightFlushHand.add(new Card(Card.Rank.JACK,Card.Suit.DIAMOND));
		straightFlushHand.add(new Card(Card.Rank.TEN,Card.Suit.DIAMOND));
		
		fourOfAKindHand = new ArrayList<>();
		fourOfAKindHand.add(new Card(Card.Rank.EIGHT, Card.Suit.DIAMOND));
		fourOfAKindHand.add(new Card(Card.Rank.EIGHT, Card.Suit.HEART));
		fourOfAKindHand.add(new Card(Card.Rank.EIGHT, Card.Suit.SPADE));
		fourOfAKindHand.add(new Card(Card.Rank.EIGHT, Card.Suit.CLUB));
		fourOfAKindHand.add(new Card(Card.Rank.NINE, Card.Suit.DIAMOND));
		
		fullHouseHand = new ArrayList<>();
		fullHouseHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		fullHouseHand.add(new Card(Card.Rank.ACE,Card.Suit.SPADE));
		fullHouseHand.add(new Card(Card.Rank.ACE,Card.Suit.DIAMOND));
		fullHouseHand.add(new Card(Card.Rank.TWO,Card.Suit.HEART));
		fullHouseHand.add(new Card(Card.Rank.TWO,Card.Suit.SPADE));
		
		flushHand = new ArrayList<>();
		flushHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		flushHand.add(new Card(Card.Rank.THREE,Card.Suit.HEART));
		flushHand.add(new Card(Card.Rank.FOUR,Card.Suit.HEART));
		flushHand.add(new Card(Card.Rank.SIX,Card.Suit.HEART));
		flushHand.add(new Card(Card.Rank.TWO,Card.Suit.HEART));
		
		straightHand = new ArrayList<>();
		straightHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		straightHand.add(new Card(Card.Rank.THREE,Card.Suit.HEART));
		straightHand.add(new Card(Card.Rank.FOUR,Card.Suit.HEART));
		straightHand.add(new Card(Card.Rank.TWO,Card.Suit.DIAMOND));
		straightHand.add(new Card(Card.Rank.FIVE,Card.Suit.HEART));
		
		threeOfAKindHand = new ArrayList<>();
		threeOfAKindHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		threeOfAKindHand.add(new Card(Card.Rank.ACE,Card.Suit.DIAMOND));
		threeOfAKindHand.add(new Card(Card.Rank.ACE,Card.Suit.SPADE));
		threeOfAKindHand.add(new Card(Card.Rank.TWO,Card.Suit.CLUB));
		threeOfAKindHand.add(new Card(Card.Rank.FIVE,Card.Suit.CLUB));
		
		twoPairHand = new ArrayList<>();
		twoPairHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		twoPairHand.add(new Card(Card.Rank.ACE,Card.Suit.DIAMOND));
		twoPairHand.add(new Card(Card.Rank.TWO,Card.Suit.SPADE));
		twoPairHand.add(new Card(Card.Rank.TWO,Card.Suit.CLUB));
		twoPairHand.add(new Card(Card.Rank.FIVE,Card.Suit.CLUB));
		
		pairHand = new ArrayList<>();
		pairHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		pairHand.add(new Card(Card.Rank.ACE,Card.Suit.DIAMOND));
		pairHand.add(new Card(Card.Rank.THREE,Card.Suit.SPADE));
		pairHand.add(new Card(Card.Rank.TWO,Card.Suit.CLUB));
		pairHand.add(new Card(Card.Rank.FIVE,Card.Suit.CLUB));
		
		highCardHand = new ArrayList<>();
		highCardHand.add(new Card(Card.Rank.ACE,Card.Suit.HEART));
		highCardHand.add(new Card(Card.Rank.KING,Card.Suit.DIAMOND));
		highCardHand.add(new Card(Card.Rank.THREE,Card.Suit.SPADE));
		highCardHand.add(new Card(Card.Rank.TWO,Card.Suit.CLUB));
		highCardHand.add(new Card(Card.Rank.FIVE,Card.Suit.CLUB));
	}
	
	@Test
	void testEvaluate() {
		String resultStraightFlush = evaluator.EvaluateHand(straightFlushHand);
		Assertions.assertEquals("Straight Flush", resultStraightFlush);
		
		String resultFourOfAKindHand = evaluator.EvaluateHand(fourOfAKindHand);
		Assertions.assertEquals("Four of a Kind", resultFourOfAKindHand);
		
		String resultFullHouseHand = evaluator.EvaluateHand(fullHouseHand);
		Assertions.assertEquals("Full house", resultFullHouseHand);
		
		String resultFlushHand = evaluator.EvaluateHand(flushHand);
		Assertions.assertEquals("Flush", resultFlushHand);
		
		String resultStraightHand = evaluator.EvaluateHand(straightHand);
		Assertions.assertEquals("Straight", resultStraightHand);
		
		String resultThreeOfAKindHand = evaluator.EvaluateHand(threeOfAKindHand);
		Assertions.assertEquals("Three of a Kind", resultThreeOfAKindHand);
		
		String resultTwoPairHand = evaluator.EvaluateHand(twoPairHand);
		Assertions.assertEquals("Two Pairs", resultTwoPairHand);
		
		String resultHighCardHand = evaluator.EvaluateHand(highCardHand);
		Assertions.assertEquals("ACE High Card", resultHighCardHand);
		
	}
}

package _5_Draw_Poker;

import java.util.List;

public class PlayGame {

	public static void main(String[] args) {
		
		Deck deck = new Deck(); 
		deck.shuffle();
		System.out.println("Shuffling ... Shuffling ... Shuffling ...");
		List<Card> hand = deck.deal(5);
		System.out.println("Your hand: " + hand);
		HandEvaluator evaluator = new HandEvaluator();
		System.out.println("You have: " + evaluator.EvaluateHand(hand));
	}

}

package _5_Draw_Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import _5_Draw_Poker.Card.Rank;
import _5_Draw_Poker.Card.Suit;

public class HandEvaluator {
	
	//function to evaluate the cards in a hand
	public String EvaluateHand(List<Card> hand) {
		
		Map<Rank,Integer> rankStore = new HashMap<>();
		Map<Suit,Integer> suitStore = new HashMap<>();
		for (Card card : hand) {
			rankStore.put(card.getRank(), rankStore.getOrDefault(card.getRank(), 0).intValue()+1);
			suitStore.put(card.getSuit(), suitStore.getOrDefault(card.getSuit(), 0).intValue()+1);
		}
		
		return rankHand(rankStore, suitStore);
	}
	
	//function to determine the highest value of a set of cards
	protected String rankHand(Map<Rank,Integer> rankStore, Map<Suit,Integer> suitStore ) {
		
	    int pairs = 0;
		boolean isFlush = false;
		boolean isStraight = false;
		boolean isFourOfAKind = false;
		boolean isThreeOfAKind = false;
		
		//ordered collection of card ranks
		ArrayList<Integer> cardRanks = new ArrayList<>();
		for (Rank rank : rankStore.keySet()) {
			cardRanks.add(rank.ordinal());
		}
		Collections.sort(cardRanks);
		
		
		//Check for Flush
		if(suitStore.size()==1) {
			isFlush = true;
		}
		
		//Check for Straight
		if(rankStore.size()==5) {
			//Check if ranks are sequential
			boolean isSequential = true;
			for(int i = 0; i < cardRanks.size()-1; i++ ) {
				if(!(cardRanks.get(i+1) - cardRanks.get(i)==1)) {
					isSequential = false;
				}
			}
			
			//Check Ace low straight
			if(cardRanks.get(4) == 12 && cardRanks.get(0) == 0 && cardRanks.get(1) == 1 && cardRanks.get(2) == 2 && cardRanks.get(3) == 3) {
				isSequential = true;
			}
			
			isStraight = isSequential;
		}
		
		//Check for matching ranks
		for (Integer integer : rankStore.values()) {
			if(integer == 4) {
				isFourOfAKind = true;
			}
			else if(integer == 3) {
				isThreeOfAKind = true;
			}
			else if(integer == 2) {
				pairs++;
			}
		}
		
		//Determine the value of the hand
		if(isStraight && isFlush) {
			return "Straight Flush";
		}
		
		if(isFourOfAKind) {
			return "Four of a Kind";
		}
		
		if(isThreeOfAKind && pairs == 1)
		{
			return "Full house";
		}
		
		if(isFlush) {
			return "Flush";
		}
		
		if(isStraight) {
			return "Straight";
		}
		
		if(isThreeOfAKind) {
			return "Three of a Kind";
		}
		
		if(pairs == 2) {
			return "Two Pairs";
		}
		
		if(pairs == 1) {
			return "Pair";
		}
		
		//determine highest card if no other conditions are met
		int highCard = cardRanks.get(cardRanks.size() -1 );
		Card.Rank.values()[highCard].toString();
		return Card.Rank.values()[highCard].toString() + " High Card";
	}

}

package _5_Draw_Poker;

public class Card {
	
	//enumeration for card suits
	public enum Suit {
		SPADE,
		HEART,
		DIAMOND,
		CLUB
	}
	
	//enumeration for card ranks
	public enum Rank {
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING,
		ACE
	}
	
	private Rank rank;
	private Suit suit;
	
	public Card(Rank rank, Suit suit){
		this.rank = rank;
		this.suit = suit;
	}
	
	public Rank getRank() {
		return rank;
	}
	public Suit getSuit() {
		return suit;
	}
	
	//function to display card values
	@Override
	public String toString() {
		String suitDisplay = "";
		String rankDisplay = "";
		
		switch(suit) {
		case CLUB:
			suitDisplay = "♣";
			break;
		case DIAMOND:
			suitDisplay = "♦";
			break;
		case HEART:
			suitDisplay = "♥";
			break;
		case SPADE:
			suitDisplay = "♠";
			break;	
		}
		
		switch(rank) {
		case ACE:
			rankDisplay = "A";
			break;
		case EIGHT:
			rankDisplay = "8";
			break;
		case FIVE:
			rankDisplay = "5";
			break;
		case FOUR:
			rankDisplay = "4";
			break;
		case JACK:
			rankDisplay = "J";
			break;
		case KING:
			rankDisplay = "K";
			break;
		case NINE:
			rankDisplay = "9";
			break;
		case QUEEN:
			rankDisplay = "Q";
			break;
		case SEVEN:
			rankDisplay = "7";
			break;
		case SIX:
			rankDisplay = "6";
			break;
		case TEN:
			rankDisplay = "10";
			break;
		case THREE:
			rankDisplay = "3";
			break;
		case TWO:
			rankDisplay = "2";
			break;
		}
		
        return rankDisplay + suitDisplay;
    }
	
	
}

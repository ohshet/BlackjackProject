package com.skilldistillery.cardgames.common;

public class Card {
	private Suit suit;
	private Rank rank;
	private String symbol;
	private String number;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rank.getValue();
		result = prime * result + ((suit == null) ? 0 : suit.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suit == null) {
			if (other.suit != null)
				return false;
		} else if (!suit.equals(other.suit))
			return false;
		return true;
	}

	public Card(Suit suit, Rank rank) {
		this.suit = suit;
		this.rank = rank;
		this.symbol = suit.getSymbol();
		this.number = rank.getNumber();
	}

	@Override
	public String toString() {

		return " ------" + "\n" + "|" + this.symbol + "     |" + "\n" + "|  " + this.number + "  |" + "\n" + "|     "
				+ this.symbol + "|" + "\n" + " ------" + "\n";

	}

	public int getValue() {
		return rank.getValue();
	}

}

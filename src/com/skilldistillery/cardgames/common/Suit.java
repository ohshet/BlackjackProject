package com.skilldistillery.cardgames.common;

public enum Suit {
	HEARTS("Hearts"), SPADES("Spades"), CLUBS("Clubs"), DIAMONDS("Diamonds");

	final private String name;

	private Suit(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;

	}

	public String getSymbol() {
		String symbol = "";
		switch (this) {
		case CLUBS:
			symbol = Character.toString('\u2663');
			break;
		case SPADES:
			symbol = Character.toString('\u2660');
			break;
		case HEARTS:
			symbol = Character.toString('\u2665');
			break;
		case DIAMONDS:
			symbol = Character.toString('\u2666');
			break;
		}
		return symbol;
	}
}
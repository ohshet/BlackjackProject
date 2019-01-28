package com.skilldistillery.cardgames.common;

public enum Rank {
	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);

	private int value;

	Rank(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public String getNumber() {
		String cardNumber = "";
		switch (this) {
		case TWO:
			cardNumber = "2 ";
			break;
		case THREE:
			cardNumber = "3 ";
			break;
		case FOUR:
			cardNumber = "4 ";
			break;
		case FIVE:
			cardNumber = "5 ";
			break;
		case SIX:
			cardNumber = "6 ";
			break;
		case SEVEN:
			cardNumber = "7 ";
			break;
		case EIGHT:
			cardNumber = "8 ";
			break;
		case NINE:
			cardNumber = "9 ";
			break;
		case TEN:
			cardNumber = "10";
			break;
		case JACK:
			cardNumber = "J ";
			break;
		case QUEEN:
			cardNumber = "Q ";
			break;
		case KING:
			cardNumber = "K ";
			break;
		case ACE:
			cardNumber = "A ";
			break;
		}
		return cardNumber;
	}
}

package com.skilldistillery.cardgames.common;

import java.util.List;

public abstract class Hand {

	protected List<Card> hand;

	public Hand() {
	}

	public abstract int getHandValue();

	public void addCard(Card card) {
		hand.add(card);
	}

	public void clearHand() {
		hand.clear();
	}

	public String toString() {
		String handString = "";
		for (Card card : hand) {
			handString = handString + card.toString() + "";
		}
		return handString;
	}
}

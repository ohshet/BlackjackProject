package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {

	protected List<Card> hand = new ArrayList<>();

	public Hand() {
	}

	protected abstract int getHandValue();

	public void addCard(Card card) {
		hand.add(card);
	}

	public void clearHand() {
		hand.clear();
	}

	public List<Card> getCards() {
		return hand;

	}
}

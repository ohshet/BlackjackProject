package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
	}

	public int getHandValue() {
		int handValue = 0;
		for (Card card : hand) {
			handValue = +card.getValue();
		}
		return handValue;
	}
}

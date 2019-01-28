package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;

public class Player {

	private BlackjackHand playerHand;

	public Player() {

	}

	public void playerInit() {
		createPlayerHand();
	}

	private void createPlayerHand() {
		playerHand = new BlackjackHand();
	}

	public void addCardToPlayerHand(Card card) {
		playerHand.addCard(card);

	}

	public String getPlayerHand() {
		return "Player has: " + playerHand.getHandValue() + "\n" + playerHand.toString();
	}

	public int getPlayerTotal() {
		return playerHand.getHandValue();
	}

	public void clearHand() {
		playerHand.clearHand();
	}
}
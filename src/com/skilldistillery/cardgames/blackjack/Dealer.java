package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;

public class Dealer {
	private Deck deck;
	private BlackjackHand dealerHand;

	public Dealer() {
	}

	public void dealerInit() {
		deck = new Deck();
		initDeck();
		createDealerHand();
	}

	private void initDeck() {
		deck.makeDeck();
		shuffle();
		shuffle();
		shuffle();
	}

	private void createDealerHand() {
		dealerHand = new BlackjackHand();
	}

	private void shuffle() {
		deck.shuffleDeck();
	}

	public Card dealCard() {
		return deck.dealCard();
	}

	public int getCardsRemaining() {
		return deck.numberOfCardsInDeck();
	}

	public void addCardToDealerHand(Card card) {
		dealerHand.addCard(card);
	}

	public String getDealerHand(boolean downCard) {
		String dealerCards = "";
		if (downCard) {
			dealerCards = "Dealer has: ?\n" + dealerHand.downCardtoString();
		} else {
			dealerCards = "Dealer has: " + dealerHand.getHandValue() + "\n" + dealerHand.toString();
		}
		return dealerCards;
	}

	public int getDealerTotal() {
		return dealerHand.getHandValue();
	}

	public void clearHand() {
		dealerHand.clearHand();
	}

	public void clearDeck() {
		deck.clearDeckList();
	}
}

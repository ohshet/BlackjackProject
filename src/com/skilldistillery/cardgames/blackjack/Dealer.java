package com.skilldistillery.cardgames.blackjack;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Deck;
import com.skilldistillery.cardgames.common.Hand;

public class Dealer {
	private Deck deck;
	private BlackjackHand dealerHand;
	
	public Dealer() {
	}
	
	public void dealerInit() {
		deck = new Deck();
		makeDeck();
		shuffleDeck();
		createDealerHand();
	}
	
	private void makeDeck() {
		deck.makeDeck();
	}
	
	private void createDealerHand() {
		dealerHand = new BlackjackHand();
	}
	
	private void shuffleDeck() {
		deck.shuffleDeck();
	}
	
	public Card dealCard() {
		return deck.dealCard();
	}
	
	public void addCardToDealerHand(Card card) {
		dealerHand.addCard(card);
	}
	

}

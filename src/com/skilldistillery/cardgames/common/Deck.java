package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> deckList;

	public void Deck() {

	}

	public void makeDeck() {
		Suit[] suitArr = Suit.values();
		Rank[] rankArr = Rank.values();
		deckList = new ArrayList<>();
		for (Suit suit : suitArr) {
			for (Rank rank : rankArr) {
				Card card = new Card(suit, rank);
				deckList.add(card);
			}
//			System.out.println(deckList.size());
		}
	}

	public int numberOfCardsInDeck() {
		return deckList.size();

	}

	public void clearDeckList() {
		deckList = null;
	}

	public Card dealCard() {
		Card topCard = deckList.remove(0);
		return topCard;
	}

	public void shuffleDeck() {
		Collections.shuffle(deckList);
	}

}
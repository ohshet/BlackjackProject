package com.skilldistillery.cardgames.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Create a class Deck. It will hold a List of Cards.
//In the constructor, initialize the List with all 52 cards.
//Add a method checkDeckSize which returns the number of cards still in the deck.
//Add a method dealCard that removes a Card from the deck.
//Add a method shuffle to shuffle the deck.

public class Deck {
private List<Card> deckList;

//	public static void main(String[] args) {
//		Deck test = new Deck();
//		test.makeDeck();
//		System.out.println(test.numberOfCardsInDeck());
//		System.out.println();
//		
//		test.shuffleDeck();
//		
//		Card topCard;
//		for (int i = 0; i < 52; i++) {
//			topCard = test.dealCard();
//			System.out.println(topCard.toString());
//			System.out.println(test.numberOfCardsInDeck());
//		}
//
//			
//		}

	
	
	

	
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
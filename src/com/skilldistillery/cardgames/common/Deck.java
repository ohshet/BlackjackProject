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
private List<Card> deck;

	public static void main(String[] args) {
		Deck test = new Deck();
		test.makeDeck();
		System.out.println(test.numberOfCardsInDeck());
		System.out.println();

			
		}

	
	
	

	
	public void Deck() {}
	
	public void makeDeck() {
		Suit[] suitArr = Suit.values();
		Rank[] rankArr = Rank.values();
		deck = new ArrayList<>();
		for (Suit suit : suitArr) {
			for (Rank rank : rankArr) {
				Card card = new Card(suit, rank);
				deck.add(card);
			}
//			System.out.println(deck.size());
		}

	}

	public int numberOfCardsInDeck() {
		return deck.size();

	}

	public Card dealCard() {
		Card topCard = deck.remove(0);
		return topCard;
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}
	
	
}
package com.skilldistillery.cardgames.blackjack;

import java.util.ArrayList;

import com.skilldistillery.cardgames.common.Card;
import com.skilldistillery.cardgames.common.Hand;

public class BlackjackHand extends Hand {

	public BlackjackHand() {
		hand = new ArrayList<>();
	}

	public int getHandValue() {
		int handValue = 0;
		for (Card card : hand) {
			handValue += card.getValue();
		}
		return handValue;
	}
	
	
	public String downCardtoString() {
		String handString = "";
		int i = 0;
		for (Card card : hand) {
			if (i == 0) {
		 handString =
				" ------" + "\n" +
				"|      |" + "\n" +
				"|      |" + "\n" +
				"|      |" + "\n" +
				" ------" + "\n";
			i++;
			}
			else {
				handString = handString + card.toString() + "";
			}
			
		
		

		}
		return handString;
	}
	
}

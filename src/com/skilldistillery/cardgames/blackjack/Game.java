package com.skilldistillery.cardgames.blackjack;

import java.util.Scanner;

import com.skilldistillery.cardgames.common.Card;

public class Game {
	private Dealer dealer;
	private Player player;
	private Card cardFromDealer;
	private boolean hideCard, handOver;
	private int playerTotal, dealerTotal;
	Scanner kb;

	public Game() {
	}

	public static void main(String[] args) {
		Game game = new Game();
		game.run();
	}

	public void run() {
		kb = new Scanner(System.in);
		dealer = new Dealer();
		player = new Player();
		dealer.dealerInit();
		player.playerInit();
		while (true) {
			hideCard = true;
			handOver = false;
			dealCards();
			checkForBlackjack();
			if (!handOver) {
				playersTurn();
				if (!handOver) {
					checkForPlayerBust();
					if (!handOver) {
						dealersTurn();
						checkForDealerBust();
						if (!handOver) {
							compareTotals();
						}
					}
				}
			}

			playAgain();
		}
	}

	private void compareTotals() {
		handOver = true;
		hideCard = false;
		displayCards(hideCard);
		if (playerTotal > dealerTotal) {
			System.out.println("You win!!!");
		} else if (playerTotal < dealerTotal) {
			System.out.println("You lose!!!");
		} else {
			System.out.println("You push!!!");
		}
	}

	private void checkForPlayerBust() {
		hideCard = false;
		if (playerTotal > 21) {
			handOver = true;
			displayCards(hideCard);
			System.out.println("BUST!!! YOU LOSE!!!");
		}
	}

	private void checkForDealerBust() {
		if (dealerTotal > 21) {
			hideCard = false;
			handOver = true;
			displayCards(hideCard);
			System.out.println("DEALER BUST!!! YOU WIN!!!");
		}
	}

	private void dealersTurn() {
		hideCard = false;
		while (dealerTotal < 17 && dealerTotal < 21) {
			cardFromDealer = dealer.dealCard();
			dealer.addCardToDealerHand(cardFromDealer);
			dealerTotal = dealer.getDealerTotal();
			displayCards(hideCard);
		}
	}

	private void dealCards() {
		for (int i = 0; i < 2; i++) {
			cardFromDealer = dealer.dealCard();
			player.addCardToPlayerHand(cardFromDealer);
			cardFromDealer = dealer.dealCard();
			dealer.addCardToDealerHand(cardFromDealer);
		}

		displayCards(hideCard);
	}

	private void displayCards(boolean downCard) {
		clearScreen();
		System.out.println(dealer.getDealerHand(downCard));
		System.out.println(player.getPlayerHand());
		if (!handOver) {
			System.out.println("There are " + dealer.getCardsRemaining() + " cards left in the deck.");
		}
	}

	private void clearScreen() {
		for (int i = 0; i < 100; i++) {
			System.out.println();
		}
	}

	private void checkForBlackjack() {
		dealerTotal = dealer.getDealerTotal();
		playerTotal = player.getPlayerTotal();
		if (dealerTotal == 21 && playerTotal == 21) {
			hideCard = false;
			handOver = true;
			displayCards(hideCard);
			System.out.println("DEALER BLACKJACK AND PLAYER BLACKJACK!!!  YOU PUSH!!!");
		} else if (playerTotal == 21) {
			hideCard = false;
			handOver = true;
			displayCards(hideCard);
			System.out.println("BLACKJACK!!! YOU WIN!!!");

		} else if (dealerTotal == 21) {
			hideCard = false;
			handOver = true;
			displayCards(hideCard);
			System.out.println("DEALER BLACKJACK!!! YOU LOSE!!!");

		}
	}

	private void playersTurn() {
		String userInput = "";
		playerTotal = player.getPlayerTotal();
		while (!userInput.equals("S") && playerTotal < 21) {
			System.out.println("Do you want to (S)tay or (H)it?");
			userInput = kb.next();
			switch (userInput) {
			case "H":
			case "h":
			case "Hit":
			case "hit":
				cardFromDealer = dealer.dealCard();
				player.addCardToPlayerHand(cardFromDealer);
				displayCards(hideCard);
				break;
			case "S":
			case "s":
			case "Stay":
			case "stay":
				userInput = "S";
				break;
			default:
				userInput = "";
				break;
			}
			playerTotal = player.getPlayerTotal();
		}

	}

	private void playAgain() {
		System.out.println("Press \"Y\" to play again, or any other key to exit");
		String playAgain = kb.next();
		if (!playAgain.equalsIgnoreCase("Y")) {
			kb.close();
			System.exit(0);
		}
		dealer.clearHand();
		player.clearHand();
		int cardsRemaining = dealer.getCardsRemaining();
		if (cardsRemaining < 15) {
			System.out.println("There are only " + cardsRemaining + " cards left in the deck.");
			String shuffleKey = "";
			while (!shuffleKey.equalsIgnoreCase("S")) {
				System.out.println("Press \"S\" to shuffle");
				shuffleKey = kb.next();
			}
			dealer.clearDeck();
			dealer.dealerInit();
		}
	}
}

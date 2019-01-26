package com.skilldistillery.cardgames.blackjack;

public class Game {
	private Dealer dealer;
	private Player player;

	public Game() {		
}
	
	public static void main(String[] args) {
	Game game = new Game();
	game.gameInit();
	}
	
	public void gameInit() {
		dealer = new Dealer();
		player = new Player();
		dealer.dealerInit();
		player.playerInit();
		
	}
}
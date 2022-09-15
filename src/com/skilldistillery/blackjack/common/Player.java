package com.skilldistillery.blackjack.common;

public class Player {
	private BJHand BJplayerHand = new BJHand();
	private Hand hand;

	public Player() {
	}

	public BJHand getBJPlayerHand() {
		return BJplayerHand;
	}

}

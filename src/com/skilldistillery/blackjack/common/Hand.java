package com.skilldistillery.blackjack.common;

import java.util.ArrayList;
import java.util.List;

public abstract class Hand {
	protected ArrayList<Card> hand;

	public Hand() {
		hand = new ArrayList<Card>();
	}
	
	public void add(Card dealCard) {
		hand.add(dealCard);
	}

	//abstract getHandTotal();

	public ArrayList<Card> getHand() {
		return hand;
	} 
	
}
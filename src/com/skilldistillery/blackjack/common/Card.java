package com.skilldistillery.blackjack.common;

import java.util.Objects;

public class Card {
	private Rank rank;
	private Suit suit;
	
	public Rank getRank() {
		return rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rank, suit);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		return rank == other.rank && suit == other.suit;
	}
	
	
	//I edited this so the cards don't shout at the player.
	//Normal type on screen, not all caps.
	@Override
	public String toString() {
		return rank.getDisplay() + " of " + suit;
	}
	
	public int getValue() {
		return rank.getValue();
	}
}

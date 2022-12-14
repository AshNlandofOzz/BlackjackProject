package com.skilldistillery.blackjack.common;

public enum Suit {
	HEARTS("Hearts"),
	SPADES("Spades"),
	CLUBS("Clubs"),
	DIAMONDS("Diamonds");
	
	String name;
	
	Suit(String name){
	this.name = name;
	}
			
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	
}

package com.skilldistillery.blackjack.common;

public enum Rank {
	TWO(2, "Two"), 
	THREE(3, "Three"), 
	FOUR(4, "Four"), 
	FIVE(5, "Five"), 
	SIX(6, "Six"), 
	SEVEN(7, "Seven"), 
	EIGHT(8, "Eight"), 
	NINE(9, "Nine"), 
	TEN(10, "Ten"), 
	JACK(10, "Jack"), 
	QUEEN(10, "Queen"), 
	KING(10, "King"), 
	ACE(11, "Ace");
	
	int value;
	String display;
	
	private Rank(int value, String display) {
		this.value = value;
		this.display = display;
	}
	
	public int getValue() {
		return value;
	}
	
	public String getDisplay() {
		return display;
	}
	
}

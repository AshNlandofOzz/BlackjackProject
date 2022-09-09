package com.skilldsitillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.common.Card;
import com.skilldistillery.blackjack.common.Deck;

public class DealingApp {

	public static void main(String[] args) {
		DealingApp thisApp = new DealingApp();
		thisApp.run();
		
	}
	
	private void run() {
		Deck deck = new Deck();
		deck.shuffle();
		Scanner scan = new Scanner(System.in);
		System.out.println("How many cards would you like");
		int userInput = scan.nextInt();
		if (userInput > 52) {
			System.out.println("That is invalid, pick a number of cards less than 52.");
			userInput = scan.nextInt();
		}
		
		List<Card> hand = new ArrayList<>(userInput);
		int total = 0;
		for(int i = 0; i < userInput; i++) {
			Card c = deck.dealCard();
			total += c.getValue();
			hand.add(c);
		}
		printTotal(hand, total);
	}
	
	private void printTotal(List<Card> hand, int value) {
		for (Card card : hand) {
			System.out.println(card);
		}
		System.out.println("Total value: " + value);
	}

}

package com.skilldistillery.blackjack.common;

import com.skilldsitillery.blackjack.app.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Dealer extends Player {
	private Deck deck;
	private BJHand dealerHand = new BJHand();

	public Dealer() {
		deck = new Deck();
		deck.shuffle();
	}

	public BJHand getHand() {
		return dealerHand;
	}

	public Deck getDeck() {
		return deck;
	}

	public void dealBJHand() {
		for (int i = 0; i < 2; i++) {
			getBJPlayerHand().add(deck.dealCard());
			dealerHand.add(deck.dealCard());
		}
	}

	public void informPlayerOfHand() {
		System.out.println("Your cards are: ");
		for (Card card : getBJPlayerHand().getHand()) {
			card.getValue();
			System.out.println(card);
		}
		System.out.println("The total of the cards is: " + getBJPlayerHand().getHandValue());
		System.out.println("Dealers face up card is: " + dealerHand.getHand().get(1).toString() + ". With a value of "
				+ dealerHand.getHand().get(1).getValue());
	}

	public void hitOrStand() {
		int option;
		do {
			System.out.println("Would you like to: ");
			System.out.println("1. Hit");
			System.out.println("2. Stand");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			sc.nextLine();
			if (option == 1) {
				getBJPlayerHand().add(deck.dealCard());
				System.out.println("Your cards are: ");
				for (Card card : getBJPlayerHand().getHand()) {
					card.getValue();
					System.out.println(card);
				}
				if (getBJPlayerHand().isBust()) {
					System.out.println("You busted.");
				}
				if (getBJPlayerHand().isBlackJack()) {
					System.out.println("You have BlackJack! Don't be stupid, stand now. "
							+ "You will win, unless the dealer also gets Black Jack.");
				}
				System.out.println("The total of your cards is: " + getBJPlayerHand().getHandValue());
			}
		} while (!getBJPlayerHand().isBust() && option != 2);
	}

	public void dealerPlay() {
		while (dealerHand.getHandValue() < 17) {
			dealerHand.add(deck.dealCard());
		}
		if (dealerHand.getHandValue() >= 17) {
			System.out.println("Dealers cards are: ");
			for (Card card : dealerHand.getHand()) {
				card.getValue();
				System.out.println(card);
			}
		}
		System.out.println("The total of the dealer cards is: " + dealerHand.getHandValue());
		getBJPlayerHand().determineWinner(getBJPlayerHand(), dealerHand);
	}

}

package com.skilldistillery.blackjack.unused;

import java.util.Scanner;

import com.skilldistillery.blackjack.common.BJHand;
import com.skilldistillery.blackjack.common.Card;
import com.skilldistillery.blackjack.common.Deck;
import com.skilldistillery.blackjack.common.Hand;
import com.skilldistillery.blackjack.common.Player;

public class BJDealer extends Player {
	private Deck deck;
	private BJHand dealerHand;
	
	public BJDealer() {
		deck = new Deck();
		deck.shuffle();
		dealerHand = new BJHand();
	}
	
	@Override
	public Hand getHand() {
		// TODO Auto-generated method stub
		return super.getHand();
	}

	public Deck getDeck() {
		// TODO Auto-generated method stub
		return deck;
	}

	public void dealBJHand() {
		for (int i = 0; i < 2; i++) {
			getPlayerHand().add(deck.dealCard());
			dealerHand.add(deck.dealCard());
		}
		System.out.println("Your cards are: ");
		for (Card card : getPlayerHand().getHand()) {
			card.getValue();
			System.out.println(card);
		}
		System.out.println("The total of the cards is: " + getPlayerHand().getHandValue());
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
				getPlayerHand().add(deck.dealCard());
				System.out.println("Your cards are: ");
				for (Card card : getPlayerHand().getHand()) {
					card.getValue();
					System.out.println(card);
				}
				if (getPlayerHand().isBust()) {
					System.out.println("You busted.");
				}
				if(getPlayerHand().isBlackJack()) {
					System.out.println("You have BlackJack!");
				}
				System.out.println("The total of your cards is: " + getPlayerHand().getHandValue());
			}
		} while (!getPlayerHand().isBust() && option != 2 && !getPlayerHand().isBlackJack()); 
	}

	}


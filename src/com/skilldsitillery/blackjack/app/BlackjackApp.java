package com.skilldsitillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.common.Card;
import com.skilldistillery.blackjack.common.Dealer;
import com.skilldistillery.blackjack.common.Deck;
import com.skilldistillery.blackjack.common.Hand;
import com.skilldistillery.blackjack.common.BJHand;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp thisApp = new BlackjackApp();
		thisApp.run();

	}

	private void run() {
		Deck deck = new Deck();
		BJHand playerHand = new BJHand();
		BJHand dealerHand = new BJHand();
		Scanner scan = new Scanner(System.in);
		deck.shuffle();
		for (int i = 0; i < 2; i++) {
			playerHand.add(deck.dealCard());
			dealerHand.add(deck.dealCard());
		}
		System.out.println("Your cards are: ");
		for (Card card : playerHand.getHand()) {
			card.getValue();
			System.out.println(card);
		}
		System.out.println("The total of the cards is: " + playerHand.getHandValue());
		System.out.println("Dealers face up card is: " + dealerHand.getHand().get(1).toString() + ". With a value of "
				+ dealerHand.getHand().get(1).getValue());
		int option = 1;
		while (option == 1 /*&& !playerHand.isBust()*/) {
		System.out.println("Would you like to: ");
		System.out.println("1. Hit");
		System.out.println("2. Stand");
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		sc.nextLine();
		switch (option) {
		case 1:
			playerHand.add(deck.dealCard());
			System.out.println("Your cards are: ");
			for (Card card : playerHand.getHand()) {
				card.getValue();
				System.out.println(card);
			}
			if(playerHand.isBust()) {
				System.out.println("You busted.");
			}
			System.out.println("The total of your cards is: " + playerHand.getHandValue());
			break;
		case 2:
			if (dealerHand.getHandValue() < 17) {
				dealerHand.add(deck.dealCard());
				System.out.println("Dealers cards are: ");
				for (Card card : dealerHand.getHand()) {
					card.getValue();
					System.out.println(card);
				}
			} else if (dealerHand.getHandValue() >= 17) {
				System.out.println("Dealers cards are: ");
				for (Card card : dealerHand.getHand()) {
					card.getValue();
					System.out.println(card);
				}
			}
			System.out.println("The total of the dealer cards is: " + dealerHand.getHandValue());
			break;

		}
		}
		playerHand.determineWinner(playerHand, dealerHand);
//			System.out.println("How many cards would you like");
//			int userInput = scan.nextInt();
//			if (userInput > 52) {
//				System.out.println("That is invalid, pick a number of cards less than 52.");
//				userInput = scan.nextInt();
//			}
//			
//			List<Card> hand = new ArrayList<>(userInput);
//			int total = 0;
//			for(int i = 0; i < userInput; i++) {
//				Card c = deck.dealCard();
//				total += c.getValue();
//				hand.add(c);
//			}
//			printTotal(hand, total);
	}

}

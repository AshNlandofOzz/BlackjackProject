package com.skilldsitillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.common.Card;
import com.skilldistillery.blackjack.common.Deck;
import com.skilldistillery.blackjack.common.Hand;
import com.skilldistillery.blackjack.common.BJHand;

public class BlackjackApp {

	public static void main(String[] args) {
		BlackjackApp thisApp = new BlackjackApp();
		int option = 0;
		thisApp.run();
		thisApp.menu();
		Scanner sc = new Scanner(System.in);
		option = sc.nextInt();
		sc.nextLine();
		while (option == 1) {
			thisApp.run();
			thisApp.menu();
			option = sc.nextInt();
			sc.nextLine();
		}
		if (option != 1) {
			System.out.println("Thank you for playing.");
			sc.close();
		}
		
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
		int option;
		do {
			System.out.println("Would you like to: ");
			System.out.println("1. Hit");
			System.out.println("2. Stand");
			Scanner sc = new Scanner(System.in);
			option = sc.nextInt();
			sc.nextLine();
			if (option == 1) {
				playerHand.add(deck.dealCard());
				System.out.println("Your cards are: ");
				for (Card card : playerHand.getHand()) {
					card.getValue();
					System.out.println(card);
				}
				if (playerHand.isBust()) {
					System.out.println("You busted.");
				}
				if(playerHand.isBlackJack()) {
					System.out.println("You have BlackJack!");
				}
				System.out.println("The total of your cards is: " + playerHand.getHandValue());
			}
		} while (!playerHand.isBust() && option != 2 && !playerHand.isBlackJack()); 
		while (dealerHand.getHandValue() < 17) {
			dealerHand.add(deck.dealCard());}
		 if (dealerHand.getHandValue() >= 17) {
			System.out.println("Dealers cards are: ");
			for (Card card : dealerHand.getHand()) {
				card.getValue();
				System.out.println(card);
			}
		}
		System.out.println("The total of the dealer cards is: " + dealerHand.getHandValue());
		playerHand.determineWinner(playerHand, dealerHand);
		
	}
	public void menu() {
		System.out.println("Would you like to play again?");
		System.out.println("1: Yes");
		System.out.println("Any other number: exit");
	}
}
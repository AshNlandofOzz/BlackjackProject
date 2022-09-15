package com.skilldsitillery.blackjack.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.skilldistillery.blackjack.common.Card;
import com.skilldistillery.blackjack.common.Dealer;
import com.skilldistillery.blackjack.common.Deck;
import com.skilldistillery.blackjack.common.Hand;
import com.skilldistillery.blackjack.common.Player;
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
		Dealer BJDealer = new Dealer();
		BJDealer.dealBJHand();
		BJDealer.informPlayerOfHand();
		BJDealer.hitOrStand();
		BJDealer.dealerPlay();
	}
	
	public void menu() {
		System.out.println("Would you like to play again?");
		System.out.println("1: Yes");
		System.out.println("Any other number: exit");
	}
}
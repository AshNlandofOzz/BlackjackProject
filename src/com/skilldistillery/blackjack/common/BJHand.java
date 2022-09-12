package com.skilldistillery.blackjack.common;

public class BJHand extends Hand {

	public BJHand() {
		
	}

	public int getHandValue() {
		int numAces = 0;
		int total = 0;
		boolean done = false;
		for (Card card : hand) {
			if (card.getRank() == Rank.ACE) {
				numAces++;
			}
		}
		for (Card card : hand) {
			if (card.getRank() != Rank.ACE) {
				total += card.getValue();
			}
		}
		if (numAces > 0) {
			for (int i = 0; i <= numAces; i++) {
				if (total + i + ((numAces - i) * 11) <= 21 && !done) {
					total += (i + ((numAces - i) * 11));
					done = true;
				}
				if (i == numAces && !done) {
					total += numAces;
					done = true;
				}
			}
		}
		return total;
	}

	public void getCardValue() {
		for (Card card : hand) {
			System.out.println(card.getValue());
		}
	}

	public boolean isBlackJack() {
		if (this.getHandValue() == 21) {
			return true;
		}
		return false;
	}

	public boolean isBust() {
		if (this.getHandValue() > 21) {
			return true;
		}
		return false;
	}

	public boolean determineWinner(BJHand player, BJHand dealer) {
		if (player.isBust()) {
			System.out.println("The winner is the Dealer. You busted.");
			return true;
		} else {
			if (dealer.isBust()) {
				System.out.println("The dealer busted. Player is the winner!");
				return true;
			} else if (player.getHandValue() > dealer.getHandValue()) {
				System.out.println("The winner is: Player");
				return true;
			} else if (player.getHandValue() < dealer.getHandValue()) {
				System.out.println("The winner is: Dealer");
				return false;
			} else if (dealer.isBust() && player.isBust()) {
				System.out.println("The winner is: Dealer. When a player and dealer bust simultaneously, dealer wins.");
				return false;
			} else if (player.getHandValue() == dealer.getHandValue()) {
				System.out.println("It is a tie. Keep your money.");
				return false;
			}
		}
		return true;
	}

}

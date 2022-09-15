package com.skilldistillery.blackjack.common;

public class BJHand extends Hand {

	public BJHand() {
	}

	//This accounts for the total value of the hands and 
	//changes the ace value accordingly.
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
	
	//While I do determine BlackJack, it does not automatically result in a win.
	//It will result in a win or a push if both dealer and player have Black Jack 
	//and it leaves room to add more players who may also have Black Jack at the table.
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
			System.out.println("The winner is the Dealer. "
					+ "You busted. Even if the Dealer also busts. Boooooooo!");
			return true;
		} else {
			if (dealer.isBust()) {
				System.out.println("The dealer busted. Player is the winner! Huuuuzzzzaahh!!");
				return true;
			} else if (player.getHandValue() > dealer.getHandValue()) {
				System.out.println("The winner is: Player");
				return true;
			} else if (player.getHandValue() < dealer.getHandValue()) {
				System.out.println("The winner is: Dealer");
				return false;
			} else if (player.getHandValue() == dealer.getHandValue()) {
				System.out.println("It is a tie. Keep your money.");
				return false;
			}
		}
		return true;
	}

}

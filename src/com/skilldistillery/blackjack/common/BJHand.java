package com.skilldistillery.blackjack.common;

public class BJHand extends Hand {

	public BJHand() {
		// TODO Auto-generated constructor stub
	}

//	@Override
//	void add() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//	public void add(Card dealCard) {
//		hand.add(dealCard);
//	}

	public int getHandValue() {
		int total = 0;
		for (Card card : hand) {
			total += card.getValue();
			//System.out.println(card);
		}
		//System.out.println("Total value: " + total);
		return total;
		}
	
	public void getCardValue() {
		for (Card card : hand) {
		System.out.println(card.getValue());}
	}
	
	public boolean isBlackJack() {
		if (this.getHandValue() == 21) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean isBust() {
		if (this.getHandValue() > 21) {
			return true;
		}
		return false;
	}
	
	public boolean determineWinner(BJHand player, BJHand dealer){
		if (player.getHandValue() > dealer.getHandValue() && !player.isBust()) {			
			System.out.println("The winner is: Player");
			return true;
		}
		else if (player.getHandValue() < dealer.getHandValue() && !dealer.isBust()) {
			System.out.println("The winner is: Dealer");
			return false;
		}
		return true;
	}

}

package com.example.main;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<>();

	public void addCard(Card card) {
		hand.add(card);
	}

	public List<Card> getHand() {
		return hand;
	}
}

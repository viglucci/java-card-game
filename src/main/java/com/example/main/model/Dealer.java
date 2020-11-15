package com.example.main.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dealer {

	private Deck deck;

	public Dealer(Deck deck) {
		this.deck = deck;
	}

	public void shuffleDeck() {
		Collections.shuffle(deck.getCards());
	}

	public Deck getDeck() {
		return deck;
	}

	public List<Card> dealCards(int numberOfCards) {
		List<Card> cards = new ArrayList<>();
		for (int i = 0; i < numberOfCards; i++) {
			cards.add(this.deck.getNext());
		}
		return cards;
	}
}

package com.example.main.model;

import java.util.Collections;
import java.util.Stack;

public class Deck {

	private Stack<Card> cards = new Stack<>();

	public static Deck generate() {
		String[] suit = {"Diamonds", "Clubs", "Hearts", "Spades"};
		String[] faceValues = {
				"One", "Two", "Three", "Four", "Five",
				"Six", "Seven", "Eight", "Nine", "Ten",
				"Jack", "Queen", "King"
		};

		Deck deck = new Deck();
		for (String currentSuit : suit) {
			for (String currentFaceValue : faceValues) {
				Card card = new Card(currentSuit, currentFaceValue);
				deck.addCard(card);
			}
		}

		return deck;
	}

	public Card getNext() {
		return cards.pop();
	}

	public int size() {
		return cards.size();
	}

	public void addCard(Card card) {
		cards.add(card);
	}

	public Card peekCard() {
		return cards.peek();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
}

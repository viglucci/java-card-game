package com.example.main.model;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private String name = "";
	private List<Card> hand = new ArrayList<>();

	public Player() {}

	public Player(String name) {
		this.name = name;
	}

	public Player(List<Card> hand) {
		this.hand = hand;
	}

	public void addCard(Card card) {
		hand.add(card);
	}

	public List<Card> getHand() {
		return hand;
	}

	public void replaceHand(List<Card> newHand) {
		hand = newHand;
	}

	public String getName() {
		return name;
	}
}

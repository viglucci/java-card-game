package com.example.main.model;

public class Card {
	private final String suit;
	private final String faceValue;

	public Card(String suit, String faceValue) {
		this.suit = suit;
		this.faceValue = faceValue;
	}

	public String getSuit() {
		return suit;
	}

	public String getFaceValue() {
		return faceValue;
	}

	public String getDisplayText()
	{
		return faceValue + " of " + suit;
	}
}

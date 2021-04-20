package com.example.main.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CardTest {

	@Test
	void test_can_retrieve_suit() {
		Card card = new Card("Hearts", "King");

		assertThat(card.getSuit()).isEqualTo("Hearts");
	}

	@Test
	void test_can_retrieve_face_value() {
		Card card = new Card("Spades", "One");

		assertThat(card.getFaceValue()).isEqualTo("One");
	}

	@Test
	void test_can_retrieve_display_text() {
		Card card = new Card("Diamonds", "Queen");

		assertThat(card.getDisplayText()).isEqualTo("Queen of Diamonds");
	}
}

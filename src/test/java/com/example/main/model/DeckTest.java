package com.example.main.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeckTest {

	@Test
	void test_can_generate_a_deck_of_52_cards() {
		Deck deck = Deck.generate();

		assertThat(deck.size()).isEqualTo(52);
	}

	@Test
	void test_can_retrieve_the_size_of_the_deck() {
		Deck deck = Deck.generate();
		deck.getNext();
		deck.getNext();
		deck.getNext();

		assertThat(deck.size()).isEqualTo(49);
	}

	@Test
	void test_can_peek_the_top_card_of_the_deck() {
		Deck deck = Deck.generate();
		Card topCard = deck.peekCard();

		assertThat(deck.size()).isEqualTo(52);
		assertThat(topCard.getSuit()).isNotNull();
	}
}
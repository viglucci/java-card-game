package com.example.main.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class DealerTest {

	@Test
	void test_can_retrieve_the_deck() {
		Dealer dealer = new Dealer(Deck.generate());

		assertThat(dealer.getDeck())
				.withFailMessage("Expected the dealers deck to not be null")
				.isNotNull();
	}

	@Test
	void test_can_shuffle_deck_without_throwing_exception() {
		Dealer dealer = new Dealer(Deck.generate());
		dealer.shuffleDeck();

		assertThat(dealer.getDeck()).isNotNull();
		assertThat(dealer.getDeck().getCards()).isNotNull();
	}

	@Test
	void test_can_deal_cards() {
		Dealer dealer = new Dealer(Deck.generate());
		dealer.shuffleDeck();

		List<Card> cards = dealer.dealCards(5);
		assertThat(cards.size()).isEqualTo(5);
	}
}
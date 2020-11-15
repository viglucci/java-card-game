package com.example.main.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

	@Test
	void test_can_add_card_to_hand() {
		Player player = new Player();
		player.addCard(new Card("Hearts", "King"));
		player.addCard(new Card("Spade", "One"));

		assertThat(player.getHand().size()).isEqualTo(2);
	}

	@Test
	void test_can_replace_hand() {
		List<Card> originalHand = new ArrayList<Card>(Arrays.asList(
				new Card("Diamond", "King"),
				new Card("Hearts", "Three")
		));
		Player player = new Player(originalHand);

		assertThat(player.getHand().size()).isEqualTo(2);

		List<Card> newHand = new ArrayList<Card>(Arrays.asList(
				new Card("Spades", "King"),
				new Card("Hearts", "Nine")
		));
		player.replaceHand(newHand);

		assertThat(player.getHand().size()).isEqualTo(2);
		assertThat(player.getHand())
				.extracting(Card::getDisplayText)
				.containsExactly(
					"King of Spades",
					"Nine of Hearts"
				);
	}
}
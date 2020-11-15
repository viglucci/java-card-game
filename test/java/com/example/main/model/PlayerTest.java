package com.example.main.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PlayerTest {

	@Test
	void test_can_add_card_to_hand() {
		Player player = new Player();
		player.addCard(new Card("Hearts", "King"));
		player.addCard(new Card("Spade", "One"));

		assertThat(player.getHand().size()).isEqualTo(2);
	}
}
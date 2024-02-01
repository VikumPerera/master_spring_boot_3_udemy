package com.udemy.dto.game;

public class GameRunner {
	
	private SuperContra game;
	
	public GameRunner(SuperContra game) {
		this.game = game;
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}

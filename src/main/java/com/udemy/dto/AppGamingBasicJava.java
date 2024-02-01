package com.udemy.dto;

import com.udemy.dto.game.GameRunner;
import com.udemy.dto.game.MarioGame;
import com.udemy.dto.game.SuperContra;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var marioGame = new MarioGame();
		var superContra = new SuperContra();
		var gameRunner = new GameRunner(superContra);
		gameRunner.run();

	}

}

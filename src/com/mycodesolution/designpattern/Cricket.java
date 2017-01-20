package com.mycodesolution.designpattern;

public class Cricket extends Game {

	@Override
	void initialize() {
		System.out.println("Cricket Game initialize Start playing");
	}

	@Override
	void startPlay() {
		System.out.println("Cricket Game Started,  Enjoy the game!");
	}

	@Override
	void endPlay() {
		System.out.println("Cricket Game Finised");
	}

}

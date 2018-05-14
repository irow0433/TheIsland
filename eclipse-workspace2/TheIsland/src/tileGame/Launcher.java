package tileGame;

import Display.Display;

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("Title Game!", 1000, 800);
		game.start();
	}

}

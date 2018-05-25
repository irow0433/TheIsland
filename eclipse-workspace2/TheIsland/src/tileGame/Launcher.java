package tileGame;

import java.io.FileInputStream;
import java.io.IOException;
import sun.audio.*;
import tileGame.Sound;

import Display.Display;

public class Launcher {
	public static void main(String[] args) {
		Game game = new Game("Title Game!", 500, 400);
		game.start();
	}
	
//	public static void music() {
//		AudioPlayer MGP = AudioPlayer.player;
//		AudioStream BGM;
//		AudioData MD;
//		
//		ContinousAudioDataStream  loop = null;
//		
//		try {
//			BGM = new AudioStream(new FileInputStream("/res/music.wav"));
//			MD = BGM.getData();
//			loop = new ContinousAudioDataStream(MD);
//		}catch(IOException e){
//			System.out.println("cant find the file");
//			
//		}
//	}

}

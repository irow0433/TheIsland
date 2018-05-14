package tileGame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage player, water, grass, sand;

	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/BestSpriteSheet.png"));
		
		//PLAYER SPRITES PROVIDED BY: AddFact
		player = sheet.crop(width * 0, 0, width, height);
		
		water = sheet.crop(width * 1, 0, width, height);
		sand = sheet.crop(width * 3, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		//sand = sheet.crop(0, 3, width, height);
	}
}
	

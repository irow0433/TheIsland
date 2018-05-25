package tileGame.gfx;

import java.awt.image.BufferedImage;

public class Assets {
	
	private static final int width = 32, height = 32;
	
	public static BufferedImage  water, grass, sand, bush, tree;
	public static BufferedImage[] player_down, player_up, player_left, player_right, player_still;
	public static BufferedImage[] lama_down, lama_up, lama_left, lama_right, lama_still;
//	public static BufferedImage[] water_up, water_down;
	
	public static void init(){
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/tiles.png"));
		// Same thing for Tile animations
		player_down = new BufferedImage[3];
		player_up = new BufferedImage[3];
		player_left = new BufferedImage[3];
		player_right = new BufferedImage[3];
		player_still = new BufferedImage[1];
		
//		water_up = new BufferedImage[2];
//		water_down = new BufferedImage[2];
		
		player_down[0] = sheet.crop(width * 5, height * 1, width, height);
		player_down[1] = sheet.crop(width * 6, height * 1, width, height);
		player_down[2] = sheet.crop(width * 7, height * 1, width, height);
		player_up[0] = sheet.crop(width * 7, height * 1, width, height);
		player_up[1] = sheet.crop(width * 6, height * 1, width, height);
		player_up[2] = sheet.crop(width * 5, height * 1, width, height);
		player_left[0] = sheet.crop(width * 5, height * 0, width, height);
		player_left[1] = sheet.crop(width * 6, height * 0, width, height);
		player_left[2] = sheet.crop(width * 7, height * 0, width, height);
		player_right[0] = sheet.crop(width * 5, height * 0, width, height);
		player_right[1] = sheet.crop(width * 6, height * 0, width, height);
		player_right[2] = sheet.crop(width * 7, height * 0, width, height);
		player_still[0] = sheet.crop(width * 5, height * 0, width, height);
		
//		water_up[0] = sheet.crop(width * 3, height * 0, width, height);
//		water_up[1] = sheet.crop(width * 3, height * 1, width, height);
//		
//		water_down[0] = sheet.crop(width * 3, height * 1, width, height);
//		water_down[1] = sheet.crop(width * 3, height * 0, width, height);
		
		lama_down = new BufferedImage[3];
		lama_up = new BufferedImage[3];
		lama_left = new BufferedImage[3];
		lama_right = new BufferedImage[3];
		lama_still = new BufferedImage[1];
		
		lama_down[0] = sheet.crop(width* 5, height * 3, width, height);
		lama_down[1] = sheet.crop(width* 6, height * 3, width, height);
		lama_down[2] = sheet.crop(width* 7, height * 3, width, height);
		lama_up[0] = sheet.crop(width* 5, height * 2, width, height);
		lama_up[1] = sheet.crop(width* 5, height * 2, width, height);
		lama_up[2] = sheet.crop(width* 5, height * 2, width, height);
		lama_left[0] = sheet.crop(width* 5, height * 2, width, height);
		lama_left[1] = sheet.crop(width* 5, height * 2, width, height);
		lama_left[2] = sheet.crop(width* 5, height * 2, width, height);
		lama_right[0] = sheet.crop(width* 5, height * 2, width, height);
		lama_right[1] = sheet.crop(width* 5, height * 2, width, height);
		lama_right[2] = sheet.crop(width* 5, height * 2, width, height);
		lama_still[0] = sheet.crop(width * 5, height * 3, width, height);
		
		water = sheet.crop(width * 3, 0, width, height);
		sand = sheet.crop(width * 1, 0, width, height);
		grass = sheet.crop(width * 2, 0, width, height);
		bush = sheet.crop(width * 4, 0, width, height);
		tree = sheet.crop(width * 0, height * 2, width, height);
//		palmGreen = sheet.crop(width * 1, height * 1, width, height);
//		palmYellow = sheet.crop(width * 0, height * 1, width, height);
		//sand = sheet.crop(0, 3, width, height);
		
	}
}
	

package tileGame.tiles;

//import java.awt.Graphics;
//import java.awt.image.BufferedImage;
//
//import tileGame.Handler;
//import tileGame.gfx.Animation;
import tileGame.gfx.Assets;

public class WaterTile extends Tile {
	
//	private Animation animUp, animDown;
	
	public WaterTile(int id) {
		super(Assets.water, id);
		
		//Animations
		
//		animDown = new Animation(500, Assets.water_up);
//		animUp = new Animation(500, Assets.water_down);
	}
	
//	private void getInput(){
//		xMove = 0;
//		yMove = 0;
//		
//		//Movement
//		getInput();
//		move();
//		handler.getGameCamera().centerOnEntity(this);
//		
//	}
	
//	public void tick() {
//		animUp.tick();
//		animDown.tick();
//		
//	}
//	
//	public void render(Graphics g) {
//		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer)
//	}
	
//	private BufferedImage getCurrentAnimationFrame() {
//		if(xMove < 0) {
//			return animUp.getCurrentFrame();
//		}else {
//			return animDown.getCurrentFrame();
//		}
//	}
	
	
	
	
	public boolean isSolid() {
		return true;
	}



}

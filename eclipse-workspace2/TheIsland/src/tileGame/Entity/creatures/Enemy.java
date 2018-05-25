package tileGame.Entity.creatures;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import tileGame.Handler;
import tileGame.gfx.Animation;
import tileGame.gfx.Assets;

public class Enemy extends Creature {
	
	//Animations
	private Animation animDown, animUp, animLeft, animRight, animStill;
	
	public Enemy(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		bounds.x = 16;
		bounds.y = 32;
		bounds.width = 64;
		bounds.height = 64;
		
		//Animation
		animDown = new Animation(300, Assets.lama_down);
		animUp = new Animation(300, Assets.lama_up);
		animLeft = new Animation(300, Assets.lama_left);
		animRight = new Animation(300, Assets.lama_right);
		animStill = new Animation(300, Assets.lama_still);
		
		
		
	}

	@Override
	public void tick() {
		//Animation
		animDown.tick();
		animUp.tick();
		animLeft.tick();
		animRight.tick();
		animStill.tick();
		//Movement
		//getInput();
		move();
		//handler.getGameCamera().centerOnEntity(this);
	}
	
//	private void getInput(){
//		xMove = 0;
//		yMove = 0;
//		
//		if(handler.getKeyManager().up)
//			yMove = -speed;
//		if(handler.getKeyManager().down)
//			yMove = speed;
//		if(handler.getKeyManager().left)
//			xMove = -speed;
//		if(handler.getKeyManager().right)
//			xMove = speed;
//	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(getCurrentAnimationFrame(), (int) (x - handler.getGameCamera().getxOffset()), (int) (y - handler.getGameCamera().getyOffset()), width, height, null);
		
//		g.setColor(Color.red);
//		g.fillRect((int) (x + bounds.x - handler.getGameCamera().getxOffset()),
//				(int) (y + bounds.y - handler.getGameCamera().getyOffset()),
//				bounds.width, bounds.height);
	}
	
	private BufferedImage getCurrentAnimationFrame() {
		if(xMove < 0) {
			return animLeft.getCurrentFrame();
		}else if(xMove > 0) {
			return animRight.getCurrentFrame();
		}else if(yMove < 0) {
			return animUp.getCurrentFrame();
		}else if(yMove > 0) {
			return animDown.getCurrentFrame();
		}else {
			return animStill.getCurrentFrame();
		}
	}

}
package tileGame.Entity.entities.statics;

import tileGame.Handler;
import tileGame.Entity.Entity;

public abstract class StaticEntity extends Entity{
	
	
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
	super(handler, x, y, width, height);
}

}
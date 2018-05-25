package tileGame.state;

import java.awt.Graphics;

import tileGame.Handler;
import tileGame.Entity.creatures.Player;
import tileGame.Entity.entities.statics.Tree;
import tileGame.worlds.World;

public class GameState extends State {
	
	private World world;
	

	public GameState(Handler handler) {
		super(handler);
		world = new World(handler, "res/world/world1.txt");
		handler.setWorld(world);
		
		
		
		
		
	}
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		world.tick();
		
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		
	}
	
	

}

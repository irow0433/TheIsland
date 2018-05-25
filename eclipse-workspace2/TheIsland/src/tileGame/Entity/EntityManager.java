package tileGame.Entity;

import java.awt.Graphics;
import java.util.ArrayList;

import tileGame.Handler;
import tileGame.Entity.creatures.Enemy;
import tileGame.Entity.creatures.Player;

public class EntityManager {
	
	private Handler handler;
	private Player player;
	private Enemy enemy;
	private ArrayList<Entity> entities;
	
	
	public EntityManager(Handler handler, Player player) {
		this.handler = handler;
		this.player = player;
		entities = new ArrayList<Entity>();
	}
//	
//	public EntityManager(Handler handler, Enemy enemy) {
//		this.handler = handler;
//		this.enemy = enemy;
//		entities = new ArrayList<Entity>();
//	}
	
	public void tick() {
		for(int i = 0; i < entities.size(); i++) {
			Entity e = entities.get(i);
			e.tick();
		}
		player.tick();
	}
	
	public void render(Graphics g) {
		for(Entity e : entities) {
			e.render(g);
		}
		player.render(g);
//		enemy.render(g);
	}
	
	public void addEntity(Entity e) {
		entities.add(e);
	}
	
	//Getters and setters

	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	
//	public Enemy getEnemy() {
//		return enemy;
//	}
//	
//	public void setEnemy(Enemy enemy) {
//		this.enemy = enemy;
//	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}

}

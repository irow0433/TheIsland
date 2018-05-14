package tileGame.tiles;

import tileGame.gfx.Assets;

public class WaterTile extends Tile {
	
	public WaterTile(int id) {
		super(Assets.water, id);
		
	}
	
	public boolean isSolid() {
		return true;
	}



}

package tileGame.tiles;

import tileGame.gfx.Assets;

public class SandTile extends Tile{
	
	public SandTile( int id) {
		super(Assets.sand, id);
	}
	
	
	
	public boolean isSolid() {
		return false;
	}
}

package game.arenas;

import utilities.EnumContainer.*;

public class NavalArena extends Arena {

	private Water water;
	private SurfaceW surface;
	private Body body;
	
	protected NavalArena(double length, int maxRacers) {
			super(length, maxRacers,0.7);
			this.setBody(Body.LAKE);
			this.setWater(Water.SWEET);
			this.setSurface(SurfaceW.FLAT);;
		
		// TODO verifier pour friction et pour les enum
		
		
	}
	protected NavalArena() {
		super(1000,5,0.7);
		this.setBody(Body.LAKE);
		this.setWater(Water.SWEET);
		this.setSurface(SurfaceW.FLAT);;
	
	}

	
	
	// getter and setter 
	public Water getWater() {
		return water;
	}


	public void setWater(Water water) {
		this.water = water;
	}


	public SurfaceW getSurface() {
		return surface;
	}


	public void setSurface(SurfaceW surface) {
		this.surface = surface;
	}


	public Body getBody() {
		return body;
	}


	public void setBody(Body body) {
		this.body = body;
	}
	
	
	
	
}

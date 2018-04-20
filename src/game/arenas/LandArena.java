package game.arenas;

import utilities.EnumContainer.*;

public class LandArena extends Arena {

	
	private Coverage coverage;
	private SurfaceL surface;
	
	
	
	
	
	protected LandArena() {
		super(1000,8,0.5);
		//TODO verifier taille par default
		
		this.setSurface(SurfaceL.FLAT);
		this.setCoverage(Coverage.GRASS);
	
	}

	protected LandArena(double length, int maxRacers) {
		super(length, maxRacers,0.5);
		this.setSurface(SurfaceL.FLAT);
		this.setCoverage(Coverage.GRASS);
		
		// TODO verifier pour friction et pour les enum
	}

	

	
	
	
	
	

	//getter and setter
	public Coverage getCoverage() {
		return coverage;
	}


	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}


	public SurfaceL getSurface() {
		return surface;
	}


	public void setSurface(SurfaceL surface) {
		this.surface = surface;
	}


}

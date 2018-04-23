package game.arenas;

import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.land.LandRacer;
import utilities.EnumContainer.*;

public class LandArena extends Arena {

	
	private Coverage coverage;
	private SurfaceL surface;
	
	
	
	
	
	protected LandArena() {
		super(800,8,0.5);
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

	@Override
	public void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException {
		
		try {
			LandRacer test=(LandRacer)newRacer;
			if(activeRacers.size()+completedRacers.size()>MAX_RACERS)
			{
				throw new RacerLimitException(Integer.toString(activeRacers.size()), Integer.toString(newRacer.getSerialNumber()));	
			}
			activeRacers.add((Racer) test);
		} catch (ClassCastException e) {
			throw new RacerTypeException(newRacer.getClass().getSimpleName(), "Land Arena");
		}
		
	}
	

}

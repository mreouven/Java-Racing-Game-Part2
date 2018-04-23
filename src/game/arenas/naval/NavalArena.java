package game.arenas.naval;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.naval.NavalRacer;
import utilities.EnumContainer.*;

public class NavalArena extends Arena {

	private Water water;
	private SurfaceW surface;
	private Body body;
	
	public NavalArena(double length, int maxRacers) {
			super(length, maxRacers,0.7);
			this.setBody(Body.LAKE);
			this.setWater(Water.SWEET);
			this.setSurface(SurfaceW.FLAT);;
		
		// TODO verifier pour friction et pour les enum
		
		
	}
	public NavalArena() {
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
	
	@Override
	public void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException {
		
		try {
			NavalRacer test=(NavalRacer)newRacer;
			if(activeRacers.size()+completedRacers.size()>MAX_RACERS)
			{
				throw new RacerLimitException(Integer.toString(activeRacers.size()), Integer.toString(newRacer.getSerialNumber()));	
			}
			activeRacers.add((Racer) test);
		} catch (ClassCastException e) {
			throw new RacerTypeException(newRacer.getClass().getSimpleName(), "Naval Arena");
		}
		
	}
	
	
	
	
}

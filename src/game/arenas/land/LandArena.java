package game.arenas.land;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.land.LandRacer;
import utilities.EnumContainer.*;
/** Represents an LandArena.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class LandArena extends Arena {

	
	private Coverage coverage;
	private SurfaceL surface;
	
	
	private final static double DEFAULT_FRICTION=0.5;
	private final static double DEFAULT_LENGHT=800;
	private final static int DEFAULT_MAX_RACER=8;
	
	
	public LandArena() {
		super(DEFAULT_LENGHT,DEFAULT_MAX_RACER,DEFAULT_FRICTION);
		this.setSurface(SurfaceL.FLAT);
		this.setCoverage(Coverage.GRASS);
	
	}

	public LandArena(double length, int maxRacers) {
		super(length, maxRacers,DEFAULT_FRICTION);
		this.setSurface(SurfaceL.FLAT);
		this.setCoverage(Coverage.GRASS);
		
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

	/**
	   * This is the main method which makes use of addNum method.
	   * @param Racer newRacer.
	   * @return Nothing.
	   * @exception RacerLimitException RacerTypeException On input error.
	   * @see RacerTypeException 
	   * @see RacerLimitException
	   */
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

package game.arenas.naval;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.naval.NavalRacer;
import utilities.EnumContainer.*;
/** Represents an Naval Arena.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class NavalArena extends Arena {

	private Water water;
	private SurfaceW surface;
	private Body body;
	
	private final static double DEFAULT_FRICTION=0.7;
	private final static double DEFAULT_LENGHT=1000;
	private final static int DEFAULT_MAX_RACER=5;
	
	public NavalArena(double length, int maxRacers) {
			super(length, maxRacers,DEFAULT_FRICTION);
			this.setBody(Body.LAKE);
			this.setWater(Water.SWEET);
			this.setSurface(SurfaceW.FLAT);
	}
	public NavalArena() {
		super(DEFAULT_LENGHT,DEFAULT_MAX_RACER,DEFAULT_FRICTION);
		this.setBody(Body.LAKE);
		this.setWater(Water.SWEET);
		this.setSurface(SurfaceW.FLAT);
	
	}

	
	
	/**
	 * GETTER
	 * @return water
	 */
	public Water getWater() {
		return water;
	}

	/**
	 * SETTER
	 * @param water
	 */
	public void setWater(Water water) {
		this.water = water;
	}

	/**
	 * GETTER
	 * @return surface
	 */
	public SurfaceW getSurface() {
		return surface;
	}

	/**
	 * SETTER
	 * @param surface
	 */
	public void setSurface(SurfaceW surface) {
		this.surface = surface;
	}

	/**
	 * GETTER
	 * @return body
	 */
	public Body getBody() {
		return body;
	}

	/**
	 * SETTER
	 * @param body
	 */
	public void setBody(Body body) {
		this.body = body;
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

package game.arenas.air;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.air.AerialRacer;
import utilities.EnumContainer.*;
/** Represents an Aeial Arena.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class AerialArena extends Arena {

	private final static double DEFAULT_FRICTION=0.4;
	private final static double DEFAULT_LENGHT=1500;
	private final static int DEFAULT_MAX_RACER=6;
	
	private Vision vision;
	private Weather weather;
	private Height height;
	private Wind wind;
	
	

	public AerialArena(double length, int maxRacers) {
		super(length, maxRacers,0.4);
		this.setVision(Vision.SUNNY);
		this.setWeather(Weather.DRY);
		this.setHeight(Height.HIGH);
		this.setWind(Wind.HIGH);
	}

	
	public AerialArena() {
		super(DEFAULT_LENGHT,DEFAULT_MAX_RACER,DEFAULT_FRICTION);
		this.setVision(Vision.SUNNY);
		this.setWeather(Weather.DRY);
		this.setHeight(Height.HIGH);
		this.setWind(Wind.HIGH);
	}
	
	
	/**
	 * GETTER
	 * @return Vision
	 */
	public Vision getVision() {
		return vision;
	}
	/**
	 * SETTER
	 * @param vision
	 */
	public void setVision(Vision vision) {
		this.vision = vision;
	}
	/**
	 * GETTER
	 * @return weather
	 */
	public Weather getWeather() {
		return weather;
	}
	/**
	 * SETTER
	 * @param weather
	 */
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	/**
	 * GETTER
	 * @return height
	 */
	public Height getHeight() {
		return height;
	}
	/**
	 * GETTER
	 * @param height
	 */
	public void setHeight(Height height) {
		this.height = height;
	}
	/**
	 * SETTER
	 * @return wind
	 */
	public Wind getWind() {
		return wind;
	}
	/**
	 * GETTER
	 * @param wind
	 */
	public void setWind(Wind wind) {
		this.wind = wind;
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
			AerialRacer test=(AerialRacer)newRacer;
			if(activeRacers.size()+completedRacers.size()>=MAX_RACERS)
			{
				throw new RacerLimitException(Integer.toString(activeRacers.size()), Integer.toString(newRacer.getSerialNumber()));	
			}
			activeRacers.add((Racer) test);
		} 
		catch (ClassCastException e) {
			throw new RacerTypeException(newRacer.getClass().getSimpleName(), "Aerial Arena");
		}
		
	}
	


}
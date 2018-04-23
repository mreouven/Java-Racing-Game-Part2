package game.arenas.air;

import game.arenas.Arena;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;
import game.racers.air.AerialRacer;
import utilities.EnumContainer.*;

public class AerialArena extends Arena {

	
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
		
		// TODO verifier pour friction et pour les enum
	}

	
	public AerialArena() {
		super(1500,6,0.4);
		this.setVision(Vision.SUNNY);
		this.setWeather(Weather.DRY);
		this.setHeight(Height.HIGH);
		this.setWind(Wind.HIGH);
	}
	
	
	
	
	







	//getter and setter
	public Vision getVision() {
		return vision;
	}

	public void setVision(Vision vision) {
		this.vision = vision;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public Height getHeight() {
		return height;
	}

	public void setHeight(Height height) {
		this.height = height;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	
	
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
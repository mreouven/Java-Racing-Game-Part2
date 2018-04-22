package game.arenas;

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

	
	protected AerialArena() {
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

	
	
	
	


}
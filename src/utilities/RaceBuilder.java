package utilities;

import game.arenas.Arena;
import game.racers.Racer;

public class RaceBuilder {

	private static RaceBuilder instance;
	

	public static RaceBuilder getInstance() {
		if (instance == null) {
			instance = new RaceBuilder();
		}
		return instance;
	}

	
	
	public Arena buildArena(String arenaType, double length, int maxRacers) {
		return null;
		
	}
	public Racer buildRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color){
		return null;
		
	}
	public Racer buildWheeledRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color, int numOfWheels)
	{
		
		
		return null;
	}
}

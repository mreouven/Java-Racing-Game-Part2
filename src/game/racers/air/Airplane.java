package game.racers.air;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;

public class Airplane extends Racer implements AerialRacer{

	 //TODO Verifier si il yaWheeled airplane;
	public Airplane(String name, double maxSpeed, double acceleration, Color color) {
		super(name, maxSpeed, acceleration, color);
		
	}
	public Airplane() {
		super("Default", 885, 100, Color.BLACK);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String describeRacer() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String describeSpecific() {
		// TODO Auto-generated method stub
		return null;
	}

}

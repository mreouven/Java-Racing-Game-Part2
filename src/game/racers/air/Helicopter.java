
package game.racers.air;

import game.racers.Racer;
import utilities.EnumContainer.Color;

public class Helicopter extends Racer implements AerialRacer{

	public Helicopter(String name, double maxSpeed, double acceleration, Color color) {
		super(name, maxSpeed, acceleration, color);
		
	}
	public Helicopter() {
		super("Default", 400, 50, Color.BLUE);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String describeSpecific() {
		// TODO Auto-generated method stub
		return null;
	}

}

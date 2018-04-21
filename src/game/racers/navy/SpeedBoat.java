package game.racers.navy;

import game.racers.Racer;
import utilities.EnumContainer.Color;

public class SpeedBoat extends Racer implements NavalRacer{

	
	public SpeedBoat() {
		super(null, 170, 5, Color.RED);
		name="RowBoat#"+serialNumber;
	}
	public SpeedBoat(String name, double maxSpeed, double acceleration, Color color) {
		super(name, maxSpeed, acceleration, color);
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

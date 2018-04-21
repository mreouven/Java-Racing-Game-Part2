package game.racers.navy;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.TeamBoat;
import utilities.EnumContainer.TypeBoat;

public class RowBoat extends Racer implements NavalRacer{
	
	TeamBoat team;
	TypeBoat type;
	
	public RowBoat() {
		super(null, 75, 10, Color.RED);
		name="RowBoat#"+serialNumber;
		type=TypeBoat.SKULLING;
		team=TeamBoat.DOUBLE;
	}
	
	
	public RowBoat(String name, double maxSpeed, double acceleration, Color color) {
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

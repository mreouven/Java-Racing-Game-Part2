package game.racers.air;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;

public class Airplane extends Racer implements AerialRacer{
	Wheeled airplane;


	public Airplane(String name, double maxSpeed, double acceleration, Color color,int numOfWheeld) {
		super(name, maxSpeed, acceleration, color);
		airplane=new Wheeled(numOfWheeld);
		
	}
	public Airplane() {
		super("Airplane#", 885, 100, Color.BLACK);
		airplane=new Wheeled(0);
	}
	


	@Override
	public String describeSpecific() {
		return "NumOfWheels: "+airplane.getNumOfWheeled();
	}

}

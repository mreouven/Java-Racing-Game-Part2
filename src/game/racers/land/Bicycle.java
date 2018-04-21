package game.racers.land;


import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.Engine;

public class Bicycle extends Racer implements LandRacer{
	
	Wheeled car;
	utilities.EnumContainer.TypeBicycle type;

	public Bicycle(String name, double maxSpeed, double acceleration, Color color,int numOfWheeld) {
		super(name, maxSpeed, acceleration, color);
		if(name==null) {
			this.name="Bicycle#"+serialNumber;
		}
		car=new Wheeled(numOfWheeld);
	}
	public Bicycle() {
		super("", 270, 10, Color.GREEN);
		name="Bicycle#"+serialNumber;
		car=new Wheeled(2);
		
		//TODO verifier type
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

package game.racers.land;


import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;


public class Bicycle extends Racer implements LandRacer{
	
	Wheeled bicycleW;
	utilities.EnumContainer.TypeBicycle type;

	public Bicycle(String name, double maxSpeed, double acceleration, Color color,int numOfWheeld) {
		super(name, maxSpeed, acceleration, color);
		if(name==null) {
			this.name="Bicycle#"+serialNumber;
		}
		bicycleW=new Wheeled(numOfWheeld);
	}
	public Bicycle() {
		super("", 270, 10, Color.GREEN);
		name="Bicycle#"+serialNumber;
		bicycleW=new Wheeled(2);
		
		//TODO verifier type
	}
	
	
	
	

	@Override
	public String describeSpecific() {
		return "NumOfWheels: "+bicycleW.getNumOfWheeled();
	}

	
}

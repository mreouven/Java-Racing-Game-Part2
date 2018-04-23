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
	}
	

	@Override
	public String describeSpecific() {
		return "NumOfWheels: "+bicycleW.getNumOfWheeled();
	}
	public Wheeled getBicycleW() {
		return bicycleW;
	}
	public void setBicycleW(Wheeled bicycleW) {
		this.bicycleW = bicycleW;
	}
	public utilities.EnumContainer.TypeBicycle getType() {
		return type;
	}
	public void setType(utilities.EnumContainer.TypeBicycle type) {
		this.type = type;
	}

	
}

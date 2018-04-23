package game.racers.land;


import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.TypeBicycle;
/** Represents an Bicycle.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/

public class Bicycle extends Racer implements LandRacer{
	
	Wheeled bicycleW;
	utilities.EnumContainer.TypeBicycle type=TypeBicycle.MOUNTAIN;

	private final static double DEFAULT_MAXSPEED=270;
	private final static double DEFAULT_ACCELERATION=10;
	
	public Bicycle(String name, double maxSpeed, double acceleration, Color color,int numOfWheeld) {
		super(name, maxSpeed, acceleration, color);
		if(name==null) {
			this.name="Bicycle#"+serialNumber;
		}
		bicycleW=new Wheeled(numOfWheeld);
	}
	public Bicycle() {
		super("", DEFAULT_MAXSPEED, DEFAULT_ACCELERATION, Color.GREEN);
		name="Bicycle#"+serialNumber;
		bicycleW=new Wheeled(2);
	}
	

	@Override
	public String describeSpecific() {
		return "NumOfWheels: "+bicycleW.getNumOfWheeled()+", TypeBicycle: "+type;
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

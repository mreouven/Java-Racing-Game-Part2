package game.racers.air;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;
/** Represents an Airplane.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class Airplane extends Racer implements AerialRacer{
	/**
	* <h1>Airplane</h1>
	* 
	* <p>
	* <b>Note:</b> 
	*
	* @author  Reouven Mimoun, Emet Genah
	* @version 1.0
	* @since   2018-04-23
	*/
	
	
	Wheeled airplane;
	private final static double DEFAULT_MAXSPEED=885;
	private final static double DEFAULT_ACCELERATION=100;

	public Airplane(String name, double maxSpeed, double acceleration, Color color,int numOfWheeld) {
		super(name, maxSpeed, acceleration, color);
		airplane=new Wheeled(numOfWheeld);
		
	}

	public Airplane() {
		super(null, DEFAULT_MAXSPEED, DEFAULT_ACCELERATION, Color.BLACK);
		name="Airplane#"+serialNumber;
		airplane=new Wheeled(0);
	}
	

	@Override
	public String describeSpecific() {
		return "NumOfWheels: "+airplane.getNumOfWheeled();
	}
	public Wheeled getAirplaneWheeled() {
		return airplane;
	}
	public void setAirplaneWheeled(Wheeled airplane) {
		this.airplane = airplane;
	}
	
	

}

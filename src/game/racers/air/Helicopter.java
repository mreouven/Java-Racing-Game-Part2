
package game.racers.air;

import game.racers.Racer;
import utilities.EnumContainer.Color;
/** Represents an Helicopter.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class Helicopter extends Racer implements AerialRacer{
	/**
	* <h1>Helicopter</h1>
	* 
	* <p>
	* <b>Note:</b> 
	*
	* @author  Reouven Mimoun, Emeth Genah
	* @version 1.0
	* @since   2018-04-23
	*/
	public Helicopter(String name, double maxSpeed, double acceleration, Color color) {
		super(name, maxSpeed, acceleration, color);
		
	}
	public Helicopter() {
		super(null, 400, 50, Color.BLUE);
		name="Helicopter#"+serialNumber;
	}
	

	@Override
	public String describeSpecific() {
		return null;
	}

}

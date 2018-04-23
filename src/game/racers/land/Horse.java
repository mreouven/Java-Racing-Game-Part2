package game.racers.land;

import game.racers.Racer;
import utilities.EnumContainer.Breed;
import utilities.EnumContainer.Color;
/** Represents an Horse.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class Horse extends Racer implements LandRacer {

	Breed breed=Breed.THOROUGHBRED;
	public Horse(String name, double maxSpeed, double acceleration, Color color) {
		
		super(name, maxSpeed, acceleration, color);
		
	}
	public Horse() {
		
		super(null, 50, 3, Color.BLACK);
		name="Horse#"+serialNumber;
		
	}


	@Override
	public String describeSpecific() {
		return "Breed: "+breed;
	}
	
	


	

}

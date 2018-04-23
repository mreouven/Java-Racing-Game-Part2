package game.racers.naval;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.TeamBoat;
import utilities.EnumContainer.TypeBoat;
/** Represents an SpeedBoat.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
@SuppressWarnings("unused")
public class SpeedBoat extends Racer implements NavalRacer{
	
	TeamBoat team=TeamBoat.DOUBLE;
	TypeBoat type=TypeBoat.SWEEP;
	

	public TeamBoat getTeam() {
		return team;
	}
	public void setTeam(TeamBoat team) {
		this.team = team;
	}
	public TypeBoat getType() {
		return type;
	}
	public void setType(TypeBoat type) {
		this.type = type;
	}
	public SpeedBoat() {
		super(null, 170, 5, Color.RED);
		name="SpeedBoat#"+serialNumber;
	}
	public SpeedBoat(String name, double maxSpeed, double acceleration, Color color) {
		super(name, maxSpeed, acceleration, color);
		
	}

	@Override
	public String describeSpecific() {
		return "TeamBoat: "+ team+", TypeBoat: "+type;
	}

	
	
}

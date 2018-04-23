package game.racers.naval;

import game.racers.Racer;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.TeamBoat;
import utilities.EnumContainer.TypeBoat;
/** Represents an RowBoat.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
@SuppressWarnings("unused")
public class RowBoat extends Racer implements NavalRacer{
	
	TeamBoat team=TeamBoat.DOUBLE;
	TypeBoat type=TypeBoat.SKULLING;
	private final static double DEFAULT_MAXSPEED=75;
	private final static double DEFAULT_ACCELERATION=10;
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


	public RowBoat() {
		super(null, DEFAULT_MAXSPEED, DEFAULT_ACCELERATION, Color.RED);
		name="RowBoat#"+serialNumber;
		type=TypeBoat.SKULLING;
		team=TeamBoat.DOUBLE;
	}
	
	
	public RowBoat(String name, double maxSpeed, double acceleration, Color color) {
		super(name, maxSpeed, acceleration, color);
		
	}


	@Override
	public String describeSpecific() {
		return "TeamBoat: "+ team+", TypeBoat: "+type;
	}

}

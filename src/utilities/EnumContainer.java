package utilities;

/**
 * Contains all Enums for the game.
 * 
 * To set a field type: 
 * 		EnumContainer.Vision vision;
 * To set a value:
 * 		this.vision = EnumContainer.Vision.Sunny
 * 
 * @author Bar Ohayon
 *
 */
public class EnumContainer {
	
	

	public static enum Vision {
		CLOUDS, SUNNY, FOG
	}
	public static enum Weather {
		DRY,RAIN,SNOW
	}
	public static enum Height {
		LOW,MEDIUM,HIGH
	}
	public static enum Wind {
		LOW,MEDIUM,HIGH
	}
	
	
	public static enum Water {
		SALTED,SWEET
	}
	public static enum SurfaceW {
		FLAT,WAVY
	}
	public static enum Body {
		SEA,LAKE,RIVER,OCEAN
	}

	
	public static enum Coverage {
		SAND,GRASS,MUD
	}
	public static enum SurfaceL {
		FLAT,MOUNTAIN
	}

	public static enum Color {
		RED,GREEN,BLUE,BLACK,YELLOW
	}
	
	
	public static enum Breed{
		THOROUGHBRED,STANDARDBRED,MORGAN,FRIESIAN
	}
	
	public static enum Engine{
		FOURSTROKE,VTYPE,STRAIGHT,BOXER,ROTARY
	}
	public static enum TypeBicycle{
		MOUNTAIN,HYBRID,CRUISER,ROAD
		
	}
	
	
	
	//RowBoat
	public static enum TypeBoat{
		SKULLING,SWEEP
		
	}
	
	public static enum TeamBoat{
		SINGLE,DOUBLE,QUAD,EIGHT
		
	}

	
	
}

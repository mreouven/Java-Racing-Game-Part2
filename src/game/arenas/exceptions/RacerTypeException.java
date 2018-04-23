package game.arenas.exceptions;

@SuppressWarnings("serial")
public class RacerTypeException extends Exception {
	
	public RacerTypeException(String type, String clss) {
		super("Invalid Racer of type \""+type+"\" for "+clss);
	}
	
	
	
}

package game.arenas.exceptions;

@SuppressWarnings("serial")
public class RacerLimitException extends Exception{


	public RacerLimitException(String nmbre,String serial) {
		super("Arena is full! ("+nmbre+" active racers exist). racer #"+serial+" was not added");
	}

	
}

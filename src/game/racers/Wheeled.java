package game.racers;

/** Represents an Wheeled racer.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public class Wheeled {
	protected int numOfWheeled;
	
	/**
	 * Constructor default
	 * @param Nothing
	 */
	public Wheeled() {
		this.setNumOfWheeled(0);
	}
	/**
	 * Constructor
	 * @param numOfWheeled int
	 */
	public Wheeled(int numOfWheeled) {
		this.setNumOfWheeled(numOfWheeled);
	}
	/**
	 * 
	 * @return numOfWheeled int
	 */
	public int getNumOfWheeled() {
		return numOfWheeled;
	}
	/**
	 * 
	 * @param numOfWheeled int
	 */
	public void setNumOfWheeled(int numOfWheeled) {
		this.numOfWheeled = numOfWheeled;
	}
	
	
}

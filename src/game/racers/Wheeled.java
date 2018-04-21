package game.racers;

public class Wheeled {
	protected int numOfWheeled;
	
	public Wheeled() {
		this.setNumOfWheeled(0);
	}
	public Wheeled(int numOfWheeled) {
		this.setNumOfWheeled(numOfWheeled);
	}
	public int getNumOfWheeled() {
		return numOfWheeled;
	}
	public void setNumOfWheeled(int numOfWheeled) {
		this.numOfWheeled = numOfWheeled;
	}
	
	
}

package game.racers;

import game.arenas.Arena;
import utilities.Point;
import utilities.EnumContainer.Color;

public abstract class Racer {
	
	protected int serialNumber;
	protected String name;
	protected Point currentLocation;
	protected Point finish;
	protected Arena arena;
	protected double maxSpeed;
	protected double acceleration; 
	protected double currentSpeed;
	protected double failureProbability;// Chance to break down
	protected Color color; //enum (RED,GREEN,BLUE,BLACK,YELLOW)
	
	
	
	
	public Racer(String name, double maxSpeed, double acceleration, Color color) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.color = color;
		
	}
	
	public void initRace(Arena arena, Point start, Point finish) {
		//TODO remplir la fonction
	}
	
	public Point move(double friction) {
		if(maxSpeed>currentSpeed+acceleration*friction)
			currentSpeed+=acceleration*friction;
		else {
			currentSpeed=maxSpeed;
		}
		currentLocation.setX(currentLocation.getX()+currentSpeed);
		//TODO has a chance for failure ( see section 4.2 )
		return currentLocation;
	}
	
	public abstract String describeRacer() ;
	public abstract String describeSpecific();
	/*{
		
		//return "name: "+name+ ", SerialNumber: " +serialNumber+ ", acceleration: "+acceleration;
		
	//TODO verifier NumOfWheels
		
	}*/
	
	public void introduce() {
	//TODO remplir la fonction 
	}
	
	public String className() {
		return this.getClass().getName();
		
	}
	
}

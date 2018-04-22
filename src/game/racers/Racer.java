package game.racers;

import game.arenas.Arena;
import utilities.Point;
import utilities.EnumContainer.Color;

public abstract class Racer {
	
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	protected static int counter=0;
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
		this.serialNumber=counter++;
				
	}
	
	public void initRace(Arena arena, Point start, Point finish) {
		this.arena=arena;
		this.currentLocation=new Point(start);
		this.finish=new Point(finish);
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
	
	public String describeRacer()
	{
		return "["+this.className()+"] name: "+name+ ", SerialNumber: " +serialNumber+ ", acceleration: "+acceleration + describeSpecific();
	}
	
	public abstract String describeSpecific();

	
	public void introduce() {
	//TODO remplir la fonction 
	}
	
	public String className() {
		return this.getClass().getName();
		
	}
	
}

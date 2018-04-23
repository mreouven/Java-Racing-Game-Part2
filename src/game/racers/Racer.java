package game.racers;

import java.text.DecimalFormat;

import game.arenas.Arena;
import utilities.Point;
import utilities.EnumContainer.Color;
import utilities.Fate;
import utilities.Mishap;
/** Represents an racer.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public abstract class Racer {
	
	
	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	protected static int counter=1;
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
	protected Mishap takala;
	
	
	
	/**
	 * 
	 * @param name
	 * @param maxSpeed
	 * @param acceleration
	 * @param color
	 */
	public Racer(String name, double maxSpeed, double acceleration, Color color) {
		super();
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.acceleration = acceleration;
		this.color = color;
		this.serialNumber=counter++;
		takala=Fate.generateMishap();
				
	}
	/**
	 * 
	 * @param arena
	 * @param start
	 * @param finish
	 */
	public void initRace(Arena arena, Point start, Point finish) {
		this.arena=arena;
		this.currentLocation=new Point(start);
		this.finish=new Point(finish);
	}
	/**
	 * 
	 * @param friction
	 * @return currentlocation Point
	 */
	public Point move(double friction) {
		if(takala.isFixable()==false || takala.getTurnsToFix()==0) {
			takala=Fate.generateMishap();
		}
		if(takala.isFixable()==true) {
			System.out.println(this.name+ " Has a new mishap! " +takala);
			if(takala.getTurnsToFix()>0) {
				if (this.currentSpeed < this.maxSpeed) {
					this.setCurrentSpeed(this.currentSpeed + this.acceleration*takala.getReductionFactor() * friction);
				}
				if (this.currentSpeed > this.maxSpeed) {
					this.setCurrentSpeed(this.maxSpeed);
				}
				Point newLocation = new Point((this.currentLocation.getX() + (1 * this.currentSpeed)),
						this.currentLocation.getY());
				this.setCurrentLocation(newLocation);

				if (this.currentLocation.getX() >= this.finish.getX()) {
					this.arena.crossFinishLine(this);
				}
				takala.nextTurn();
				return this.currentLocation;
				
			}	
		}
		if (this.currentSpeed < this.maxSpeed) {
			this.setCurrentSpeed(this.currentSpeed + this.acceleration * friction);
		}
		if (this.currentSpeed > this.maxSpeed) {
			this.setCurrentSpeed(this.maxSpeed);
		}
		Point newLocation = new Point((this.currentLocation.getX() + (1 * this.currentSpeed)),
				this.currentLocation.getY());
		this.setCurrentLocation(newLocation);

		if (this.currentLocation.getX() >= this.finish.getX()) {
			this.arena.crossFinishLine(this);
		}
		return this.currentLocation;
	}
	
	
	
	@SuppressWarnings("unused")
	private double getCurrentSpeed() {
		return currentSpeed;
	}

	@SuppressWarnings("unused")
	private Point getCurrentLocation() {
		return currentLocation;
	}

	private void setCurrentLocation(Point currentLocation) {
		this.currentLocation = currentLocation;
	}

	private void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public String describeRacer()
	{
		String spec=describeSpecific();
		if(spec!=null)
			return " name: "+name+ ", SerialNumber: " +serialNumber+", maxSpeed: "+maxSpeed+", acceleration: "+new DecimalFormat("0.00").format(acceleration) +", Color: "+color+" "+ describeSpecific();
		return " name: "+name+ ", SerialNumber: " +serialNumber+", maxSpeed: "+maxSpeed+ ", acceleration: "+new DecimalFormat("0.00").format(acceleration)+", Color: "+color;
		
	}
	
	public abstract String describeSpecific();
	

	
	public void introduce() {
		System.out.println("["+this.getClass().getSimpleName()+"]"+ this.describeRacer());
	}
	
	public String className() {
		return this.getClass().getName();
		
	}
	
}

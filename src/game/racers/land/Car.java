package game.racers.land;

import game.racers.Racer;
import game.racers.Wheeled;
import utilities.EnumContainer.Color;
import utilities.EnumContainer.Engine;

@SuppressWarnings("unused")
public class Car extends Racer implements LandRacer{
	
	public Wheeled getCar() {
		return car;
	}
	public void setCar(Wheeled car) {
		this.car = car;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}




	Wheeled car;
	Engine engine;

	public Car(String name, double maxSpeed, double acceleration, Color color,int numOfWheeld) {
		super(name, maxSpeed, acceleration, color);
		if(name==null) {
			this.name="Car#"+serialNumber;
		}
		car=new Wheeled(numOfWheeld);
	}
	public Car() {
		super("", 400, 20, Color.RED);
		name="Car#"+serialNumber;
		car=new Wheeled(4);
		
		
	}
	
	
	

	@Override
	public String describeSpecific() {
		return "NumOfWheels: "+car.getNumOfWheeled();
	
	}

	
}

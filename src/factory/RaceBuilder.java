package factory;

import java.lang.reflect.*;

import game.arenas.Arena;
import game.racers.Racer;
import utilities.EnumContainer.Color;

public class RaceBuilder {

	private static RaceBuilder instance;


	public static RaceBuilder getInstance() {
		if (instance == null) {
			instance = new RaceBuilder();
		}
		return instance;
	}
	
	
	
	public Arena buildArena(String arenaType, double length, int maxRacers) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
			
			// Create a new JavaClassLoader 
			ClassLoader classLoader = this.getClass().getClassLoader();
			
			// Load the target class using its binary name
	        Class<?> loadedMyClass = classLoader.loadClass(arenaType);
	        
	        // Create a new instance from the loaded class
	        Constructor<?> constructor = loadedMyClass.getConstructor(new Class[] { double.class,int.class });
	        Object myClassObject = constructor.newInstance(length,maxRacers);
	       return (Arena) myClassObject;

		
		
		 
	}
	
	
	public Racer buildRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
			// Create a new JavaClassLoader 
			ClassLoader classLoader = this.getClass().getClassLoader();
			
			// Load the target class using its binary name
	        Class<?> loadedMyClass = classLoader.loadClass(racerType);
	        
	        // Create a new instance from the loaded class
	        Constructor<?> constructor = loadedMyClass.getConstructor(new Class[] { String.class,double.class,double.class, Color.class });
	        Object myClassObject = constructor.newInstance(name,maxSpeed,acceleration,color);
	       return (Racer) myClassObject;

		
	}
	public Racer buildWheeledRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color, int numOfWheels) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		// Create a new JavaClassLoader 
			ClassLoader classLoader = this.getClass().getClassLoader();
			
			// Load the target class using its binary name
	        Class<?> loadedMyClass = classLoader.loadClass(racerType);
	        
	        // Create a new instance from the loaded class
	        Constructor<?> constructor = loadedMyClass.getConstructor(new Class[] { String.class,double.class,double.class, Color.class,int.class });
	        Object myClassObject = constructor.newInstance(name,maxSpeed,acceleration,color,numOfWheels);
	       return (Racer) myClassObject;

	
	}
}

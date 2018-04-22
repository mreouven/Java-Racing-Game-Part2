package utilities;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import game.arenas.Arena;
import game.arenas.exceptions.RacerTypeException;
import game.racers.Racer;

public class RaceBuilder {

	private static RaceBuilder instance;
	private Arena arenaName;
	

	public static RaceBuilder getInstance() {
		if (instance == null) {
			instance = new RaceBuilder();
		}
		return instance;
	}
	public static Object createObject(@SuppressWarnings("rawtypes") Constructor constructor,
		      Object[] arguments) {

		    System.out.println("Constructor: " + constructor.toString());
		    Object object = null;

		    try {
		      object = constructor.newInstance(arguments);
		      System.out.println("Object: " + object.toString());
		      return object;
		    } catch (InstantiationException e) {
		      System.out.println(e);
		    } catch (IllegalAccessException e) {
		      System.out.println(e);
		    } catch (IllegalArgumentException e) {
		      System.out.println(e);
		    } catch (InvocationTargetException e) {
		      System.out.println(e);
		    }
		    return object;
		  }
	
	
	public Arena buildArena(String arenaType, double length, int maxRacers) throws NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		@SuppressWarnings("unused")
		Constructor<?>test=Class.forName(arenaType).getConstructor(new Class[] {double.class,int.class});
		arenaName=(Arena) createObject(test, new Object[] {length, maxRacers});
		return arenaName;
		
	}
	public Racer buildRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color){

		return null;
		
	}
	public Racer buildWheeledRacer(String racerType, String name, double maxSpeed, double acceleration, utilities.EnumContainer.Color color, int numOfWheels)
	{
		
		
		return null;
	}
}

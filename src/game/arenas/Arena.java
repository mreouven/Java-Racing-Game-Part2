package game.arenas;



import java.util.ArrayList;
import utilities.Point;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.*;
/** Represents an Arena.
 * @author Mimoun Reouven
 * @author Emeth Genah
 * @version 2.2
 * @since 1.0
*/
public abstract class Arena {
	
	protected  ArrayList <Racer> activeRacers;
	protected  ArrayList <Racer> completedRacers;
	
	protected double  FRICTION;
	protected final int  MAX_RACERS;
	protected final static int MIN_Y_GAP=10;
	protected double length;
	
	
	
	/**
	 * 
	 * @param length
	 * @param maxRacers
	 * @param friction
	 */
	protected Arena(double length, int maxRacers, double friction){
		this.setLength(length);
		this.MAX_RACERS=maxRacers;
		this.FRICTION=friction;
		this.setActiveRacers(new ArrayList<>());
		this.setCompletedRacers(new ArrayList<>());
	}
	
	
	 /**
	   * This is the main method which makes use of addNum method.
	   * @param Racer newRacer.
	   * @return Nothing.
	   * @exception RacerLimitException RacerTypeException On input error.
	   * @see RacerTypeException 
	   * @see RacerLimitException
	   */
	public abstract void addRacer(Racer newRacer) throws RacerLimitException, RacerTypeException;
	
		/**
	   * start the race
	   * @see Arena
	   */
	public void initRace() {
	
	  for(int i=0;i<activeRacers.size();i++) {
		  activeRacers.get(i).initRace(this,new Point(0,(i)*MIN_Y_GAP),new Point(0,length));
	  }
 
	  
	}
	/**
	   * Check if active racer
	   * @see Arena
	   */
	public boolean hasActiveRacers() {
			if (activeRacers.size()!=0) {
				return true;
			}
			return false;  
		  
	}
	
	
		/**
	   * Play turn for all player
	   * @see Arena
	   */
	public void playTurn() {
		for (Racer ap : this.activeRacers) {
			ap.move(this.FRICTION);
		}
		for (Racer racer : this.completedRacers) {
			this.activeRacers.remove(racer);
			
		}
	}
	
	/**
	   * Check if completed race
	   * @see Arena
	   */
	public int crossFinishLine(Racer racer) {
		this.completedRacers.add(racer);
		return this.completedRacers.size();
	 }	
	
	/**
	   * print all result
	   * @see Arena
	   */
	public void showResults() {
		
		
		 for (int i = 0; i < completedRacers.size(); i++) {
			System.out.println("#"+i+" -> "+completedRacers.get(i).describeRacer());
		}
		 
	 }	 
	 
	 
	 
	 
	//get and set
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public ArrayList <Racer> getActiveRacers() {
		return activeRacers;
	}
	public void setActiveRacers(ArrayList <Racer> activeRacers) {
		this.activeRacers = activeRacers;
	}
	public ArrayList <Racer> getCompletedRacers() {
		return completedRacers;
	}
	public void setCompletedRacers(ArrayList <Racer> completedRacers) {
		this.completedRacers = completedRacers;
	}


}

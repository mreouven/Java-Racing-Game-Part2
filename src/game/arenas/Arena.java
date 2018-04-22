package game.arenas;


import java.util.ArrayList;

import javax.sound.midi.MidiChannel;

import utilities.Point;
import game.arenas.exceptions.RacerLimitException;
import game.arenas.exceptions.RacerTypeException;
import game.racers.*;

public class Arena {
	
	private  ArrayList <Racer> activeRacers;
	private  ArrayList <Racer> completedRacers;
	
	private final double  FRICTION;
	private final int  MAX_RACERS;
	private final static int MIN_Y_GAP=10;
	private double length;
	
	
	protected Arena(double length, int maxRacers, double friction){
		this.setLength(length);
		this.MAX_RACERS=maxRacers;
		this.FRICTION=friction;
	}
	
	
	
	public void addRacer(Racer newRacer) throws RacerLimitException{
		if(activeRacers.size()+completedRacers.size()>MAX_RACERS)
		{
			throw new RacerLimitException(Integer.toString(activeRacers.size()), Integer.toString(newRacer.getSerialNumber()));
			//TODO finir les exeptions
			
		}
		//TODO finir les verif
		
	}
	public void initRace() {
	
	  for(int i=0;i<activeRacers.size();i++) {
		  activeRacers.get(i).initRace(this,new Point(0,(i)*MIN_Y_GAP),new Point(0,length));
	  //TODO verifier si la fin cest pas i*lenght*min_y_gap
	  }
 
	  
	}
	public boolean hasActiveRacers() {
			if (activeRacers.size()!=0) {
				return true;
			}
			return false;  
		  
	}
	public void playTurn() {}
	
	
	public int crossFinishLine(Racer racer) {
		//TODO Finir 
		 if(racer!=null) {
			 finished.add(racer);
			 return finished.size();
		 }
		return -1;
	 }	
	

	public void showResults() {
		System.out.println("Race Compleated!");
		
		 for (int i = 0; i < completedRacers.size(); i++) {
			System.out.println("#"+i+" -> "+completedRacers.get(i));
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

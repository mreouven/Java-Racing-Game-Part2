package utilities;

import java.text.DecimalFormat;

public class Mishap {
	
	boolean fixable;
	double reductionFactor;
	int turnsToFix;
	
	public Mishap(boolean fixable, double reductionFactor, int turnsToFix) {
		super();
		setFixable(fixable);
		setReductionFactor(reductionFactor);
		setTurnsToFix(turnsToFix);
	}
	@Override
	public String toString() {
		return "("+this.fixable+", " + this.turnsToFix + ", " + new DecimalFormat("0.00").format(this.reductionFactor) + ")";
	}

	
	public void nextTurn() {
		if (turnsToFix>0)
			setTurnsToFix(turnsToFix--);
	}
	@SuppressWarnings("unused")
	public boolean isFixable() {
		return fixable;
	}
	public void setFixable(boolean fixable) {
		this.fixable = fixable;
	}
	@SuppressWarnings("unused")
	public double getReductionFactor() {
		return reductionFactor;
	}
	public void setReductionFactor(double reductionFactor) {
		this.reductionFactor = reductionFactor;
	}
	@SuppressWarnings("unused")
	public int getTurnsToFix() {
		return turnsToFix;
	}
	public void setTurnsToFix(int turnsToFix) {
		this.turnsToFix = turnsToFix;
	}

	

}

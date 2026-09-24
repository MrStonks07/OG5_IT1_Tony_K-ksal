package de.oszimt.starsim2099;

/**
 * Write a description of class Raumschiff here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Raumschiff {

	// Attributet
	private String typ;
	private String antrieb;
	private int maxkapazitet;
	private int winkle;
	private double posX;
	private double posY;
	
	
	// Methoden

	public String getTyp() {
		return typ;
	}


	public void setTyp(String typ) {
		this.typ = typ;
	}


	public String getAntrieb() {
		return antrieb;
	}


	public void setAntrieb(String antrieb) {
		this.antrieb = antrieb;
	}


	public int getMaxkapazitet() {
		return maxkapazitet;
	}


	public void setMaxkapazitet(int maxkapazitet) {
		this.maxkapazitet = maxkapazitet;
	}


	public int getWinkle() {
		return winkle;
	}


	public void setWinkle(int winkle) {
		this.winkle = winkle;
	}


	public double getPosX() {
		return posX;
	}


	public void setPosX(double posX) {
		this.posX = posX;
	}


	public double getPosY() {
		return posY;
	}


	public void setPosY(double posY) {
		this.posY = posY;
	}


	// Darstellung
	public static char[][] getDarstellung() {
		char[][] raumschiffShape = { 
				{'\0', '\0','_', '\0', '\0'},
				{'\0', '/', 'X', '\\', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'\0', '{', 'X', '}', '\0'},
				{'/', '_', '_','_', '\\'},				
		};
		return raumschiffShape;
	}

}

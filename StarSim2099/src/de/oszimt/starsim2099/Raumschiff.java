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
	private int MaxLadekapazitaet;
	private int Winkel;
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


	public int getMaxLadekapazitaet() {
		return MaxLadekapazitaet;
	}


	public void setMaxLadekapazitaet(int maxLadekapazitaet) {
		MaxLadekapazitaet = maxLadekapazitaet;
	}

	public int getWinkel() {
		return Winkel;
	}


	public void setWinkel(int winkel) {
		Winkel = winkel;
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

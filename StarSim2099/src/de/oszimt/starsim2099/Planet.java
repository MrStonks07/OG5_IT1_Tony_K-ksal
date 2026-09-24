package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet {

	// Attribute
	private int AnzahlHafen;
	private String name;
	private double posX;
	private double posY;
	
	// Methoden

public String getName() {
	return name;
}

public int getAnzahlHafen() {
	return AnzahlHafen;
}

public void setAnzahlHafen(int anzahlHafen) {
	AnzahlHafen = anzahlHafen;
}

public void setName(String name) {
	this.name = name;
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
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;
	}
}

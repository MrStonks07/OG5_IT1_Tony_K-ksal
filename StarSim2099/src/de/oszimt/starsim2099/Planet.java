package de.oszimt.starsim2099;

/**
 * Write a description of class Planet here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Planet extends Position{

	// Attribute
	private int AnzahlHafen;
	private String name;
	
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

	// Darstellung
	public static char[][] getDarstellung() {
		char[][] planetShape = { { '\0', '/', '*', '*', '\\', '\0' }, { '|', '*', '*', '*', '*', '|' },
				{ '\0', '\\', '*', '*', '/', '\0' } };
		return planetShape;
	}
}

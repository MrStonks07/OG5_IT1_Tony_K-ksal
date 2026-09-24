package de.oszimt.starsim2099;

public class HimmelsKoerper {
private String Name;
private double posX;
private double posY;
private String Typ;

//Methoden
public String getTyp() {
	return Typ;
}
public void setTyp(String typ) {
	Typ = typ;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
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


		
}

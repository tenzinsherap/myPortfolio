package labs;

public class SingleCard{
	// Class for Single Card from deck of cards

private String face, suit;

	public SingleCard(String f, String s) {
	
	face = f;
	
	suit = s;
	
	}
	// Prog getters and setters for Face and Suits
	
	public String getFace() {
	
	return face;
	
	}
	
	public void setFace(String face) {
	
	this.face = face;
	
	}
	
	public String getSuit() {
	
	return suit;
	
	}
	
	public void setSuit(String suit) {
	
	this.suit = suit;
	
	}
	
	public String toString() {
	
	return face + " of " + suit;
	
		}
	}
package labs;

public class Deck {
	// Class  to represent deck
	private SingleCard[] cards;
	// Call SingleCards Class
	private static final String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
	
	private static final String[] faces = {"Ace", "2", "3", "4", "5", "6", "7", "8",
	
	"9", "10", "Jack", "Queen", "King"};
	
	public Deck() {
	
	cards = new SingleCard[52];
	
	int k = 0;
	
	for(int i=0; i<4; i++) {
	
	for(int j=0; j<13; j++) {
	
	cards[k ++] = new SingleCard(faces[j], suits[i]);
	
	}

}
	
}
	
	public void display() {
	// Method to print cards
	for (int i = 0; i<cards.length; i++) {
	
	System.out.println(cards[i]);
	
	}
	
}
	
	public static void main(String[] args) {
	// Inherit 
	Deck d = new Deck();
	
	d.display();
	
	}
	
}
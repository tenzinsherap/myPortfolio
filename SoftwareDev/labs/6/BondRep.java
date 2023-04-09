package labs;

public class BondRep{
	   //Main method
	   public static void main(String[] args) {
	       //Creating a Bond object
	       Bond b = new Bond(500, 100, 0.05, 10000);
	      
	       //Getting price
	       System.out.printf("\n Price: $%.2f \n", b.getPrice());
	   }
	}
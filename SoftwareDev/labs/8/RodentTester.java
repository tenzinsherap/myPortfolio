package labs;

public class RodentTester {

	   public static void main(String[] args) {
	       // array
	       Rodent[] rodents=new Rodent[3];
	       System.out.println();
	      
	      
	       rodents[0]=new Mouse();
	       rodents[0].move();
	       rodents[0].eat();
	       System.out.println();
	      
	      
	       rodents[1]=new Gerbil();
	       rodents[1].move();
	       rodents[1].eat();
	       System.out.println();
	      
	       
	       rodents[2]=new Hamster();
	       rodents[2].move();
	       rodents[2].eat();

	   }

	}
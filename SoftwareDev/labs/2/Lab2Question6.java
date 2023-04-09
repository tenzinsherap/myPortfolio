import java.util.Random; 
public class Lab2Question6 {

	public static void main(String[] args) {
		
		// create instance of Random class 
        Random rand = new Random(); 
       int num1 = rand.nextInt(900) + 100; 
       int num2 = rand.nextInt(900) + 100; 
       int num3 = rand.nextInt(900) + 1000; 
      
        // Print Number 
        
        System.out.println("Your Phone Number is (" + num1 + ")"  + num2 + "-" + num3); 
        
        
        
        
	}

}

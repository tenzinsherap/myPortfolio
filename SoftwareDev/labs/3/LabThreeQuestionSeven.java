import java.util.Scanner;

public class LabThreeQuestionSeven {

    public static void main(String[] args) {
        System.out.println("The first 50 pentagonal numbers are :");
        System.out.println(" ");
        // Validate counter for 50 per line 
        int counter = 1;
        
        // loop for 50 Pentagonal numbers
       for (int i = 1; i <= 50; i++) {
      
    	System.out.printf("%-5d",getPentagonal(i));
       
    	// Print 10 per line
    	if (counter % 10 == 0) 
    	System.out.println();
    	++counter;
       }
    }
    
    public static int getPentagonal(int n) {
        int getPent = (n * (3 * n - 1)/2); 
    	return getPent; 
    }
}

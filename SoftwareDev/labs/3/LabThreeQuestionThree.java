package labs;

public class LabThreeQuestionThree {

	public static void main(String[] args) {
		// Characters corresponding to the ASCII Codes 1 - 100 
		
		// For loop to print between 1 - 100
		for(int i=1;i<=100;i++) {

		System.out.print(" "+(char)i);
		
		// Print 20 lines each
		if(i%20==0)
		System.out.println();
		
		}
	}	
} 


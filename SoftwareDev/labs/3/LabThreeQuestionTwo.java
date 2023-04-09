package labs;

public class LabThreeQuestionTwo {
	
	public static void main(String[] args) {
		System.out.println("Matrix: Numbers Divisible by 5 & 7! "); 
		System.out.println(""); 
		
		// Use a For Loop To Create Matrix 
		final int print = 10; 
		int count = 0;
 
        // Validate Matrix from 100 to 500 
            for (int i = 100; i <= 500; i++)
            // Validate Numbers to be divisible by 5 or 7, not both
                if (((i % 5 == 0 ? 1 : 0) ^ (i % 7 == 0 ? 1 : 0)) != 0) { 
                	count ++; 
                
                // Print 10 per line
                    if (count % print == 0)
                    	System.out.println(i); 
                    else 
                    	System.out.print(i + " ");
                } 
               }
}

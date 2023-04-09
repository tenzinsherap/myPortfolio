package labs;

import java.util.Random;

public class LabFourQuestionTwo {

public static void main(String[] args) {
	// Program that prints random lower case 5by5 matrix 
	System.out.println("Random Lowercase Character Matrix"); 
	System.out.println(" "); 
	// Create 5 by 5 matrix 
	char matrix[][] = new char[5][5]; 
	Random random = new Random(); 
		
	
		
	for(int i=0;i<5;i++){
		for(int j=0;j<5;j++){
			//random lowercase character
		char c = (char)(random.nextInt(26)+'a'); 
		matrix[i][j] = c; 
		System.out.print(matrix[i][j]+ " | "); 
		}
	System.out.print("\n"); 
		}
		  
	}

}


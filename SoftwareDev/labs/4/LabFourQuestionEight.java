package labs;

import java.util.Scanner;

public class LabFourQuestionEight {

public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = 0; 
		int value;
		
		// Initialize array
		int seq[] = new int[100];
		
		// Prompt user for input
		
		System.out.println("Please enter numbers (0 to end): ");
		value = input.nextInt();		
		while(value != 0 && n<100) {
		seq[n] = value; 
		n++; 
		
		value = input.nextInt();
	}
		
		
		for (int i=1; i<n; ++i) {
		int right = seq[i];
		int j = i-1;
		
		// Insert number
		while (j>=0 && seq[j] > right) {
		seq[j+1] = seq[j];
		j = j-1;
	}
		seq[j+1] = right; 
		
	}
		
	System.out.print("Sorted values: \n");
	for(int i=0; i<n; i++)
	System.out.print(seq[i] + " ");	
	System.out.println();
		
		
	}

}
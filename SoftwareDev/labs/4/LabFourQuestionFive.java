package labs;

import java.util.Random;

public class LabFourQuestionFive {

	public static void main(String[] args) {
	//program that generates 1000 random integers, calculates the average and prints two counts	

	Random random = new Random(); 
	
	
	final int RANGE=1000; 

	// Store array in array
	int arr[]=new int[1000]; 

	double sum = 0; 	
	
	// For loop input in array
	for(int i=0;i<1000;i++){ 
		arr[i]=random.nextInt(RANGE+1);
		sum+=arr[i];
	}
	

	double avg=sum/1000;
	int aboveAverage = 0; 
	int belowAverage = 0; 
	
	// For loop to count if above or below average
	for(int i=0;i<1000;i++){ 
		if(arr[i]>avg)
			aboveAverage++;
		else if(arr[i]<avg)
			belowAverage++;
	}
	System.out.println(" "); 
	System.out.println("Average: " + avg);
	System.out.println(aboveAverage+" Numbers Were Above Average");
	System.out.println(belowAverage+" Numbers Were Below Average");
	}
}


package labs;
import java.util.Scanner;
public class LabFiveQuestionTwo {
public static void main(String[] args) {
	
	// Program that computes mean and average 
	
	// Create array 
	double arr[] = new double[10];
	
	Scanner scan = new Scanner(System.in);
	System.out.print("Please Enter 10 Numbers:");
	// Store into Array 
	for (int i = 0; i < 10; i++)
		arr[i] = scan.nextDouble();
	// Invoke method 
	System.out.println("Mean : " + mean(arr));
	System.out.println("Standard Deviation: " + deviation(arr));
				
}

public static double mean(double[] x) {
	// initialize variables 
	double mean = 0; 
	double sum = 0; 
	double len = x.length;
	for (double n : x)
		sum += n;
	mean = sum / len;
	return mean;
}
		
public static double deviation(double x[]) {
		double sqrt = 0; 
		double len = x.length;
		double mean = mean(x);
		for (int i = 0; i < len; i++)
			sqrt += (x[i] - mean) * (x[i] - mean);
		return Math.sqrt(sqrt / (len - 1)); // JA
		
	}	
}
package labs;

import java.util.Scanner;

public class LabThreeQuestionFive {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		// Prompt Users for Inputs a,b,c
		System.out.print("Enter a: ");
		double a = input.nextDouble(); 
		System.out.print("Enter b: "); 
		double b = input.nextDouble();
		System.out.println("Enter c: "); 
		double c = input.nextDouble();
		
		System.out.println("Average is : " + average(a,b,c)); 
		

	}
	public static double average(double a, double b, double c){
		// Find Total 
		double total = a + b + c; 
		// Find Average
		double average = total / 3; 
		// Return to main
		return average; 

		}

}

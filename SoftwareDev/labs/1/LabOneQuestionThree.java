//package labs;

import java.util.Scanner;

public class LabOneQuestionThree {

	public static void main(String[] args) {
		// A Program that reads a number is ounces and converts to grams 
				// Create a Scanner input 
				Scanner input = new Scanner(System.in); 
				
				// Prompt the user
				System.out.println("Please Enter a value for ounces: ");
				double ounces = input.nextDouble(); 
				
				double grams = 28.3495; 
				double calculateOunce = ounces * grams; 
				
				System.out.println(ounces + " ounces is " + calculateOunce); 
				

	}

}

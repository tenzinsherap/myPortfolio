package labs;

import java.util.Scanner;

public class LabOneQuestionFour {

	public static void main(String[] args) {
	// Calculate the energy using the famous equation for relativity 
		
		Scanner input = new Scanner(System.in); 
		
		//Prompt the user for Mass: 
		System.out.println("Please enter a value for Mass: "); 
		double mass = input.nextDouble(); 
		
		//Prompt the user for speed: 
		System.out.println("Please enter a value for C: "); // JA: This is a constant
		double speed = input.nextDouble(); 
		
		// Calculate energy 
		
		double energy = mass * (speed*speed); 
		System.out.println("The mass is " + mass + " The speed is "+ speed + " The energy is " + energy);  

	}

}

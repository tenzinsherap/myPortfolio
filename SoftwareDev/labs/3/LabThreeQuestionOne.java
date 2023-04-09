package labs;

import java.util.Scanner;

public class LabThreeQuestionOne {

	public static void main(String[] args) {
		int number; 
		int even = 0; 
		int total = 0;
		int count = 0; 
		int average = 0; 
		
		do { 
			Scanner input = new Scanner(System.in); 
			// Prompt User To Input Numbers
			System.out.println("Please Enter Integer (input ends if it is 0): ");
			number = input.nextInt();
			
			// Validate number to not count 0 
			if (number !=0) {
				count ++; 		
			}
			// Validate if number is even and not count 0 
			if (number % 2 == 0 && number != 0) { 
				even ++; 
		}
			// Add number to total 
		total += number;
			// Divide total to count
		average = total/count; 
			
			// Validate code to end after 0 is entered 
		} while (number != 0); 
		
		System.out.println("The number of even numbers: " + even);
		System.out.println("The sum is: " + total); 
		System.out.println("The average is: " + average); 
		
			}
	}
		
		
	
		
	



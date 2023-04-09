package labs;

import java.util.Scanner;

public class LabTwoQuestionFour {

	public static void main(String[] args) {
		// A Program that prompts the user to enter two characters and adds them up 
		
		Scanner input = new Scanner(System.in); 
		
		// Prompt for first character 
		System.out.println("Enter First Character: "); 
		String firstCharacter = input.nextLine(); 
		char ch = firstCharacter.charAt(0);
		Character.getNumericValue(ch); 
	
		
		// Prompt for second character 
		System.out.println("Enter Second Character: "); 
		String secondCharacter = input.nextLine();
		char ch1 = secondCharacter.charAt(0); 
		Character.getNumericValue(ch1); 
		
		System.out.println(ch + ch1); 
		
		
	}

}

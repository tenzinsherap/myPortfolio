import java.util.Scanner;

public class LabTwoQuestionFive {

	public static void main(String[] args) {
		// A Program that prompts the user for 2 strings and compares them 
		// Lexicographically
		
		Scanner input = new Scanner(System.in); 
		
		// Prompt for first String 
		System.out.println("Enter First String: "); 	
		String str1 = input.nextLine(); 
		
		System.out.println("Enter Second String: "); 
		String str2 = input.nextLine(); 
		
		if (str1.compareTo(str2)< 0) { 
			System.out.println("The Lexicographical order are " + str1 + " " + str2); 
		} else { 
			System.out.println("The Lexicographical order are " + str2 + " " + str1); 
		}
	}

}

package labs; 
import java.util.*;
public class LabFourQuestionThree {

	public static void main(String args[]) {
		//  Program that ask user for a string and validate if its Palindrome 
		
		// Prompt user for string
		System.out.print("Please Enter a String: ");

		Scanner input = new Scanner(System.in);
		String S = input.nextLine();
		
		// Call method 
		if(isPalindrome(S)) {
			System.out.println("The String is Palindrome!");
			
		} else {
			System.out.println("The String is not Palindrome!");
			}
		}
	
	public static String reverse(String s) {
		// Method that reverese's string
		
		String temp = "";
		for(int i=s.length()-1 ; i>=0 ;i--) {
			temp = temp + s.charAt(i);
			} return temp;
		}

	public static boolean isPalindrome(String s) {
		// Method that checks if input matches word reversed 
		
		int character = 1;
		String s_reversed = reverse(s);
		for(int i=0 ; i<s.length(); i++) {
			if(s.charAt(i) != s_reversed.charAt(i)) {
				character = 0;
				break;
				}
			}
		
		if(character==0) {
			return false;
			} else {
				return true;
		}
	}
}
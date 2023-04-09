import java.util.Scanner;

public class LabThreeQuestionSix {

	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		Scanner input = new Scanner(System.in);
		String s = input.next();

		System.out.println("Vowel Count : "+vowelCount(s)); 

	}
	public static int vowelCount(String s){

		int count = 0; 
		// For loop to find vowels in string
		for (int i = 0; i < s.length() ; i++ ) {
		// Fetch the character
		char character = s.charAt(i); 
		// Validate if input has vowels using OR 
		if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){ 
		count++; 
			}
		}
		return count;
		}
}

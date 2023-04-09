package labs;
import java.util.Scanner;

public class LabTwoQuestionTwo {

	public static void main(String[] args) {
		// Program that prompts the user to enter num for the month 
		
		Scanner input = new Scanner(System.in); 
		
		// Prompt the user for number 
		System.out.println("Please enter the number:  ");
		int num = input.nextInt(); 
		
		
 
		// Validate the months 
		
		if (num == 1) { 
			System.out.println("Your month is January"); 
		}
		if (num == 2) { 
			System.out.println("Your month is February"); 
		}
		if (num == 3) { 
			System.out.println("Your month is March"); 
		}
		if (num == 4) { 
			System.out.println("Your month is April"); 
		}
		if (num == 5) {
			System.out.println("Your month is May"); 
		}
		if (num == 6) { 
			System.out.println("Your month is June"); 
		}
		if (num == 7) { 
			System.out.println("Your month is July"); 
		}
		if (num == 8) { 
			System.out.println("Your month is August"); 
		}
		if (num == 9) { 
			System.out.println("Your month is September"); 
		}
		if (num == 10) { 
			System.out.println("Your month is October"); 
		}
		if (num == 11) { 
			System.out.println("Your month is November"); 
		}
		if (num == 12) { 
			System.out.println("Your month is December"); 
		} else { 
			System.out.println("There are no months associated with that number"); 
		}

	
	}

}

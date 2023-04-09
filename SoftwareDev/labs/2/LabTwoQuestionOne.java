package labs;
import java.util.Scanner;

public class LabTwoQuestionOne {

	public static void main(String[] args) {

		// A program that takes two nums and prints expressions 
		
		
		Scanner input = new Scanner(System.in); 
		
		// Prompt the user for number 1
		System.out.println("Enter Number 1: ");
		int num1 = input.nextInt(); 
		
		// Prompt the user for number 2 
		System.out.println("Enter Number 2: ");
		int num2 = input.nextInt();
		
		// If statements
		
		if (num1 < num2) { 
			System.out.println(num1 + " is LESS THAN " + num2 + " True");
		} else { 
			System.out.println(num1 + " is LESS THAN " + num2 + " False");
		}
		if (num1<=num2) { 
			System.out.println(num1 + " is LESS THAN OR EQUAL TO " + num2 + " True");
		} else { 
			System.out.println(num1 + " is LESS THAN OR EQUAL TO " + num2 + " False");
		}
		if (num1 == num2 ) { 
			System.out.println(num1 + " is EQUAL TO " + num2 + " True");
		} else { 
			System.out.println(num1 + " is EQUAL TO " + num2 + " False"); 
		}
		if (num1 != num2) { 
			System.out.println(num1 + " is NOT EQUAL TO " + num2 + " True");
		} else { 
			System.out.println(num1 + " is NOT EQUAL TO " + num2 + " False"); 
		}
		if (num1 > num2) {
			System.out.println(num1 + " is GREATER THAN " + num2 + " True"); 
		} else { 
			System.out.println(num1 + " is GREATER THAN " + num2 + " False"); 
		}
		if (num1 >= num2) { 
			System.out.println(num1 + " is GREATER THAN OR EQUAL TO " + num2 + " True"); 
		} else { 
			System.out.println(num1 + " is GREATER THAN OR EQUAL TO " + num2 + " False"); 
		}
		
	}

}

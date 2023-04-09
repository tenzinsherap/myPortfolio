package labs;
import java.util.Scanner;

public class LabTwoQuestionThree {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		// Prompt the user for number 1
		System.out.println("Enter Lower Limit Integer: ");
		int Lowerlimit = input.nextInt(); 
				
		// Prompt the user for number 2 
		System.out.println("Enter Upper Limit Integer: ");
		int Upperlimit = input.nextInt();


		int rand = (int)(Math.random()*(Upperlimit - Lowerlimit + 1) + Lowerlimit); // JA
		//JA: It was three random numbers
		System.out.println("Random Number " + rand); 
	}

}

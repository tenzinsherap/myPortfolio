package labs;
import java.util.Scanner;
public class LabFourQuestionFour {


public static void main(String argv[]) {

	Scanner input = new Scanner(System.in);
	String string;

	//Prompt user for string
	System.out.print("Please Enter A String:"); 
	string=input.nextLine();//reading line

	// Store array in count 

	int []count = new int[125];
	
	//increase position each iteration
	for(int i=0;i<string.length();i++) {
		count[string.charAt(i)]++;
	}

	System.out.println(" "); 
	System.out.println("Character counts:");
	System.out.println(" "); 


	for(int i=97;i<124;i++) {
		if(count[i]!=0)
		System.out.println("Occurences of "+(char)i+" :"+count[i]);
		
		}
	}
}



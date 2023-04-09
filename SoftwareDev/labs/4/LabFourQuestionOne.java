package labs;

public class LabFourQuestionOne {

	public static void main(String[] args) {
		// Program that show a table of conversion from inch to cm 
		
		// Display Heading
		System.out.println("        Inches to Centimeter Table");
	
		System.out.println(" ");
		
		System.out.println("in      cm | cm       in"
				+ ""); 
		System.out.println("------------------------");
		
		for (int i = 1, j =1; i <=50; j = j+5, i++) { 
			System.out.printf("\n%2d",i);
			System.out.printf("%9.2f", i * 2.54);
			System.out.printf("|%2d", j);
			System.out.printf("%10.2f", j * 0.39);
		}
	}
}
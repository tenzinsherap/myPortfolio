package labs;
import java.util.Scanner;
public class LabFiveQuestionOne {

	public static void main(String[] args) {
		// Program that  finds the largest element in an array of double values with the
		// following header:
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 floating point numbers: ");
		
		double array[] = new double[10];
		
		for (int i = 0; i < 10; i++) {
		
		array[i] = Integer.parseInt(input.nextLine());
		
		}
		
		System.out.println("Max element in the array is: " + max(array));
			
		}
	public static double max(double[] array) {
	

		double maximum = array[0];
		
		for (int i = 0; i < array.length; i++)
		
			if (array[i] > maximum)
			
				maximum = array[i];
		
		return maximum;
	
	}
	
}
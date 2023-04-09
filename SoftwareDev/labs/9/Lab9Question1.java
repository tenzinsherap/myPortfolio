//package labs;
import java.util.Random;
import java.util.Scanner;

public class Lab9Question1 {
	public static void main(String[] args) {
		// Program with 100 random arrays 
		Scanner input = new Scanner(System.in);
		
		// Initialize Random Rand
		Random rand = new Random();
		
		int size = 100;
		// Declare Array
		int[] array = new int[size];
		// For Loop to check array
		for (int i = 0; i < size; i++) {
			array[i] = rand.nextInt(100);
}
		System.out.print("Enter index value between 0 - " + (size - 1) + " : ");
		int index = input.nextInt();
		if (index < 0 || index > size - 1) {
			System.out.println("Out of Bounds");
			} else {
				System.out.println("The value in the index is : " + array[index]);
				}
		}
	}
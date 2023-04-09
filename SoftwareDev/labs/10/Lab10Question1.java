package labs;
import java.io.*;
import java.util.*;

public class  Lab10Question1 {
	// Program to generate 100 random integers into a file 
	public static void main(String[] args) throws IOException { 
		
		//Create file object
		FileOutputStream output = null;
		// Generate Rand Number
		Random rn = new Random();
		output = new FileOutputStream("Exercise10_1.txt");
		
		for(int i = 0; i < 100; i++) {
			int num = rn.nextInt();
			output.write(num);
			output.write(' ');
		}
		output.close();
		
		FileInputStream input = null;
		int[] num = new int[100];
		input = new FileInputStream("Exercise10_1.txt");
		for(int i = 0; i < 100; i++)
			num[i] = input.read();
		for(int i = 0; i < 99; i++)
			for(int j = 0; j < 99-i; j++)
				if(num[j] > num[j+1]) {
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					}
		System.out.println("The Random Elements Sorted: ");
		for(int i = 0; i < 100; i++)
			System.out.print(num[i]+" ");   
	}
}
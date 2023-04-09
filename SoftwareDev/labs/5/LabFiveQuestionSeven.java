package labs;

import java.util.Scanner;
public class LabFiveQuestionSeven {
public static void main(String arg[]){
	
	// Program to check whether matrix is upper triangular 
	
	Scanner input = new Scanner(System.in);
	
	//Declares a matrix
	
	int matrix[][];
	
	System.out.print("\n Enter the size of the square matrix: ");
	
	int size = input.nextInt();
	
	//Initialize Matrix 
	
	matrix = new int[size][size];
	
	System.out.print("\n Enter the elements row by row: ");
	
	
	//Loops till number of rows
	
	for (int r = 0; r < matrix.length; r++)
	
	//Loops till number of column
	
	for (int c = 0; c < matrix[r].length; c++)
	
	matrix[r][c] = input.nextInt();
	
	if(checkUpperTriangular(matrix))
		System.out.print("\n Matrix is an upper triangular matrix.");
	else
		System.out.print("\n Matrix is not an upper triangular matrix.");
	
	}	

public static boolean checkUpperTriangular(int matrix[][]) {

	//Loops till number of rows
	
	for (int r = 1; r < matrix.length ; r++)
	
	//Loops till current row
	
	for (int c = 0; c < r; c++)
		if (matrix[r][c] != 0)
			return false;
	return true;
	
	}	

}

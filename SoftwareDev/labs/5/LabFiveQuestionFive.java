package labs;

import java.util.Scanner;

public class LabFiveQuestionFive {

public static void main(String[] args) {
	// Program  to transpose a matrix
	int size;

	// Input size of the matrix

	Scanner input = new Scanner(System.in);

	System.out.println("Please Enter the size of matrix");

	size = input.nextInt();

  

	int mat[][]=new int[size][size];

	System.out.println("Please Enter numbers into the matrix");
	
	
	for(int i=0;i<3;i++){   

		for(int j=0;j<3;j++){

			mat[i][j] = input.nextInt();  

		}

}

	System.out.println("Original matrix");
	
	// print from array 
	for(int i=0;i<size;i++){   

		for(int j=0;j<size;j++){

			System.out.print(mat[i][j] + " ");

		}

		System.out.println();
}


	System.out.println("Transpose of the matrix");
	// Reverse columns 
	for(int i=0;i<size;i++){   

		for(int j=0;j<size;j++){

			System.out.print(mat[j][i] + " ");
}

		System.out.println();

		}
	}
}
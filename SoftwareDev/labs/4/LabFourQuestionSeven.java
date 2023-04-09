package labs;

import java.util.Scanner;

public class LabFourQuestionSeven {

 public static void main(String args[]) {
	 Scanner input =new Scanner(System.in);

	 int Arrsize; 
	 int i = 0; 
	 int j = 0; 

	 System.out.print("Enter array size : ");

	 Arrsize=input.nextInt();


	 int[] array=new int[Arrsize+1];

	 array[Arrsize]=-1;

	 // Prompt User For Elements
	 System.out.print("Please Enter Some Numbers : ");

	 //loop to read elements

	 while(i<Arrsize) {
		 array[i]=input.nextInt();
		 i++;
	}

	 System.out.print("Array before Filtering :\n");
	 //loop to print array
	 i=0;
	 while(array[i]!=-1) {
		 System.out.print(""+array[i]+", ");
		 i++;
	}

	 //filtering the duplicate elements
	 i=0;
	 j=0;
	 while(array[i]!=-1) {
		 j=0;
	while(array[j]!=-1) {
		
	//Find duplicate
		
		if(array[i]==array[j] && i!=j){
			int k=j;
		
	//Delete duplicate
		
	while(array[k]!=-1)
	array[k]=array[++k];
		
	array[k-1]=-1; } 
		j++;
	}
	i++;
	}

	 System.out.print("\nArray after Filtering :\n");
	
	 i=0;
	 while(array[i]!=-1) {
		 System.out.print(""+array[i]+", ");
		 i++;

	 	}
 	}
}
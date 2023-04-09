package labs;

import java.util.Scanner;

public class LabFourQuestionSix {
	public static void main(String argv[]) {
		// Program that stores a list of positive numbers into an array
		
		// End at -1 
		int a[]={-1};

		for(int i=1;i<=10;i++){
		a=addNum(a,i);
	}
		System.out.println("Array: ");
		for(int i:a) 
		System.out.print(i+" ");
		System.out.println();
		
		// Replace 3 by 10 
		a=insert(a,10,3);
		System.out.println("\nArray replace 3 by 10: ");
		for(int i:a) 
		System.out.print(i+" ");
		System.out.println();
		
		// Replace 7 by 100
		a=insert(a,100,7);
		System.out.println("\nArray replace 7 by 10: ");
		for(int i:a)
		System.out.print(i+" ");
		System.out.println();
	}
		// method to add a number at the end of list
		private static int[] addNum(int[] a, int n) {
		int b[]=new int[a.length+1];
		for(int i=0;i<a.length-1;i++){
		b[i]=a[i];
	}
		b[b.length-2]=n;
		b[b.length-1]=-1;
		return b;
	}
		// method to add number in list
		private static int[] insert(int a[],int i, int j) {
		a[j]=i;
		return a;
	}
}

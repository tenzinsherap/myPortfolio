package labs;

import java.util.*;

public class LabFiveQuestionFour {
public static void main (String[] args) {
	// Program that checks whether arrays are identical or not 
		Scanner input=new Scanner(System.in);
	    System.out.println("Please Enter first sets : ");
	    
	    int n=input.nextInt();
	// Store into array 
	    int []x=new int[n];
	    for(int i=0;i<n;i++)
	    x[i]=input.nextInt();

	    System.out.println("Please Enter second sets : ");
	    int m=input.nextInt();
	    int []y=new int[m];
	    for(int i=0;i<m;i++)
	    y[i]=input.nextInt();
	   
	 // Invoke method 
	    if(equal(x,y))
	    System.out.println("The two arrays are identical.");
	    else
	   	System.out.println("The two arrays are not identical.");
}
public static boolean equal(int[] x, int[] y) {
      
	   Arrays.sort(x);
       Arrays.sort(y);
       // Checks for length 
       
       int l1=x.length;
       int l2=y.length;
       
       // Checks each index to see if it matches
       if(l1!=l2)
       return false;
       else
       {
           for(int i=0;i<l1;i++)
           {
               if(x[i]!=y[i])
               return false;
           }
       }
       return true;
   }
  
}
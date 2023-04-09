package labs;

import java.util.Scanner;
public class LabFiveQuestionThree{
   public static void main(String[] args) {

   // Program that takes the number of students from the user, for each student
	   //it will take the name and the score. 
   Scanner input=new Scanner(System.in);
   System.out.println("Enter number of students ");
   
   		// Num of students
       int numStu=input.nextInt();
   
       //size of array for string    
       String names[]=new String[numStu];
       
       int score[]=new int[numStu];
      
     //For loop to read name and score
       	for(int i=0;i<numStu;i++){
       		System.out.println("Enter name ");
       		names[i]=input.next();
       		System.out.println("Enter Score ");
       		score[i]=input.nextInt();
       }
       //sort the array based on score 
     
       for (int i = 0; i < numStu-1; i++)
    	   for (int j = 0; j < numStu-i-1; j++)
    		   if (score[j] > score[j+1]) {
    			   int temp = score[j];
    			   score[j] = score[j+1];
    			   score[j+1] = temp;
    			   String temp1=names[j];
    			   names[j]=names[j+1];
    			   names[j+1]=temp1;
    			  }
     //print the names and scores
       for(int i=0;i<numStu;i++){
    	   System.out.println( "Name is "+names[i]+" score is "+score[i]);
    	   }
  
   }
}
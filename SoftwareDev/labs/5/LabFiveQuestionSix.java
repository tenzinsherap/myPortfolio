package labs;
import java.util.*;
public class LabFiveQuestionSix {
public static void main(String args[]) {
	
	// Program that  computes the average of the values of a row in a 2d array. 
	Scanner input =new Scanner(System.in);
    System.out.println("Please Enter length: ");
    
    int len=input .nextInt();
  
    // Invoke matrix 
    double matrix[][]=new double[len][len];
    System.out.println("Please Enter element: ");
    
    for(int i=0;i<len;i++) {
    	for(int j=0;j<len;j++) {
                matrix[i][j]=input.nextDouble();
            }
        }
        System.out.println("Average is: "+ averageRow(matrix,len));
    }
    
public static double averageRow(double[][] array,int column) {
	double sum = 0;


    // for loop to calc sum 
    for (int i = 0; i < column; i++)
    for (int j = 0; j < column; j++)
        sum += array[i][j];

    return (double)sum / (column * column);
    }
}

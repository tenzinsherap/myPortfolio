package labs;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ClassyProblem {

    public static void main(String[] args){
    	//Prompt User for input
	    Scanner input = new Scanner(System.in);
	    System.out.print("Please Enter The Variables: ");
	    int var = input.nextInt();
	    input.nextLine();
	    int max = 0;
	
	    //Input from user 
	    String[] rawData = new String[var];
	    String[] names = new String[var];
	
	
	    for (int i = 0; i < var; i++) {
	    	rawData[i] = input.nextLine();
	    }
	
	    //find maximum never of levels
	    for(int i = 0; i < var; i++){
	    	if(rawData[i].split(" ").length - 2 > max){
	    		max = rawData[i].split(" ").length - 2;
	           }
	    }
	
	    //creating array to store levels of classes
	    int[][] levels = new int[var][max];
	    //Parsing and storing data from rawData to levels and names array
	    for (int i = 0; i < var; i++) {
	    	String[] x = rawData[i].split(" ");
	    	names[i] = x[0].substring(0, x[0].length() - 1);
	    	for (int j = 0; j < max; j++) {
	    		int len = x.length - 2;
	    		if(j < len){
	    			if(x[len - j].equals("upper")){
	    				levels[i][j] = 3;
	                }
	    			if(x[len - j].equals("middle")){
	    				levels[i][j] = 2;
	                }
	    			if(x[len - j].equals("lower")){
	    				levels[i][j] = 1;
	                }
	                }else{
	                    //middle class
	                	levels[i][j] = 2;
	                }
	    	}
}
	    int[][] rankScore = new int[var][2];
	    for (int i = 0; i < var; i++) {
	    	for (int j = 0; j < max; j++) {
	    		rankScore[i][0] = i;
	    		rankScore[i][1] += (max - j) * levels[i][j];
	          }
	    }
	
	        //Sort the array; higher rank on top 
	    Arrays.sort(rankScore, new Comparator<int[]>() {
	           
	 public int compare(int[] z, int[] y) {
		 final int num1_score = z[1];
		 final int num2_score = y[1];
		 final int num1_pos = z[0];
		 final int num2_pos = y[0];
		 
	     if(num1_score != num2_score){
	    	 return Integer.compare(num2_score, num1_score);
	         }else{
	        	 return names[num1_pos].compareTo(names[num2_pos]);
	               }
	          }
	       });
	
	        // Print Names using sorted indexes from rankScore
	        for (int i = 0; i < var; i++) {
	            System.out.println(names[rankScore[i][0]]);
	        }
	    }
}

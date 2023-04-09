package labs;

import java.io.*;
import java.util.*;
public class Lab10Question2 {

    public static void main(String[] args) throws Exception{
    	// Program that replaces text in a source file 
    	//Check command line parameter usage 
        if(args.length !=3){
            System.out.println("Data has been found");
            System.exit(1);
        }

        // Check for file 
         File sourceFile = new File(args[0]);
         if(!sourceFile.exists()){
             System.out.println("File "+ args[0] + " does not exist");
             System.exit(2);
         }
         // Create new file
         File targetFile = new File("New.txt");
  
       
         Scanner input =new Scanner(sourceFile);
         PrintWriter output = new PrintWriter(targetFile);
         while(input.hasNextLine()){
             String s1 = input.nextLine();
             String s2 = s1.replace(args[1], args[2]);
             output.println(s2);
         }
         // Close input and output
         input.close();
         output.close();
         // Delete and Rename file
         sourceFile.delete();
         targetFile.renameTo(sourceFile);

    }
  
}
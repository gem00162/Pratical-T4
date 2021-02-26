import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;
import java.util.Scanner;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */

public class FilesInOut {
    public static void main(String[] args) throws FileNotFoundException {

  
    	
        
        
    	// Initially it will be easier to hardcode suitable file names.
    	

        
     	// Add suitable code into the above processing (because you need to do this line by line also.
        
     	// That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

     {
         File inputFile = new File("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\Files T4\\\\input.txt");
         File outputFile = new File("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\Files T4\\\\output.txt");
         // Replace this with statements to set the file name (input) and file name (output).
         Scanner in = new Scanner(inputFile);
         PrintWriter out = new PrintWriter(outputFile);// Set up a new PrintWriter to write the output file.

         String line;
         
         while (in.hasNextLine()) 
         {   
        	 
        	 
             // Read in the line and convert it to upper case
             line = in.nextLine().toUpperCase();

             // Print the result to the console
             System.out.println(line);

             // Write the read in line to the output file with a new line character
             out.print(line + "\n");
         }

         // Close any resources used
         out.close();
         in.close();
     }
     
     {
         File inputFilem = new File("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\Files T4\\\\inputm.txt");
         File outputFilem = new File("C:\\\\Users\\\\User\\\\OneDrive\\\\Documents\\\\Files T4\\\\outputm.txt");
         Scanner in = new Scanner(inputFilem);
         PrintWriter out = new PrintWriter(outputFilem);

         String line;
         
         while (in.hasNextLine()) 
         {   
             // Read in the line and convert it to upper case
             line = in.nextLine().toUpperCase();

             // Print the result to the console
             System.out.println(line);

             // Write the read in line to the output file with a new line character
             out.print(line + "\n");
            
       }

         // Close any resources used
         out.close();
         in.close();
     }
    
    } // main


    }
// FilesInOut

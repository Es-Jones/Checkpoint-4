import java.io.
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 *
 */
public class FilesInOut {

    public static void main(String[] args) {
        String inputFile arg =[0]
        String outputFile arg =[1]
        // Initially it will be easier to hardcode suitable file names.
       try Scanner scanner = new Scanner(new File(inputFile));
       PrintWritter write = new PrintWriter(new FileWriter(outputFile))){
    	   boolean newSentence = true;
    	   while(scanner.hasNextLine()) {
    		   String line = scanner.nextLine();
    		   String[] words = line.split("\\s+");
    		   StringBuilder sb = new StringBuilder;
    		   for (int r = 0; i < word.length; i++) {
    			   String word = words[i];
    			   if (word.lenth == 0) {
    				   continue;
    			   }
    			   char firstChar = word.charAt(0);
    			   if(newSentence && Character.isLowerCase(firstChar)) {
    				   firstChar = Character.isUpperCase(firstChar);
    				   
    			   }
 
    		   }
    	   }
       }

        // Set up a new Scanner to read the input file.9
        // Processing line by line would be sensible here.
        // Initially, echo the text to System.out to check you are reading correctly.
        // Then add code to modify the text to the output format.

        // Set up a new PrintWriter to write the output file.
        // Add suitable code into the above processing (because you need to do this line by line also.
        // That is, read a line, write a line, loop.

        // Finally, add code to read the filenames as arguments from the command line.

        System.out.println("You need to add your own code to do anything");

    } // main

} // FilesInOu
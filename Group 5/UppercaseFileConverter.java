/*
   This program demonstrates the file reader and writer -  
   Program takes in a file containing a list, capitalizes 
   the first letter of each line, and saves the contents
   to a new file.
*/

import java.util.*; 
import java.io.*; // needed for File IO classes

public class UppercaseFileConverter 
{ 
   public static void main (String [] args) throws IOException 
   { 
      // declares variables
      String inputFile;
      String outputFile;
      
      // calls in new instance of scanner
      Scanner in = new Scanner(System.in);
      
      // gets file name to read
      System.out.print("Please enter the name of the file" +
                       " containing the data you wish to alter: "); 
      inputFile = in.nextLine();

      // gets file name to write to
      System.out.print("Please enter the name of the file" +
                       " you would like to write to: "); 
      outputFile = in.nextLine(); 
 
      // creates new instance of FileReader
      FileReader reader = new FileReader(inputFile); 
      
      // creates new instance of PrintWriter
      PrintWriter writer = new PrintWriter(outputFile);

      // creates new instance of Scanner, connecting to reader
      Scanner fileReader = new Scanner(reader);
      
      // while loop, causing first letter to capitalize 
      while(fileReader.hasNext()) { 
         String name = fileReader.nextLine();
         name = Character.toUpperCase(name.charAt(0)) + name.substring(1);       
         writer.println(name); 
      } 
      
      // closes the file reader
      fileReader.close();
      
      // closes the file writer 
      writer.close(); 
      
      // notification of completion
      System.out.println("The contents of " +inputFile+
                         " has been altered and saved to" 
                         +outputFile+ ""); 
   } 
} 

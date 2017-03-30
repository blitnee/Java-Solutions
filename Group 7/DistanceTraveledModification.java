/* 
   This program demonstrates writing data to a file. 
*/

import java.util.Scanner;  // calls in scanner
import java.io.*; // needed for File IO classes

public class DistanceTraveledModification
{
   public static void main(String[] args) throws IOException
   {
      String filename; // file name
      
      int speed;  // speed of vechicle
      int hours;  // hours spent driving
      int count;  // holds count
  

      // creates new instance of scanner
      Scanner keyboard = new Scanner(System.in);
      
      // gets speed
      System.out.print("What is the speed of your " +
                        "vehicle (in mph)?");
      speed = keyboard.nextInt();
      
      // gets hours
      System.out.print("How many hours has your vehicle " +
                        "been traveling?");
      hours = keyboard.nextInt();
      
      // consumes the remaining newline character
      keyboard.nextLine();
      
      // gets file name
      System.out.print("Please enter the name of the " +
                        "file you would like to write to: ");
      filename = keyboard.nextLine();
      
      // writes data
      distance(speed, hours, filename);

      System.out.println("Data has been written to the file.");
      
            System.exit(0);
   }

    
   /** 
      Sub-method
   */

   public static int distance(int speed, int hours, String filename)throws IOException
   {
      int count;
      
      // opens the file
      PrintWriter outputFile = new PrintWriter(filename);
     
      // table format, writes to the file
      outputFile.println("Hours   Distance Traveled");
      outputFile.println("-----------------------");
      
      // for loop
      for (count = 1; count <= hours; count++)
      {     
         // calculation and print
         outputFile.println(count + "\t\t" + (count * speed));
      }
            
      // closes the file
      outputFile.close();
      
      return count;
    }
}


/**
   You must complete this program so it calculates
   and displays the area of a rectangle. 
*/

// Insert any necessary import statements here.

import java.util.Scanner; // calls in scanner
import java.io.*; 

public class AreaRectangle
{
   public static void main(String[] args) throws IOException
   {
      double length,    // The rectangle's length
             width,     // The rectangle's width
             area;      // The rectangle's area
   
      // Get the rectangle's length from the user.
      length = getLength();
   
      // Get the rectangle's width from the user.
      width = getWidth();

      // Get the rectangle's area.
      area = getArea(length, width);

      // Display the rectangle data.
      displayData(length, width, area);
   }
   
   
   // sub-method to get length
   public static double getLength()
   {
      // creates new instance of scanner
      Scanner keyboard = new Scanner(System.in);
      
      // gets length
      System.out.println("Please enter item's length. ");
      double length = keyboard.nextDouble();
      return length;
   }
   
   // sub-method to get width
   public static double getWidth()
   {
      // creates new instance of scanner
      Scanner keyboard = new Scanner(System.in);
      
      // gets width
      System.out.println("Please enter item's width. ");
      double width = keyboard.nextDouble();
      return width;
   }
   
   // sub-method to get area
   public static double getArea(double length, double width)
   {
      // calculations to get area
      double area = (length * width);
      return area;
   }
   
   //sub-method to display data
   public static String displayData(double length, double width, double area)
   {

      // print statement to displays data
      String display = ("The rectangle's length = " + length + 
                         " The rectangle's width = " + width +
                         " The rectangle's area = " + area +
                         "");
      System.out.println(display);
      return display;
   }
}


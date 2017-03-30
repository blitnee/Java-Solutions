/*
   This program demonstrates...
*/

import java.util.Scanner;  // calls in scanner
import java.io.*;    

public class RetailPriceCalculator
{ 
   public static void main(String[] args) //throws IOException
   {
      // holds values
      double whole, markup, price;
      
      // creates new instance of scanner
      Scanner keyboard = new Scanner(System.in);
      
      // gets wholesale price
      System.out.println("Please enter item's wholesale cost.");
      whole = keyboard.nextDouble();
      
      // gets markup percentage
      System.out.println("Please the item's markup percentage" +
                           " as a decimal (Example: 20% = .20).");
      markup = keyboard.nextDouble(); 
      
       
     /*
      
      REMOVED TO SHOW IN SUB-METHOD
      
      // calculations to get price
      double price = whole + (whole * markup);
      
     */
      
      
      // assigns price from calculateRetail
      price = calculateRetail(whole, markup);
      
      // displays price
      System.out.println("The final price is $" + price + "0.");
      
      // exits the program
      System.exit(0);
   }

   public static double calculateRetail(double whole, double markup)
   {
      // calculations to get price
      double price = whole + (whole * markup);
      return price;
   }
}
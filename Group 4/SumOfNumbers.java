//This program demonstartes for loops and calculating sum of numbers counted

import java.util.Scanner;  // calls in scanner

public class SumOfNumbers
{
   public static void main(String[] args)
   {
      int count;  // to hold count number
      int maxValue;  // user value

      // validator

      Scanner keyboard = new Scanner(System.in);   // creates scanner
      
      // gets user input for maxValue
      System.out.print("Please enter a positive nonzero integer: ");
      maxValue = keyboard.nextInt();

      // counting loop
      int sum = 0 ;
      for(count = 0 ; count <= maxValue ; count++){
                     sum = sum + count ;}
      // prints sum          
      System.out.println(sum);
      
      System.exit(0);
    }
}


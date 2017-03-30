// This program calculates the average of three test scores

import java.io.*;
import java.util.*;
public class TestAverageScanner
{
		public static void main(String[] args) throws IOException
		{
			// Declare and construct variables
			String test;
			int testOne, testTwo, testThree;
			int average;
			Scanner scannerIn= new Scanner(System.in);

			// Print prompts and get input
			System.out.println("\tTEST AVERAGE CALCULATOR");
			System.out.println();
			System.out.print("\tEnter your score for Test 1: ");
				// Height = dataIn.readLine();
				testOne = scannerIn.nextInt();
			System.out.print("\tEnter your score for Test 2: ");
				// Weight = dataIn.readLine();
				testTwo = scannerIn.nextInt();
         System.out.print("\tEnter your score for Test 3: ");
				// Weight = dataIn.readLine();
				testThree = scannerIn.nextInt();

			// Calculations
			average = (testOne + testTwo + testThree)/3;

			// Output
			System.out.println();
         System.out.println("\tYour Score for Test 1 = " + Math.round(testOne) + "");
         System.out.println("\tYour Score for Test 2 = " + Math.round(testTwo) + "");
			System.out.println("\tYour Score for Test 3 = " + Math.round(testThree) + "");
         System.out.println("\tYour Test Score Average = " + Math.round(average) + "");
			System.out.println();
		}
}
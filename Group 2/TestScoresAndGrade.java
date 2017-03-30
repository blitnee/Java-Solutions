// This program holds three scores and calculates the average

import javax.swing.JOptionPane;
public class TestScoresAndGrade 
{
   public static void main(String[] args)
   {
      // Decalres and constructs variables
      double score1, score2, score3; // Holds scores 1, 2, and 3
      double average; // To hold the average score
      String input; // Declares user input

		// Print prompt and get input
      input = JOptionPane.showInputDialog("Enter score for Test 1: ");
      score1 = Double.parseDouble(input);
      
		// Print prompt and get input
      input = JOptionPane.showInputDialog("Enter score for Test 2: ");
      score2 = Double.parseDouble(input);

		// Print prompt and get input
      input = JOptionPane.showInputDialog("Enter score for Test 3: ");
      score3 = Double.parseDouble(input);
      
      // Calculates the average
      average = (score1 + score2 + score3) / 3.0;
      
      // Prints average score
      JOptionPane.showMessageDialog(null, 
                                "Your average is " + average);
      
      // Conditions for Grading, Demonstrates 'if' statements
      if (average >= 90)
            JOptionPane.showMessageDialog(null,
                                "Your letter grade average is an A.");
                                
      else if (average >= 80)
               JOptionPane.showMessageDialog(null,
                                "Your letter grade average is a B.");
                                
      else if (average >= 70)
               JOptionPane.showMessageDialog(null,
                                "Your letter grade average is a C.");
                                
      else if (average >= 60)
               JOptionPane.showMessageDialog(null,
                                "Your letter grade average is a D.");
                                
      else if (average < 60)
               JOptionPane.showMessageDialog(null,
                                "Your letter grade average is an F.");

         
      System.exit(0);
   }
} 
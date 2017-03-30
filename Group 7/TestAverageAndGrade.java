/**
   This program holds five test scores,
   calculates their average, and returns a letter value.
*/

import javax.swing.JOptionPane;
public class TestAverageAndGrade
{
   public static void main(String[] args)
   {
     // Decalres and constructs variables
     double score1, score2, score3, 
            score4, score5; // Holds scores 1 - 5
     double average = 0; // To hold the average score
     String input; // Declares user input

     // Displays average score
     calcAverage(average);
      
     // Displays average letter grade
     determineGrade(average);
      
     // exits program   
     System.exit(0);
   }
   
      
/**
   Sub method that accepts five test scores as arguments,
   then calculates and returns their average.
*/   

   public static double calcAverage(double average)
   {
     String input; // Declares user input
     double score1, score2, score3, 
            score4, score5; // Holds scores 1 - 5
             
     // Print prompt and get input
     input = JOptionPane.showInputDialog("Enter score for Test 1: ");
     score1 = Double.parseDouble(input);
      
	  // Print prompt and get input
     input = JOptionPane.showInputDialog("Enter score for Test 2: ");
     score2 = Double.parseDouble(input);

	  // Print prompt and get input
     input = JOptionPane.showInputDialog("Enter score for Test 3: ");
     score3 = Double.parseDouble(input);
      
     // Print prompt and get input
     input = JOptionPane.showInputDialog("Enter score for Test 4: ");
     score4 = Double.parseDouble(input);
      
     // Print prompt and get input
     input = JOptionPane.showInputDialog("Enter score for Test 5: ");
     score5 = Double.parseDouble(input);
         
     // Calculates the average
     average = (score1 + score2 + score3 +
                score4 + score5) / 5;
     JOptionPane.showMessageDialog(null,
                                "Your average is: "+ average +"");
     return average;
   }
              
/**
   Sub method that accepts the average as a score and returns
   the letter value.
*/   

   public static double determineGrade(double average)
   {  
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
      return average;
   }
} 
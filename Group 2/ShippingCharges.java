// This program calculates the price of shipping based on a package weight

import javax.swing.JOptionPane;
public class ShippingCharges
{
   public static void main(String [] args)
   {
      // Declares variables
      String input; // To hold user input
      double distance = 0;
      double weight = 0;
      double rate = 0;
      double charges = 0;


      // Get weight of package
      input = JOptionPane.showInputDialog("What is the weight of the package being shipped? ");
      weight = Double.parseDouble(input);
      
      input = JOptionPane.showInputDialog("What is the distance this package is being shipped? ");
      distance = Double.parseDouble(input);
      
      // Shipping rate rules
      if (weight <= 2.00)
         rate = 1.10;
         
      else if (weight >= 2.0 && weight <= 6.0)
         rate = 2.20;
 
      else if (weight >= 6.0 && weight <= 10.0)
         rate = 3.70;
      
      else if (weight > 10.0)
         rate = 3.80;
         
         
      // Calculations
      charges = rate * Math.ceil(distance/500);

     
      // Calculate and display the shipping charges 
      JOptionPane.showMessageDialog(null, "The total shipping charge for this package is $" + charges);
      
      System.exit(0);
   }
}

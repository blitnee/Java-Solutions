// This program calculates discounts based on the quantity of packages purchased

import javax.swing.JOptionPane;
public class SoftwareSales
{
   public static void main(String [] args)
   {
      // Declares variables
      int quantity;
      String input; // To hold user input
      double pack = 99;
      double discount = 0;
      double charges = 0;

      // Get number of packages
      input = JOptionPane.showInputDialog("How many packages were ordered? ");
      quantity = Integer.parseInt(input);
  
      // Calculation for full full price
      pack = pack * quantity;
      
      // Discount rules
      if (quantity >= 10 && quantity <= 19)
         discount = (pack * 0.20);
         
      if (quantity >= 20 && quantity <= 49)
         discount = (pack * 0.30);
 
      if (quantity >= 50 && quantity <= 99)
         discount = (pack * 0.40);

      if (quantity >= 100)
         discount = (pack * 0.50);
         
      // Calculation for charges after discount
      charges = (pack - discount);
     
      // Calculate and display the total discount and total charges 
      JOptionPane.showMessageDialog(null, "The discount on this order is $" + discount);
      
      JOptionPane.showMessageDialog(null, "The total charges after discount are $" + charges);
      
      System.exit(0);
   }
}

// This program calculates sales tax

import javax.swing.JOptionPane;

public class SalesTaxJOption
{
   public static void main(String[] args)
   {  
      // Declares Variables
      String purchase;
      double price, tax, total;
      double stateSalesTax, countrySalesTax, totalSalesTax, totalCost;    
      
      final double COUNTRY_TAX = 0.02;  // Country Tax Rate CONSTANT
      final double STATE_TAX = 0.04;   // State Tax Rate CONSTANT
      
      // Print Prompts in JOptionPane, Get User Input
		System.out.println("\tSALES TAX CALCULATOR");
		purchase=JOptionPane.showInputDialog(null,"Enter the cost of your purchase: ");
		   price = Double.parseDouble(purchase);

      // Calculations
      stateSalesTax = price*STATE_TAX;
      countrySalesTax = price*COUNTRY_TAX;
      totalSalesTax = price*(STATE_TAX+COUNTRY_TAX);
      totalCost = price+totalSalesTax;
   
      // Output
      JOptionPane.showMessageDialog(null,"Amount of purchase: $" + 
                                Math.round(price) + ", State sales tax: $" + 
                                Math.round(stateSalesTax) + ", Country sales tax: $" + 
                                Math.round(countrySalesTax) + " Total sales tax: $" + 
                                Math.round(totalSalesTax) + " Total cost: $" + 
                                Math.round(totalCost) + "", "Sales Tax Calculator",JOptionPane.PLAIN_MESSAGE );

      System.exit(0);
	}
}
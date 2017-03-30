// This program calculates the cost of a set commission and stock price

import javax.swing.JOptionPane;

public class StockCommission
{
   public static void main(String[] args)
   {  
      // Declares Variables
      int shares = 600;
      double price = 21.77;
      double commission = 0.02;
      
      // Calculations
      double totalShares = shares*21.77;
      double totalCommission = totalShares*commission;
      double totalPrice = totalShares+totalCommission;
      
      // Displays output
      System.out.println("Amount paid for shares: $" + totalShares + "");
      System.out.println("Amount paid for commission: $" + totalCommission + "");
      System.out.println("Total amount paid: $" + totalPrice + "");

   }
}
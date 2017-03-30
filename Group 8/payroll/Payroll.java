/**
   The CellPhone class holds data about a cell phone.
*/

public class Payroll
{
   // Fields
   private String Name; // name
   private double idNumber; // id number
   private double hourlyRate; // hourly rate
   private double hoursWorked; // hours worked
   double grossPay; // gross pay
      
   // Constructor
   public Payroll(String name, double id, double rate, double hours)
   {
      Name = name;
      idNumber = id;
      hourlyRate = rate;
      hoursWorked = hours;
   }

   //Mutator
   public String getName()
   {
      return Name;
   }
   
   public double getID()
   {
      return idNumber;
   }

   public double getRate()
   {
      return hourlyRate;
   }
   
   public double getHours()
   {
      return hoursWorked;
   }
   
   public double getGrossPay()
   {
      grossPay = (hourlyRate * hoursWorked);
      return grossPay;
   }
}
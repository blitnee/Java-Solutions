import java.util.Scanner;

/**
   This program runs a simple test
   of the Payroll class.
*/

public class PayrollDemo
{
   public static void main(String[] args)
   {
      String employeeName;   // To hold name
      double employeeIdNumber;   // To hold id number
      double employeeHourlyRate; // To hold rate
      double employeeHoursWorked; // To hold hours
      
      // Calls in scanner
      Scanner keyboard = new Scanner(System.in);
      
      // Get Employee Name
      System.out.print("Enter Employee Name: ");
      employeeName = keyboard.nextLine();
      
      // Get Employee ID Number
      System.out.print("Enter Employee Id Number: ");
      employeeIdNumber = keyboard.nextDouble();
      
      // Get Employee Hourly Rate
      System.out.print("Enter Employee Hourly Rate: ");
      employeeHourlyRate = keyboard.nextDouble();
      
      // Get Employee Hours Worked
      System.out.print("Enter Employee Hours Worked: ");
      employeeHoursWorked = keyboard.nextDouble();
      
      // Create an instance of the employee class,
      // passing the data that was entered as arguments
      // to the constructor
      Payroll employee = new Payroll(employeeName, employeeIdNumber, 
                           employeeHourlyRate, employeeHoursWorked);

      // Get the data and display it
      System.out.println();
      System.out.println("Employee Name: " +employee.getName());
      System.out.println("Employee ID Number: " +employee.getID());
      System.out.println("Employee Hourly Rate: " +employee.getRate());  
      System.out.println("Employee Hours Worked: " +employee.getHours());   
      System.out.println("Employee Gross Pay: $" +employee.getGrossPay() +"0");
   }
}
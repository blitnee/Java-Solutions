import java.util.Scanner;

public class PayrollClassDemo 
{
	public static void main(String[] args) 
	{
	   //Fields
		int employeeId; // To hold employeeId
      int hours; // To hold hours
      double payRate; // To hold pay
		double wages; // Tol hold wages

		// Create Scanner
		Scanner keyboard = new Scanner(System.in);

		// Create new istance of Payroll
		PayrollClass pr = new PayrollClass();
      
      for (int i = 0; i < 7 ; i++ ){
			// Get employee id
			System.out.println();
         System.out.println("Employee ID: " + pr.getEmployeeIdAt(i));
	
         // Get hours
   		System.out.print("Enter the hours worked: ");
   		   hours = keyboard.nextInt();
   		pr.setHoursAt(i, hours);
   		 
		   while (hours < 0){
			// Validate input
         System.out.println("Please enter a positive integer.");
         System.out.print("Enter the hours worked: ");
			 hours = keyboard.nextInt();
			pr.setHoursAt(i, hours);
		   } 

   		// Get pay rate
         System.out.print("Enter the hourly rate: ");
   		   payRate = keyboard.nextDouble();
   		pr.setpayRateAt(i, payRate);
   
   		while (payRate < 6.00){
   		// Validate input
   		System.out.println("Please enter a number greater than 6.00.");
         System.out.println("Enter the hours worked: ");
   		   payRate = keyboard.nextDouble();
         pr.setpayRateAt(i, payRate);
   		}
	   }
		
	   // Calculate gross pay
      pr.GrossPayAt();
		
		for (int i = 0; i < 7 ; i++ ){
			System.out.println();
         System.out.println("Employee ID: " +pr.getEmployeeIdAt(i) 
                               + "\nWages: $" +pr.getWagesAt(i));
		}
	}
}

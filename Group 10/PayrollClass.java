public class PayrollClass
{
	// Fields
	private int[] employeeId = {5658845, 4520124, 7895122,
					                8777541, 8451277, 1302850, 
                               7580489}; // ID array
	private int[] hours = new int[7]; // Hold hours
	private double[] payRate = new double[7]; // Hold pay rate
	private double[] wages = new double[7]; // Hold Wages

   // Methods
   
   // calculate gross pay
	public void GrossPayAt(){
		for (int i = 0; i < employeeId.length; i++ ){
			wages[i] = hours[i] * payRate[i];
		}
	} 
   
   // Set employee Id
	public void setEmployeeIdAt(int i, int employeeId){
		this.employeeId[i] = employeeId;
	}
   
   // Set hours
	public void setHoursAt(int i, int hours){
		this.hours[i] = hours;
	}

   // Set pay rate
	public void setpayRateAt(int i, double payRate){
		this.payRate[i] = payRate;
	}

   // Set wage
	public void setWagesAt(int i, double wages){
		this.wages[i] = wages;
	}

   // Get employee id
	public double getEmployeeIdAt(int i){
		return employeeId[i];
	}
      
   // Get hours
	public double getHoursAt(int i){
		return hours[i];
	}

   // Get pay rate
	public double getpayRateAt(int i){
		return payRate[i];
	}

   // get wages
	public double getWagesAt(int i){
		return wages[i];
	}
}

public class Employee
{
   // Fields
   private String name;
   private int idNumber;
   private String department;
   private String position;
             
   // Constructors
   public Employee(String Name, int ID, String Dept, String Position)
   {
      name = Name;
      idNumber = ID;
      department = Dept;
      position = Position;
   }
          
   public Employee(String Name, int ID)
   {
      name = Name;
      idNumber = ID;
      department = " ";
      position = " ";
   }
             
   public Employee()
   {
      name = " ";
      idNumber = 0;
      department = " ";
      position = " ";
   }
 
   // Methods
   public String getName()
   {
      return name;
   }
             
   public int getIdnumber()
   {
      return idNumber;
   }
             
   public String getDepartment()
   {
      return department;
   }
         
   public String getPosition()
   {
      return position;
   }
}
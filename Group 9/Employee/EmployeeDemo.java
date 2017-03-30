public class EmployeeDemo
{
    public static void main(String[] args)
    {
      //Employee instances
      Employee one = new Employee("Susan Meyers", 47899, "Accounting", "Vice Pres");
      Employee two = new Employee("Mark Jones", 39119, "IT", "Programmer");
      Employee three = new Employee("Joy Rodgers", 81774, "Manufacturing", "Engineer");
         
      System.out.println(" Name           ID Number   Department      Position");
      System.out.println("_______________________________________________________");
      
      System.out.println(" " +one.getName() +"   " +one.getIdnumber() 
                           +"       " +one.getDepartment()
                           +"      " +one.getPosition());
      
      System.out.println(" " +two.getName() +"     " +two.getIdnumber() 
                           +"       " +two.getDepartment()
                           +"              " +two.getPosition());
      
      System.out.println(" " +three.getName() +"    " +three.getIdnumber() 
                          +"       " +three.getDepartment()
                          +"   " +three.getPosition());
    }
}

public class PersonDemo
{
	public static void main (String[] args)
	{ 
      // Instances
		Person one = new Person("Brittnee Costigan", "627 Bernard St, Denton, TX", 24, 2147980);
		Person two = new Person("Emily Powell", "437 Hickory St, Denton, TX", 23, 4206773);
      Person three = new Person("Alexa Reynolds", "378 Houston Pl, Denton, TX", 23, 2142352);
		
             
      System.out.println("Personal Information");
      System.out.println("_______________________________________");
      
      System.out.println("Name: " +one.getName());
      System.out.println("Address: " +one.getAddress()); 
      System.out.println("Age: " +one.getAge());
      System.out.println("Phone Number: " +one.getNumber());
      System.out.println();      
                              
                              
      System.out.println("Name: " +two.getName());
      System.out.println("Address: " +two.getAddress()); 
      System.out.println("Age: " +two.getAge());
      System.out.println("Phone Number: " +two.getNumber());
      System.out.println(); 

      System.out.println("Name: " +three.getName());
      System.out.println("Address: " +three.getAddress()); 
      System.out.println("Age: " +three.getAge());
      System.out.println("Phone Number: " +three.getNumber());
	}
}

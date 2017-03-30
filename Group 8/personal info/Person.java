public class Person
{
   // Fields
   String name, address;
   int age;
   long phoneNumber;
   
   // Constructor
   public Person(String Name, String Address, int Age, long PhoneNumber)
   {
      name = Name;
      address = Address;
      age = Age;
      phoneNumber = PhoneNumber;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getAddress()
   {
      return address;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public long getNumber()
   {
      return phoneNumber;
   }
}
public class RetailItem
{
   // Fields
   private String description;
   private int unitsOnHand;
   private double price;
             
   // Constructors
   public RetailItem(String Description, int UnitsOnHand, double Price)
   {
      description = Description;
      unitsOnHand = UnitsOnHand;
      price = Price;
   }

   // Methods
   public String getDescription()
   {
      return description;
   }
             
   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }
             
         
   public double getPrice()
   {
      return price;
   }
}
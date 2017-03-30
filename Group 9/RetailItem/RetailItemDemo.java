public class RetailItemDemo
{
    public static void main(String[] args)
    {
      //Employee instances
      RetailItem one = new RetailItem("Jacket", 12, 59.95);
      RetailItem two = new RetailItem("Designer Jeans", 40, 34.95);
      RetailItem three = new RetailItem("Shirt", 20, 24.95);
         
      System.out.println("           Description      Units on Hand      Price");
      System.out.println("_____________________________________________________");
      
      System.out.println("Item #1    " +one.getDescription() 
                              +"                 " +one.getUnitsOnHand() 
                              +"           " +one.getPrice());
      
      System.out.println("Item #2    " +two.getDescription() 
                              +"         " +two.getUnitsOnHand() 
                              +"           " +two.getPrice());
      
      System.out.println("Item #3    " +three.getDescription() 
                              +"                  " +three.getUnitsOnHand() 
                              +"           " +three.getPrice());
    }
}

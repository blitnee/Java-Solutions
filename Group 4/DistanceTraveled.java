//This program demonstartes while loops and calculating vehicle travel distance

import java.util.Scanner;  // calls in scanner

public class DistanceTraveled
{
   public static void main(String[] args)
   {
      int speed;  // speed of vechicle
      int hours;  // hours spent driving
      int count;  // holds count
          

      // creates new instance of scanner
      Scanner keyboard = new Scanner(System.in);
      
      // gets speed
      System.out.print("What is the speed of your vehicle (in mph)?");
      speed = keyboard.nextInt();
      
      // gets hours
      System.out.print("How many hours has your vehicle been traveling?");
      hours = keyboard.nextInt();
      
      // table format
      System.out.println("Hours   Distance Traveled");
      System.out.println("-----------------------");
      
      /*
      // for loop demo
      for (count = 1; count <= hours; count++)
      {
            
      // calculation and print
      System.out.println(count + "\t\t" + (count * speed));
      }
      */
      
      // while loop
      count = 1;
      while (count <= hours){
         System.out.println(count + "\t\t" + (count * speed));
         count = count + 1;
      }
            System.exit(0);
   }
}

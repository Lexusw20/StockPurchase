import java.util.Scanner;
import java.text.DecimalFormat;


// CST150LWHW9BikeRentalsSim  CST150-01   LEXUS WASHINGTON  4/19/2018



public class BikeManager
{
   public static void main(String[] args)
   {
      int bikesToRent;  // bike.
      int rate =10;
      int hours;
      
      Bike bikeToRent = new Bike("Rent", rate);
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a DecimalFormat object to format numbers
      // as dollar amounts.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");
      
      // Display the current rental price for a hour.
      System.out.println("Your rental price is currently $"
                  + dollar.format(bikeToRent.getRentalPrice())
                  + " per hour.");
                         
      // Get the number of hours.
      System.out.print("How many hours would you like to rent? ");
      hours = keyboard.nextInt();
      
      
      // Create a BikeRental transaction.
      BikeRental buy =
               new BikeRental(bikeToRent, hours);
      
      // Display the cost of the transaction.
      System.out.println("Cost of rental: $"
                         + dollar.format(buy.getCost()));
   }
}


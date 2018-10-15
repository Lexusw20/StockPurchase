/**
   The Bike class holds data about the rental.
*/

public class Bike
{
   private String biketype;     // Trading biketype of stock
   private double rentalPrice; // Current price per share
   private double startPrice;
   
   /**
      Constructor
      @param sym The rate for the biketype.
      @param price The bikes.
   */

   public Bike(String sym, double price)
   {
      biketype = sym;
      rentalPrice = price;
   }
   
   /**
   	Copy constructor
		@param Regular The bike to copy.
   */
   
   public Bike(Bike Regular)
   {
      biketype = Regular.biketype;
      rentalPrice = Regular.rentalPrice;
   }
   
   /**
      getSymbol method
      @return The bike rental type.
   */
   
   public String getBiketype()
   {
      return biketype;
   }
   
   /**
      getSharePrice method
      @return The rental start time price
   */
   
   public double getStartTime()
   {
      return startPrice;
   }
   
   
   public double getRentalPrice()
   {
      return rentalPrice;
   }

   /**
      toString method
      @return A string indicating the bike's
              type biketype and rent price.
   */
   
   public String toString()
   {
      // Create a string describing the stock.
      String str = "Trading symbol: " + biketype +
                   "\n price: " + rentalPrice +
              "\n Start Time: " + startPrice;
      
      // Return the string.
      return str;
   }

   /**
      The equals method compares two Bike objects.
      @param object2 A Bike object to compare to the
                     calling Bike object.
      @return true if the argument object is equal to
                   the calling object.
   */

   public boolean equals(Bike object2)
   {
      boolean status;
      
      // Determine whether this object's biketype and
      // rentalPrice fields are equal to object2's
      // biketype and rentalPrice fields.
      if (biketype.equals(object2.biketype) &&
          rentalPrice == object2.rentalPrice)
         status = true;  // Yes, the objects are equal.
      else
         status = false; // No, the objects are not equal.
      
      // Return the value in status.
      return status;
   }

   /**
      The copy method makes a copy of a Bike object.
      @return A reference to a copy of the calling object.
   */

   public Bike copy()
   {
      // Create a new Bike object and initialize it
      // with the same data held by the calling object.
      Bike copyObject = new Bike(biketype, rentalPrice);
      
      // Return a reference to the new object.
      return copyObject;
   }
}
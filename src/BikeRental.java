/**
   The BikeRental class represents a rate to rent.
*/

public class BikeRental
{
   private Bike rate;  // The rate to rent
   private int hours;   // Number of hours rented

   /**
      Constructor
      @param rateObject The rate to rent.
      @param numhours The number of hours.
   */

   public BikeRental(Bike rateObject, int numhours)
   {
      
      rate = new Bike(rateObject);
      hours = numhours;
   }
   
   /**
      getBike method
      @return A copy of the Bike for the rate
              being rented.
   */
   
   public Bike getBike()
   {
      // Return a copy of the rental referenced by rate.
      return new Bike(rate);
   }
   
   /**
      getRentalRate method
      @return The number of hours being purchased.
   */
   
   public int getRentalRate()
   {
      return hours;
   }

   /**
      getCost method
      @return The cost of the rate purchase.
   */
   
   public double getCost()
   {
      return hours * rate.getRentalPrice();
   }
}

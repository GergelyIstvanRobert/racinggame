package org.fasttrackit;

/**
 * Hello world!
 *
 */
public class App
{
    //one line comment

    public static void main( String[] args )
    {
        System.out.println( "Welcome to the Racing Game" );

       Car carReference = new Car();
       carReference.name = "Dacia";
       carReference.color = "Red";
       carReference.mileage = 9.8;
       carReference.fuelLevel = 60;
       carReference.maxSpeed = 200;
       carReference.running = false;
       carReference.doorCount = 2;

       Engine carengine = new Engine();
       carengine.manufacturer = "Renault";
       carengine.capacity = 1.5;

       carReference.engine = carengine;

        System.out.println("Engine details...");
        System.out.println(carReference.engine.manufacturer);
        System.out.println(carReference.engine.capacity);

        double accelerationDistance = carReference.accelerate(60,1);
        System.out.println("Acceleration distance: " + accelerationDistance);

        Mechanic mechanic = new  Mechanic ();
        mechanic.repairVehicle(carReference);

        System.out.println("Total traveled distance after repair : " + carReference.traveledDistance);


       Car car2 = new Car();
       car2.name = "BMW";
       car2.mileage = 14;
       car2.color = null;

       //concatenation
        System.out.println(carReference);
        System.out.println("First car name: "+ carReference.name);
        System.out.println(carReference.color);
        System.out.println(carReference.mileage);
        System.out.println(carReference.fuelLevel);
        System.out.println(carReference.doorCount);
        System.out.println(carReference.maxSpeed);
        System.out.println(carReference.running);
        System.out.println(carReference.traveledDistance);

        System.out.println("Second car name: "+ car2.name);
        System.out.println(car2.mileage);
        System.out.println(car2.fuelLevel);
        System.out.println(car2.doorCount);
        System.out.println(car2.maxSpeed);
        System.out.println(car2.running);
        System.out.println(car2.traveledDistance);

         car2.name = "VW";
        System.out.println(car2.name);

        Car car3 = car2;
        car3.name = "Audi";

        System.out.println("car2 name: "+ car2.name);
        System.out.println("car3 name: "+ car3.name);

//    example for NullPointerEXception
//     car car4 = null;
//     System.out.println("car4.name")









    }
}

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

        Game game = new Game();
        game.start();




//        //method implementation taken from object class,not from variable class
//
//        Vehicle joker = new JokerVehicle();
//        joker.setName("Joker");
//        joker.setFuelLevel(80);
//
//        joker.accelerate(60,1);
//        System.out.println("Joker distance : " + joker.getTraveledDistance());
//
//        //variable class determines what methods can be invoked type casting
//        ((JokerVehicle) joker).fly();
//
//        Car carWhitdefaultEngine = new Car();
//
//        Engine carEngine = new Engine();
//        carEngine.manufacturer = "Renault";
//        carEngine.capacity = 1.5;
//
//       Car carReference = new Car(carEngine);
//       carReference.setName("Dacia");
//       carReference.setColor("Red");
//       carReference.setMileage(9.8);
//       carReference.setFuelLevel(60);
//       carReference.setMaxSpeed(200);
//       carReference.setRunning(false);
//       carReference.doorCount = 2;
//
//
//
//       carReference.engine = carEngine;
//
//        System.out.println("Engine details...");
//        System.out.println(carReference.engine.manufacturer);
//        System.out.println(carReference.engine.capacity);
//
//        double accelerationDistance = carReference.accelerate(60,1);
//        System.out.println("Acceleration distance: " + accelerationDistance);
//
//        Mechanic mechanic = new  Mechanic ();
//        mechanic.repairVehicle(carReference);
//
//        System.out.println("Total traveled distance after repair : " + carReference.getTraveledDistance());
//
//        Engine car2Engine = new Engine();
//        car2Engine.manufacturer = "Bavaria Motors";
//        car2Engine.capacity = 12.2;
//
//
//       Car car2 = new Car(car2Engine);
//       car2.setName("BMW");
//       car2.setMileage(14);
//       car2.setColor(null);
//
//       //concatenation
//        System.out.println(carReference);
//        System.out.println("First car name: "+ carReference.getName());
//        System.out.println(carReference.getColor());
//        System.out.println(carReference.getMileage());
//        System.out.println(carReference.getFuelLevel());
//        System.out.println(carReference.doorCount);
//        System.out.println(carReference.getMaxSpeed());
//        System.out.println(carReference.isRunning());
//        System.out.println(carReference.getTraveledDistance());
//
//        System.out.println("Second car name: "+ car2.getName());
//        System.out.println(car2.getMileage());
//        System.out.println(car2.getFuelLevel());
//        System.out.println(car2.doorCount);
//        System.out.println(car2.getMaxSpeed());
//        System.out.println(car2.isRunning());
//        System.out.println(car2.getTraveledDistance());
//
//         car2.setName("VW");
//        System.out.println(car2.getName());
//
//        Car car3 = car2;
//        car3.setName("Audi");
//
//        System.out.println("car2 name: "+ car2.getName());
//        System.out.println("car3 name: "+ car3.getName());
//
//        System.out.println("Modulo example: ");
//        System.out.println(4 % 2);
//        System.out.println(4 % 3);
//        System.out.println(4 % 2 == 0);
//
////    example for NullPointerEXception
////     car car4 = null;
////     System.out.println("car4.name")
//
//        System.out.println("studynimg class variables (static variables)...");
//        Vehicle vehicle1 = new Vehicle();
//        vehicle1.totalCount = 10 ;
//
//         Vehicle vehicle2 = new Vehicle();
//         vehicle2.totalCount = 20;
//
//          Vehicle.totalCount = 30;
//
//        System.out.println("Total vehicle count from vehicle1: " + vehicle1.totalCount);
//        System.out.println("Total vehicle count from vehicle2: " + vehicle2.totalCount);
//        System.out.println("Total vehicle count from Vehicle class: " + vehicle1.totalCount);











    }
}

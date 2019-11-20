package org.fasttrackit;

public class Vehicle {

//    class variable
    static int totalCount;

//  instance variables
    String name;
    String color;
    double mileage;
    double maxSpeed;
    double fuelLevel;
    double traveledDistance;
    boolean running;
    public Vehicle () {
        totalCount++;
    }

    public double accelerate(double speed,double durationInHours) {
        System.out.println(name + " is accelerating whit " + speed + "for" + durationInHours + "h.");
//        local variables


        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
//      same result as the statmement above
//        traveledDistance += distance
        System.out.println("Total traveled distnace: " + traveledDistance);

        double usedFuel = distance * mileage / 100;
        System.out.println("Used fuel: " + usedFuel);
        fuelLevel -= usedFuel;
        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;
    }
}

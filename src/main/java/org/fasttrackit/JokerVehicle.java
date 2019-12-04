package org.fasttrackit;

public class JokerVehicle extends Vehicle {

    @Override
    public double accelerate(double speed, double durationInHours) {
        System.out.println(getName() + " is accelerating whit " + speed + "for" + durationInHours + "h.");

        double distance = 2 * speed * durationInHours;

        setTraveledDistance(getTraveledDistance() + distance);
        System.out.println("Cheating! HA,HA...");
        return distance;
    }
    //Co-variant return type
    //accesss cannot be more restrictive than in the parent class
    public JokerVehicle clone() {
         return new JokerVehicle();
    }
    //return  new JokerVehicle ();
    public void fly () {
        System.out.println("Flying!!!");
    }
}

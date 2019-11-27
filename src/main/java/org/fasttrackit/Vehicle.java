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

    public Vehicle() {
        totalCount++;
    }

    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier =1;
        System.out.println(name + " is accelerating whit " + speed + "for" + durationInHours + "h.");

        if (speed > maxSpeed) {
            System.out.println("Sorry Maximum speed exceeded.");
            return 0;

        } else if (speed == maxSpeed) {
            System.out.println("Careful! Max speed reached.");

        } else {
            System.out.println("Valid speed entered.");
        }
        if (fuelLevel <= 0) {
            System.out.println("You don`t have enough fuel");
            return  0;
        }

        if (speed > 120){
            System.out.println("Going fast ... you`ll use more fuel.");

//            increasing mileage multiplier whit whit percentage of acceleration`speed
            mileageMultiplier = speed/100;
        }


//        local variables

        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
//      same result as the statmement above
//        traveledDistance += distance
        System.out.println("Total traveled distnace: " + traveledDistance);

        double usedFuelWhitStandardMileage = distance * mileage / 100;
        System.out.println("Used fuel whit standrad mileage: " + usedFuelWhitStandardMileage);

        double usedFuelWhitCurrentMileage= usedFuelWhitStandardMileage * mileageMultiplier;
        System.out.println("Used fuel whit current mileage: " + usedFuelWhitCurrentMileage);
        fuelLevel -= usedFuelWhitCurrentMileage;
        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;
    }
}

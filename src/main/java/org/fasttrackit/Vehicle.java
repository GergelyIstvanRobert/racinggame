package org.fasttrackit;

public class Vehicle {

//    class variable

    static int totalCount;

//  instance variables

    private String name;
    private String color;
    private double mileage;
    private double maxSpeed;
    private double fuelLevel;
    private double traveledDistance;
    private boolean running;

    public Vehicle() {
        totalCount++;
    }
//    method overloading
       public double accelerate (double speed) {
        return accelerate(speed,1)  ;

       }
    public double accelerate(double speed, double durationInHours) {
        double mileageMultiplier = 1;
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
            return 0;
        }

        if (speed > 120) {
            System.out.println("Going fast ... you`ll use more fuel.");

//            increasing mileage multiplier whit whit percentage of acceleration`speed
            mileageMultiplier = speed / 100;
        }


//        local variables

        double distance = speed * durationInHours;

        traveledDistance = traveledDistance + distance;
//      same result as the statmement above
//        traveledDistance += distance
        System.out.println("Total traveled distnace: " + traveledDistance);

        double usedFuelWhitStandardMileage = distance * mileage / 100;
        System.out.println("Used fuel whit standrad mileage: " + usedFuelWhitStandardMileage);

        double usedFuelWhitCurrentMileage = usedFuelWhitStandardMileage * mileageMultiplier;
        System.out.println("Used fuel whit current mileage: " + usedFuelWhitCurrentMileage);
        fuelLevel -= usedFuelWhitCurrentMileage;
        System.out.println("Remaining fuel level: " + fuelLevel);

        return distance;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getTraveledDistance() {
        return traveledDistance;
    }

    public void setTraveledDistance(double traveledDistance) {
        this.traveledDistance = traveledDistance;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", mileage=" + mileage +
                ", maxSpeed=" + maxSpeed +
                ", fuelLevel=" + fuelLevel +
                ", traveledDistance=" + traveledDistance +
                ", running=" + running +
                '}';
    }
}
